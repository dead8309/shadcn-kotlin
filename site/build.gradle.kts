
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "org.example.kobwebreaxttailwind"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
        }
    }
}

kotlin {
    configAsKobwebApplication("kobwebreaxttailwind", includeServer = true)
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }

    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        fun kotlinw(target: String): String =
            "org.jetbrains.kotlin-wrappers:kotlin-$target"

        val kotlinWrappersVersion = "1.0.0-pre.572"

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation("org.jetbrains.kotlin-wrappers:kotlin-extensions:1.0.1-pre.256-kotlin-1.5.31")

                implementation(enforcedPlatform(kotlinw("wrappers-bom:$kotlinWrappersVersion")))
                implementation(kotlinw("react"))
                implementation(kotlinw("react-dom"))
                implementation(npm("@lshay/ui","0.0.6"))
                implementation(devNpm("lucide-react","0.215.0"))

                implementation(devNpm("@babel/core","7.22.5"))
                implementation(devNpm("babel-loader","9.1.2"))
                implementation(devNpm("@babel/preset-react","7.22.5"))
                implementation(devNpm("@babel/preset-env","7.22.5"))
                implementation(devNpm("@babel/preset-typescript","7.22.5"))
                implementation(kotlinw("typescript"))

                implementation(devNpm("tailwindcss", "3.3.2"))
                implementation(npm("tailwindcss-animate","1.0.5"))
                implementation(devNpm("postcss", "8.4.8"))
                implementation(devNpm("autoprefixer", "10.4.2"))
                implementation(npm("style-loader", "2.0.0"))
                implementation(npm("css-loader", "5.2.7"))
                implementation(devNpm("postcss-loader", "4.3.0"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
            }
        }
    }
}

val jsWorkspace = "${rootProject.buildDir}/js"
val jsProjectDir = "$jsWorkspace/packages/${rootProject.name}"

val kotlinNodeJsSetup by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask::class)
val kotlinNpmInstall by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask::class)

val jsProductionExecutableCompileSync by tasks.getting(Task::class)



val configureTailwind by tasks.registering(Copy::class) {
    description = "Copies the Tailwind configuration file to the build directory"

    from("./tailwind.config.js")
    into(jsProjectDir)

    dependsOn(kotlinNpmInstall)
}

val configurePostcss by tasks.registering(Copy::class) {
    description = "Copies the PostCSS configuration file to the build directory"

    from("./postcss.config.js")
    into(jsProjectDir)

    dependsOn(kotlinNpmInstall)
}

val jsDevelopmentExecutableCompileSync: Task by tasks.getting {
    dependsOn(
        configureTailwind,
        configurePostcss,
    )
}

val production by tasks.registering(Exec::class) {
    description = "Compiles the production web demo"

    workingDir = file(jsProjectDir)

    dependsOn(
        kotlinNodeJsSetup,
        kotlinNpmInstall,
        configureTailwind,
        configurePostcss,
        jsProductionExecutableCompileSync
    )
}

tasks.getByName("kobwebStart").dependsOn(configureTailwind,configurePostcss)
tasks.getByName("kobwebExport").dependsOn(configureTailwind,configurePostcss)

tasks.withType(KotlinWebpack::class.java).forEach { t ->
    t.inputs.files(fileTree("src/jsMain/resources"))
}