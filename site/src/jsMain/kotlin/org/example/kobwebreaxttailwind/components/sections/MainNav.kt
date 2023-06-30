package org.example.kobwebreaxttailwind.components.sections

import lucide_react.LucideProps
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.svg.ReactSVG.circle
import react.dom.svg.ReactSVG.svg
import react.dom.svg.StrokeLinecap
import react.dom.svg.StrokeLinejoin
import web.cssom.ClassName

val logo = FC<LucideProps> {
    svg {
        className = it.className
        viewBox = "0 0 24 24"
        fill = "currentColor"
        stroke = "currentColor"
        strokeWidth = 2.0
        strokeLinecap =  StrokeLinecap.round
        strokeLinejoin = StrokeLinejoin.round
        circle {
            cx = 12.0
            cy = 12.0
            r = 10.0
        }
    }
}

val MainNav = FC<Props> {
    ReactHTML.div {
        className = ClassName("mr-4 hidden md:flex")
        ReactHTML.a {
            href = "/"
            className = ClassName("mr-6 flex items-center space-x-2")
            logo { className = ClassName("h-6 w-6") }
            ReactHTML.span {
                className = ClassName("hidden font-bold sm:inline-block")
                +"shadcn-kotlin"
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
