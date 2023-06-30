package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.p
import shadcn.ui.components.Separator
import web.cssom.ClassName

val SeparatorDemo = FC<Props> {
    div {
        div {
            className = ClassName("space-y-1")
            h4 {
                className = ClassName("text-sm font-medium leading-none")
                +"Radix Primitives"
            }
            p {
                className = ClassName("text-sm text-muted-foreground")
                +"An open -source UI component library ."
            }
        }
        Separator {
            className = ClassName("my-4")
        }
        div {
            className = ClassName("flex h-5 items-center space-x-4 text-sm")
            div {
                +"Blog"
            }
            Separator { orientation = "vertical" }
            div {
                +"Docs"
            }
            Separator { orientation = "vertical" }
            div {
                +"Source"
            }
        }
    }
}