package org.example.kobwebreaxttailwind.components

import lucide_react.Laptop
import lucide_react.Moon
import lucide_react.SunMedium
import org.example.kobwebreaxttailwind.theme.useTheme
import react.FC
import react.Props
import react.dom.html.ReactHTML
import shadcn.ui.components.*
import web.cssom.ClassName

val ThemeToggle = FC<Props> {
    val setTheme = useTheme().setTheme
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "ghost"
                className = ClassName("w-9 h-9 px-0")
                SunMedium {
                    className =
                            ClassName("h-[1.2rem] w-[1.2rem] rotate-0 scale-100 transition-all dark:-rotate-90 dark:scale-0")
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
                SunMedium { className= ClassName("mr-2 h-4 w-4") }
                ReactHTML.span { +"Light" }
            }
            DropdownMenuItem {
                onClick = { setTheme("dark") }
                Moon { className= ClassName("mr-2 h-4 w-4") }
                ReactHTML.span { +"Dark" }
            }
            DropdownMenuItem {
                onClick = { setTheme("system") }
                Laptop { className= ClassName("mr-2 h-4 w-4") }
                ReactHTML.span { +"System" }
            }
        }
    }
}