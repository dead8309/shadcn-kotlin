package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.ChevronsUpDown
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.span
import react.useState
import shadcn.ui.components.Button
import shadcn.ui.components.Collapsible
import shadcn.ui.components.CollapsibleContent
import shadcn.ui.components.CollapsibleTrigger
import web.cssom.ClassName

val CollapsibleDemo = FC<Props> {
    val (isOpen, setIsOpen) = useState(false)

    Collapsible {
        open = isOpen
        onOpenChange = setIsOpen
        className = ClassName("w-[350px] space-y-2")

        div {
            className = ClassName("flex items-center justify-between space-x-4 px-4")
            h4 {
                className = ClassName("text-sm font-semibold")
                +"@peduarte starred 3 repositories"
            }
            CollapsibleTrigger {
                asChild = true
                Button {
                    variant = "ghost"
                    size = "sm"
                    className = ClassName("w-9 p-0")
                    ChevronsUpDown { className = ClassName("h-4 w-4") }
                    span {
                        className = ClassName("sr-only")
                        +"Toggle"
                    }
                }
            }
        }
        div {
            className = ClassName("rounded-md border px-4 py-3 font-mono text-sm")
            +"@radix-ui/primitives"
        }
        CollapsibleContent {
            className = ClassName("space-y-2")
            div {
                className = ClassName("rounded-md border px-4 py-3 font-mono text-sm")
                +"@radix-ui/colors"
            }
            div {
                className = ClassName("rounded-md border px-4 py-3 font-mono text-sm")
                +"@stitches/react"
            }
        }
    }
}