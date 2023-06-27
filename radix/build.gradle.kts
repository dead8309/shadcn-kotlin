import com.varabyte.kobweb.gradle.core.kmp.kotlin
import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kobweb.library)
}

group = "radix.ui"
version = "1.0.0"

kotlin {
    configAsKobwebLibrary(includeServer = false)
    sourceSets {
        fun kotlinw(target: String): String =
            "org.jetbrains.kotlin-wrappers:kotlin-$target"

        val kotlinWrappersVersion = "1.0.0-pre.572"
        val jsMain by getting {
            dependencies {
                implementation(enforcedPlatform(kotlinw("wrappers-bom:$kotlinWrappersVersion")))
                implementation(kotlinw("react"))
                implementation(kotlinw("react-dom"))
                implementation(npm("@lshay/ui","0.0.6"))
            }
        }
    }
}