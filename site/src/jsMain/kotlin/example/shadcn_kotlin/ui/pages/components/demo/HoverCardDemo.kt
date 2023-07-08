package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.CalendarDays
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

val HoverCardDemo = FC<Props> {
    HoverCard {
        HoverCardTrigger {
            asChild = true
            Button {
                variant = "link"
                + "@kobweb"
            }
        }
        HoverCardContent {
            className = ClassName("w-80")
            div {
                className = ClassName("flex justify-between space-x-4")
                Avatar {
                    AvatarImage {
                        src = "https://github.com/varabyte.png"
                    }
                    AvatarFallback{
                        +"VB"
                    }
                }
                div {
                    className = ClassName("space-y-1")
                    h4 {
                        className = ClassName("text-sm font-semibold")
                        +"@varabyte"
                    }
                    p {
                        className = ClassName("text-sm")
                        +"The Kobweb Framework – created and maintained by @varabyte."
                    }
                    div {
                        className = ClassName("flex items-center pt-2")
                        CalendarDays {
                            className = ClassName("mr-2 h-4 w-4 opacity-70")
                        }
                        +" "
                        span {
                            className = ClassName("text-xs text-muted-foreground")
                            +"Joined December 2021"
                        }
                    }
                }
            }
        }
    }
}
