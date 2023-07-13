
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import com.varabyte.kobwebx.gradle.markdown.MarkdownHandlers.Companion.HeadingIdsKey
import com.varabyte.kobwebx.gradle.markdown.NodeScope
import com.varabyte.kobwebx.gradle.markdown.children
import kizzy.tailwind.utils.setupTailwindProject
import kotlinx.html.meta
import org.commonmark.node.Code
import org.commonmark.node.Heading
import org.commonmark.node.HtmlBlock
import org.commonmark.node.Text
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

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
val SHAD = "shadcn.ui.components"

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
            }
        }
    }
    markdown {
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
            table.set { "example.shadcn_kotlin.ui.components.mdTable" }
            tr.set { "$JB_DOM.Tr({ ${Styles.tr} })" }
            th.set { "$JB_DOM.Th({ ${Styles.th} })" }
            td.set { "$JB_DOM.Td({ ${Styles.td} })" }
            code.set { code ->
                "example.shadcn_kotlin.ui.components.CodeBlock(\"\"\"${code.literal.escapeTripleQuotedText()}\"\"\", lang = ${
                    code.info.takeIf { it.isNotBlank() }?.let { "\"$it\"" }
                })"
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
                println(SRC)
                if (tag.literal.startsWith("<CP"))
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
                implementation(project(":library:shadcn-kotlin"))
                implementation(libs.kobwebx.markdown)

            }
        }
    }
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

fun getHeadingClassNameFromLevel(level: Int) = when (level) {
    1 -> cn("font-heading mt-2 scroll-m-20 text-4xl font-bold")
    2 -> cn("font-heading mt-12 scroll-m-20 border-b pb-2 text-2xl font-semibold tracking-tight first:mt-0")
    3 -> cn("font-heading mt-8 scroll-m-20 text-xl font-semibold tracking-tight")
    4 -> cn("font-heading mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
    5 -> cn("mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
    6 -> cn("mt-8 scroll-m-20 text-base font-semibold tracking-tight")
    else  -> ""
}

fun cn(className: String) = buildString {
        append("classes(")
        className.split(" ")
            .forEachIndexed { index, it ->
                if (index == 0) {
                    append("\"$it\"")
                } else append(",\"$it\"")
            }
        append(")")
    }

val SRC = "src.jsMain.kotlin.$group"

fun handleComponentPreview(tag: HtmlBlock): String {
   val composable = group.toString() + tag.literal.substringAfter("c=\"").substringBefore("()\"")
    val codePath = (SRC + tag.literal.substringAfter("file=\"").substringBefore("\"")).replace(".","/")
    var content = projectDir.resolve("$codePath.kt").readText()
    val importIndex = content.indexOf("import")
    if (importIndex == -1) {
        return ""
    }
    content = content.substring(importIndex)
    return buildString {
        append(composable)
        append("(\"\"\"$content\"\"\")")
    }
}
