package org.example.kobwebreaxttailwind.pages.components.demo

import org.example.kobwebreaxttailwind.components.react.lucide_react.Loader2
import org.example.kobwebreaxttailwind.components.react.lucide_react.Mail
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Button
import web.cssom.ClassName

val ButtonsDemo = FC<Props> {
    div {
        className = ClassName("grid grid-cols-2 gap-4 md:grid-cols-3 2xl:grid-cols-4")
        Button {
            +"Button"
        }
        Button {
            variant = "outline"
            +"Outline"
        }
        Button {
            variant = "link"
            +"Link "
        }
        Button {
            variant = "destructive"
            +"Destructive"
        }
        Button {
            variant = "secondary"
            +"Secondary"
        }
        Button {
            variant = "ghost"
            +"Ghost"
        }
        Button {
            size = "lg"
            +"Large"
        }
        Button {
            size = "sm"
            +"Small"
        }
    }
    ButtonWithIcons {   }
}

private val ButtonWithIcons = FC<Props> {
    div {
        className = ClassName("flex space-x-2")
        Button {
            Mail {
                className = ClassName("mr-2 h-4 w-4")
            }
            +"Login with Email"
        }
        Button {
            disabled = true
            Loader2 {
                className = ClassName("mr-2 h-4 w-4 animate-spin")
            }
            +"Please wait"
        }
    }
}