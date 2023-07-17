
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import com.varabyte.kobwebx.gradle.markdown.MarkdownHandlers.Companion.HeadingIdsKey
import com.varabyte.kobwebx.gradle.markdown.NodeScope
import com.varabyte.kobwebx.gradle.markdown.children
import kizzy.tailwind.utils.setupTailwindProject
import kotlinx.html.link
import kotlinx.html.meta
import kotlinx.html.script
import org.commonmark.node.Code
import org.commonmark.node.Heading
import org.commonmark.node.HtmlBlock
import org.commonmark.node.Text
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.tailwind.kt)
    alias(libs.plugins.kobwebx.markdown)
}

group = "example.shadcn_kotlin.ui"
version = "1.0.0"

val JB_DOM = "org.jetbrains.compose.web.dom"

kobweb {
    app {
        index {
            description.set("Kotlin wrapper for shadcn/ui")
            head.add {
                meta("og:image", "/og.png",)
                meta(name = "og:site_name", content = "Shadcn-Kotlin")
                meta(name = "og:type", content = "website")
                meta(name = "twitter:site", content = "Shadcn-Kotlin")
                meta(name = "twitter:title", content = "Shadcn-Kotlin")
                meta(name = "twitter:description", content = "Showcasing Kotlin wrapper for shadcn/ui")
                meta(name = "twitter:card", content = "summary_large_image")
                meta(name = "twitter:image:src", content = "/og.png")
                link(href = "/prismjs/prism.css", rel="stylesheet")
                script {
                    src = "/prismjs/prism.js"
                }
            }
        }
    }
    markdown {
        imports.add(".components.*")

        handlers {
            heading.set {
                this.setupHeadingTags(idGenerator,it)
            }
            a.set { "$JB_DOM.A(\"${it.destination}\", { ${Styles.a} })" }
            p.set { "$JB_DOM.P({ ${Styles.p} })" }
            ul.set { "$JB_DOM.Ul({ ${Styles.ul} })" }
            ol.set { "$JB_DOM.Ol({ ${Styles.ol} })" }
            li.set { "$JB_DOM.Li({ ${Styles.li} })" }
            blockquote.set {
                "com.varabyte.kobweb.compose.dom.GenericTag(\"blockquote\",\"${Styles.blockquote}\")"
            }
            img.set { img ->
                val altText = img.children()
                    .filterIsInstance<Text>()
                    .map { it.literal.escapeSingleQuotedText() }
                    .joinToString("")
                this.childrenOverride = emptyList()

                """$JB_DOM.Img("${img.destination}", "$altText", { ${Styles.img} })"""
            }
            hr.set { "$JB_DOM.Hr({ ${Styles.hr} })" }
            table.set { "mdTable" }
            tr.set { "$JB_DOM.Tr({ ${Styles.tr} })" }
            th.set { "$JB_DOM.Th({ ${Styles.th} })" }
            td.set { "$JB_DOM.Td({ ${Styles.td} })" }
            code.set { code ->
                val highlight = code.info
                    .takeIf { "{" in it }
                    ?.substringAfter("{","")
                    ?.substringBefore("}","") ?: ""

                val title = code.info
                    .takeIf { "title=" in it }
                    ?.substringAfter("=\"","")
                    ?.substringBefore("\"","")

                println(highlight)
                buildString {
                    append("CodeBlock(")
                    append("\"\"\"${code.literal.escapeTripleQuotedText()}\"\"\",")
                    append(" lang= ${code.info.takeIf { it.isNotBlank() }?.let { "\"${it.substringBefore(" ")}\"" }},")
                    append(" highlight= \"$highlight\"")
                    if (title != null) {
                        append(", title= \"$title\"")
                    }
                    append(")")
                }
            }
            inlineCode.set { code ->
                childrenOverride = listOf(Text(code.literal))
                "$JB_DOM.Code({ ${Styles.inline_code} })"
            }
            val baseRawTagHandler = rawTag.get()
            rawTag.set { tag ->
                println("Raw tag handler got: $tag")
                baseRawTagHandler.invoke(this, tag)
            }
            val baseHtmlTagHandler = html.get()
            html.set { tag ->
                println("Html tag handler got: ${tag.literal}")
                if (tag.literal.startsWith("<CodeComponent")) {
                    handleCodeComponent(tag)
                } else if (tag.literal.startsWith("<ComponentPreview"))
                    handleComponentPreview(tag)
                else
                    baseHtmlTagHandler.invoke(this, tag)
            }
        }
    }
}


