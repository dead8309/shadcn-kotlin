package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Plus
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

val TooltipDemo = FC<Props> {
    TooltipProvider {
        Tooltip {
            TooltipTrigger {
                asChild = true
                Button {
                    variant = "outline"
                    className = ClassName("w-10 rounded-full p-0")
                    Plus { className = ClassName("h-4 w-4") }
                    span {
                        className = ClassName("sr-only")
                        +"Add"
                    }
                }
            }
            TooltipContent {
                p {
                    +"Add to library"
                }
            }
        }
    }
}