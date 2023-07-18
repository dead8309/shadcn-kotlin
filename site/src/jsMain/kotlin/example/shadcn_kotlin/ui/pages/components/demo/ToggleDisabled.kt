package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Underline
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import shadcn.ui.components.Toggle
import web.cssom.ClassName

val ToggleDisabled = FC<Props> {
    Toggle {
        disabled = true
        ariaLabel = "Toggle italic"
        Underline { className = ClassName("h-4 w-4") }
    }
}