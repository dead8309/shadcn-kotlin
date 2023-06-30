package org.example.kobwebreaxttailwind.pages.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.Page
import lucide_react.Moon
import lucide_react.Sun
import org.example.kobwebreaxttailwind.theme.ThemeProvider
import org.example.kobwebreaxttailwind.theme.useTheme
import org.jetbrains.compose.web.dom.Div
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML
import shadcn.ui.components.*
import web.cssom.ClassName
import web.dom.document


@Page
@Composable
fun ComponentPage() {
    kotlinext.js.require("./globals.css")
    Div({
        id("sink")
        classes("w-full","bg-background")
    })
    LaunchedEffect(Unit) {
        val root = document.getElementById("sink")
        createRoot(root!!).render(ComponentApp.create())
    }
}

val ComponentApp = FC<Props> {
    ThemeProvider {
        defaultTheme = "dark"
        ThemeToggle {}
        ComponentSink {
            components = demoComponents
        }
    }
}

val ThemeToggle = FC<Props> {
    val setTheme = useTheme().setTheme
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "outline"
                size = "icon"
                Sun {
                    className =
                        ClassName(" h-[1.2rem] w-[1.2rem] rotate-0 scale-100 transition-all dark:-rotate-90 dark:scale-0")
                }
                Moon {
                    className = ClassName(
                        "absolute h-[1.2rem] w-[1.2rem] rotate-90 scale-0 transition-all dark:rotate-0 dark:scale-100"
                    )
                }
                ReactHTML.span {
                    className = ClassName("sr-only")
                    +"Toggle theme"
                }
            }
        }
        DropdownMenuContent {
            align = "end"
            DropdownMenuItem {
                onClick = { setTheme("light") }
                +"Light"
            }
            DropdownMenuItem {
                onClick = { setTheme("dark") }
                +"Dark"
            }
            DropdownMenuItem {
                onClick = { setTheme("system") }
                +"System"
            }
        }
    }
}