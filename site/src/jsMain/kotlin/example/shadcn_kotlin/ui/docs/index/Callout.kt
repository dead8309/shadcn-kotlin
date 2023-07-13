package example.shadcn_kotlin.ui.docs.index

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.strong
import shadcn.ui.components.Alert
import shadcn.ui.components.AlertDescription
import shadcn.ui.components.AlertTitle
import web.cssom.ClassName
import web.window.WindowTarget

@Composable
fun Callout() {
    useReactEffect {
        Alert {
            className = ClassName("mt-2")
            AlertTitle {
                + title
            }
            AlertDescription {
                p {
                    strong {
                        + "Note:"
                    }
                    + "This project does not have complete feature parity with the original. We are working on it, and if you'd like to expedite the process, please consider contributing to "
                    a {
                        href = "https://github.com/dead8309/shadcn-kotlin/tree/master/library/radix-kotlin"
                        rel ="noreferrer"
                        target = WindowTarget._blank
                        + "Radix Kotlin"
                    }
                    + ", which this project is built on."
                }
            }
        }
    }
}