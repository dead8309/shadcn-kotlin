package org.example.kobwebreaxttailwind.components.sections

import lucide_react.Bird
import react.FC
import react.Props
import react.dom.html.ReactHTML
import web.cssom.ClassName


val MainNav = FC<Props> {
    ReactHTML.div {
        className = ClassName("mr-4 hidden md:flex")
        ReactHTML.a {
            href = "/"
            className = ClassName("mr-6 flex items-center space-x-2")
            Bird { className = ClassName("h-6 w-6") }
            ReactHTML.span {
                className = ClassName("hidden font-bold sm:inline-block")
                +"ShadKt"
            }
        }
        ReactHTML.nav {
            className = ClassName("flex items-center space-x-6 text-sm font-medium")
            ReactHTML.a {
                href = "/dashboard"
                className = ClassName("transition-colors hover:text-foreground/80 text-foreground/60")
                +"Dashboard"
            }
            ReactHTML.a {
                href = "/components"
                className = ClassName("transition-colors hover:text-foreground/80 text-foreground/60")
                +"Components"
            }
            ReactHTML.a {
                href = "https://github.com/dead8309/kobweb-react-tailwind#integration-with-tailwind-css"
                className = ClassName("transition-colors hover:text-foreground/80 text-foreground/60")
                +"Tailwind"
            }
            ReactHTML.a {
                href = "https://github.com/dead8309"
                className = ClassName("hidden text-foreground/60 transition-colors hover:text-foreground/80 lg:block")
                +"Github"
            }
        }
    }
}
