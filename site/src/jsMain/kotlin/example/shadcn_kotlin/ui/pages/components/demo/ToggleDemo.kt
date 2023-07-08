package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Bold
import lucide_react.Italic
import lucide_react.Underline
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
val  ToggleOutline = FC<Props> {
    Toggle {
        variant = "outline"
        ariaLabel = "Toggle italic"
        Italic { className = ClassName("h-4 w-4") }
    }
}
val ToggleDisabled = FC<Props> {
    Toggle {
        disabled = true
        ariaLabel = "Toggle italic"
        Underline { className = ClassName("h-4 w-4") }
    }
}
val ToggleWithText = FC<Props> {
    Toggle {
        ariaLabel = "Toggle italic"
        Italic { className = ClassName("m-2 h-4 w-4") }
        +"Italic"
    }
}