plugins {
    alias(libs.plugins.kotlin.multiplatform)
    `library-publication`
}

group = "io.github.dead8309"
version = libs.versions.library.version.get()

kotlin {
    js(IR) {
        browser {  }
    }
    sourceSets {
        @Suppress("UNUSED_VARIABLE")
        val jsMain by getting {
            dependencies {
                implementation(libs.kotlin.wrappers.react)
                implementation(libs.kotlin.wrappers.react.dom)
                implementation(npm("@lshay/ui","0.0.6"))
                implementation(npm("tailwindcss-animate","1.0.5"))
            }
        }
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                name.set("radix-kotlin")
                description.set("radix-ui wrapper for KotlinJs")
            }
        }
    }
}
