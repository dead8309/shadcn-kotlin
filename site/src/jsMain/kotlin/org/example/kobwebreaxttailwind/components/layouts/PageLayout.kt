package org.example.kobwebreaxttailwind.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.example.kobwebreaxttailwind.components.sections.NavHeader
import org.example.kobwebreaxttailwind.theme.ThemeProvider
import react.FC
import react.Props
import react.ReactNode
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import web.cssom.ClassName
import web.dom.document


@Composable
fun PageLayout(
        title: String,
        children: ReactNode? = null
) {
    kotlinext.js.require("./globals.css")
    val layout = FC<Props> {
        ThemeProvider {
            // attribute = "class"
            defaultTheme = "system"
            enableSystem = true
            div {
                className = ClassName("relative flex min-h-screen flex-col")
                NavHeader {}
                div {
                    className = ClassName("flex-1")
                    +children
                }
                // SiteFooter
            }
        }
        // Toaster
    }


    LaunchedEffect(Unit) {
        document.title = title
        val root = document.getElementById("app")
        createRoot(root!!).render(layout.create())
    }
}