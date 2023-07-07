
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kizzy.tailwind.utils.setupTailwindProject
import kotlinx.html.meta
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.tailwind.kt)
}

group = "org.example.kobwebreaxttailwind"
version = "1.0-SNAPSHOT"


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

