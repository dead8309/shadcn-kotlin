package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Bold
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import shadcn.ui.components.Toggle
import web.cssom.ClassName

val ToggleDemo = FC<Props> {
    Toggle {
        ariaLabel = "Toggle italic"
        Bold { className = ClassName("h-4 w-4") }
    }
}