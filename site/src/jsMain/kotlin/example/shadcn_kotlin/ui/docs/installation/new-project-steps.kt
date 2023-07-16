package example.shadcn_kotlin.ui.docs.installation

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.Constants
import example.shadcn_kotlin.ui.components.CodeBlock
import example.shadcn_kotlin.ui.components.Steps
import example.shadcn_kotlin.ui.docs.index.a
import example.shadcn_kotlin.ui.docs.index.p
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.strong

// Note to self: Don't Edit this page every once its published
@Composable
fun NewProjectSteps() {
    Steps {
        h3 {
            className = Constants.MDStyles.h3
            + "Create a new project"
        }
        p("Use the Kobweb CLI to create a new project.")
        CodeBlock {
            lang = "bash"
            value = "kobweb create app"
        }
        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Add ${Constants.TailwindKt.name} Plugin"
        }
        p("Apply "){
            it.apply {
                a(Constants.TailwindKt.name,Constants.TailwindKt.repo)
                + " plugin to add Tailwind CSS support to your project."
            }
        }
        CodeBlock {
            lang = "kts"
            value = Constants.TailwindKt.implementation
        }
        p("Run the site through kobeweb cli once so tailwind-kt can generate all the necessary files")
        CodeBlock {
            lang = "bash"
            value = "kobweb run"
        }
        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Add ${Constants.ShadcnKotlin.name} dependency"
        }
        p {
            className = Constants.MDStyles.p
            + "Add "
            a(Constants.ShadcnKotlin.name,Constants.ShadcnKotlin.repo)
            + " library which adds all the components to your project."
        }
        CodeBlock {
            lang = "kts"
            value = Constants.ShadcnKotlin.implementation
        }
        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Add ${Constants.Babel.name} dependencies"
        }
        CodeBlock {
            lang = "kts"
            value = Constants.Babel.implementation
        }
        p("This will fix the webpack loader issues")

        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Configure tailwind.config.js"
        }
        p("This is what this project's ") {
            it.apply {
                strong { + "tailwind.config.js"}
                + "  file looks like:"
            }
        }
        CodeBlock {
            lang = "js"
            value = Constants.Configs.tailwindConfigJs
        }

        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Configure Styles"
        }
        p("Feel free to add or modify as needed to suit your project.")
        p("Add the following to your "){
            it.apply {
                strong { + "src/jsMain/resources/globals.css"}
                + " file."
            }
        }
        CodeBlock {
            lang = "css"
            value = Constants.Configs.css
        }

        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Import styles to your app"
        }
        p("Add the following in your ") {
            it.apply {
                strong { + "PageLayout" }
                + " composable."
            }
        }
        CodeBlock {
            lang = "kt"
            value = Constants.Configs.pageLayout
        }

        // <!----------------------------------------------------------------------->
        h3 {
            className = Constants.MDStyles.h3
            + "Configure Babel Loader"
        }
        p("Create a file ") {
            it.apply {
                strong { + "babel-loader.config.js" }
                + " in your "
                strong { + "webpack.config.d" }
                + " folder"
            }
        }
        p("Add the following contents to the file")
        CodeBlock {
            lang = "js"
            value = Constants.Configs.babelLoader
        }
        // <!----------------------------------------------------------------------->
    }
}