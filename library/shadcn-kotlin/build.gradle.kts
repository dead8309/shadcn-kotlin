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
                implementation(project(":library:radix-kotlin"))
            }
        }
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                name.set("shadcn-kotlin")
                description.set("Shadcn/ui wrapper for KotlinJs")
            }
        }
    }
}
