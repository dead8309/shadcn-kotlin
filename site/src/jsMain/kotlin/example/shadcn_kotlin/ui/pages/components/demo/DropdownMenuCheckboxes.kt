package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.useState
import shadcn.ui.components.*
import web.cssom.ClassName

val DropdownMenuCheckboxes = FC<Props> {
    val (showStatusBar, setShowStatusBar) = useState(true)
    val (showActivityBar, setShowActivityBar) = useState(false)
    val (showPanel, setShowPanel) = useState(false)

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
            DropdownMenuLabel { +"Appearance" }
            DropdownMenuSeparator {}
            DropdownMenuCheckboxItem {
                checked = showStatusBar
                onCheckedChange = { setShowStatusBar(it) }
                +"Status Bar"
            }
            DropdownMenuCheckboxItem {
                checked = showActivityBar
                onCheckedChange = { setShowActivityBar(it) }
                disabled = true
                +"Activity Bar"
            }
            DropdownMenuCheckboxItem {
                checked = showPanel
                onCheckedChange = { setShowPanel(it) }
                +"Panel"
            }
        }
    }

}