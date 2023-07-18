package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Italic
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import shadcn.ui.components.Toggle
import web.cssom.ClassName

val ToggleOutline = FC<Props> {
    Toggle {
        variant = "outline"
        ariaLabel = "Toggle italic"
        Italic { className = ClassName("h-4 w-4") }
    }
}