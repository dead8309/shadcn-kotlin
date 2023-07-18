package example.shadcn_kotlin.ui.docs.dark_mode

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.docs.Constants
import example.shadcn_kotlin.ui.components.CodeBlock
import example.shadcn_kotlin.ui.components.ComponentPreview
import example.shadcn_kotlin.ui.components.Steps
import example.shadcn_kotlin.ui.components.ThemeToggle
import example.shadcn_kotlin.ui.docs.index.p
import example.shadcn_kotlin.ui.theme.ThemeProvider
import react.create
import react.dom.html.ReactHTML.code
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.p

@Composable
fun DarkModeSteps(code: String) {
    Steps {
        h3 {
            className = Constants.MDStyles.h3
            + "Add next-themes"
        }
        p {
            className = Constants.MDStyles.p
            + "Add "
            code {
                className = Constants.MDStyles.inline_code
                + "next-themes"
            }
            + " npm library in your build.gradle"
        }
        CodeBlock {
            lang = "kts"
            value = "implementation(npm(\"next-themes\",\"0.2.1\"))"
        }
        h3 {
            className = Constants.MDStyles.h3
            + "Create a theme provider"
        }
        p("Create external declarations for next-themes ") {
            it.apply {
                code {
                    className = Constants.MDStyles.inline_code
                    + "ThemeProvider"
                }
                + "."
            }
        }
        CodeBlock {
            lang = "kt"
            value = Constants.Configs.themeProvider
        }
        h3 {
            className = Constants.MDStyles.h3
            + "Wrap your root layout"
        }
        p("Add the ") {
            it.apply {
                code {
                    className = Constants.MDStyles.inline_code
                    + "ThemeProvider"
                }
                + " to your root layout."
            }
        }
        CodeBlock {
            lang = "kt"
            value = Constants.Configs.themeProviderWrappedLayout
        }
        h3 {
            className = Constants.MDStyles.h3
            + "Add a mode toggle"
        }
        p("Place a mode toggle on your site to toggle between light and dark mode.")
        ComponentPreview {
            component = div.create {
                ThemeProvider {
                    ThemeToggle {}
                }

            }
            this.code = code
            this.lang = "kt"
        }
    }
}