kotlin {
    configAsKobwebApplication("shadcn-kt", includeServer = false)
    setupTailwindProject()
    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation("io.github.dead8309:lucide-kotlin:1.0.0")
                babel()
                implementation(npm("next-themes","0.2.1"))
                implementation(devNpm("cssnano","6.0.1"))
                implementation(project(":library:shadcn-kotlin"))
                implementation(libs.kobwebx.markdown)

            }
        }
    }
}

tasks.withType<KotlinWebpack>().forEach { t ->
    t.inputs.files(fileTree("src/jsMain/resources"))
}

private val  KotlinDependencyHandler.babel: () -> Dependency?
    get() = {
            implementation(devNpm("@babel/core","7.22.5"))
            implementation(devNpm("babel-loader","9.1.2"))
            implementation(devNpm("@babel/preset-react","7.22.5"))
            implementation(devNpm("@babel/preset-env","7.22.5"))
            implementation(devNpm("@babel/preset-typescript","7.22.5"))
    }

fun NodeScope.setupHeadingTags(idGenerator: Property<(String) -> String>, heading: Heading): String {
    val head = "org.jetbrains.compose.web.dom"
    val text = heading.children()
        .mapNotNull { node ->
            when (node) {
                is Text -> node.literal
                is Code -> node.literal
                else -> null
            }
        }
        .joinToString("")
    val headingIds = data.computeIfAbsent(HeadingIdsKey) { mutableMapOf() }
    val id = run {
        val baseId = idGenerator.get().invoke(text)
        var currId = baseId
        var count = 2
        while (headingIds.containsValue(currId)) {
            currId = "$baseId-$count"
            ++count
        }
        currId
    }
    headingIds[heading] = id

    return buildString {
        append("$head.H${heading.level}({ ")
        appendLine()
        append(getHeadingClassNameFromLevel(heading.level))
        appendLine()
        append("id(\"$id\")")
        appendLine()
        append(" })")
    }
}

fun handleComponentPreview(tag: HtmlBlock): String {
    val composable = "ComponentPreview"
    val (component, content) = getComponentAndFileContent(tag)
    return buildString {
        append(composable)
        append("(\"\"\"$content\"\"\")")
        append("{ \n $component \n }")
    }
}

fun handleCodeComponent(tag: HtmlBlock): String {
    val (component, content) = getComponentAndFileContent(tag)
    return buildString {
        append(component)
        append("(\"\"\"$content\"\"\")")
    }
}

fun getComponentAndFileContent(tag: HtmlBlock) : ComponentAndFileResult {
    var component = tag.literal
        .substringAfter("component=\"")
        .substringBefore("\"")
    if (component.startsWith(".")) {
        component = group.toString() + component
    }
    val file = tag.literal
        .substringAfter("file=\"")
        .substringBefore("\"")
    var content = getFileContents(file)
    content = content.substring(content.indexOf("import"))

    return ComponentAndFileResult(
        component = component,
        fileContent = content
    )
}

data class ComponentAndFileResult(
    val component: String,
    val fileContent: String,
)

fun getAllFiles(dir: File): List<File> {
    val files = mutableListOf<File>()
    dir.listFiles()?.forEach {
        if (it.isFile)
            files.add(it)
        else
            files.addAll(getAllFiles(it))
    }
    return files.toList()
}

fun getFileContents(file: String): String {
    val files = getAllFiles(projectDir.resolve("src/jsMain/kotlin/example/shadcn_kotlin/ui"))
    return files
        .find { file == it.nameWithoutExtension }
        ?.readText() ?: ""
}
