package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.useState
import shadcn.ui.components.*
import web.cssom.ClassName

val DropdownMenuRadioGroupDemo = FC<Props> {
    val (position, setPosition) = useState("bottom")
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "outline"
                +"Open"
            }
        }
        DropdownMenuContent {
            className = ClassName("w-56")
            DropdownMenuLabel { +"Panel Position" }
            DropdownMenuSeparator {}
            DropdownMenuRadioGroup {
                value = position
                onValueChange = { setPosition(it.toString()) }
                DropdownMenuRadioItem {
                    value = "top"
                    +"Top"
                }
                DropdownMenuRadioItem {
                    value = "bottom"
                    +"Bottom"
                }
                DropdownMenuRadioItem {
                    value = "right"
                    +"Right"
                }
            }
        }
    }
}

