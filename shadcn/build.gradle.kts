import com.varabyte.kobweb.gradle.core.kmp.kotlin
import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kobweb.library)
}

group = "shadcn.ui"
version = "1.0.0"

kotlin {
    configAsKobwebLibrary(includeServer = false)
    sourceSets {
        val jsMain by getting {
            dependencies {
               implementation(projects.radix)
            }
        }
    }
}