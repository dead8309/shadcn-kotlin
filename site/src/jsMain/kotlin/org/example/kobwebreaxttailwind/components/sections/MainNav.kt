package org.example.kobwebreaxttailwind.components.sections

import lucide_react.LucideProps
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.nav
import react.dom.svg.ReactSVG.path
import react.dom.svg.ReactSVG.svg
import web.cssom.ClassName

val logo = FC<LucideProps> {
    svg {
        className = it.className
        fill = "currentColor"
        viewBox="0 0 24 24"
        stroke = "currentColor"
        path {
            d="M1.3 24l11.3-11.5L24 24zM0 0h12L0 12.5zM13.4 0L0 14v10l12-12L24 0z"
        }
    }
}

val MainNav = FC<Props> {
    div {
        className = ClassName("mr-4 hidden md:flex")
        a {
            href = "/"
            className = ClassName("mr-6 flex items-center space-x-2")
            logo { className = ClassName("h-6 w-6") }
            ReactHTML.span {
                className = ClassName("hidden font-bold sm:inline-block")
                +"shadcn-kotlin"
            }
        }
        nav {
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
