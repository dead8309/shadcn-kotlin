package example.shadcn_kotlin.ui.pages.components.demo.buttons

import lucide_react.ChevronRight
import react.FC
import react.Props
import shadcn.ui.components.Button
import web.cssom.ClassName

val ButtonIcon = FC<Props> {
    Button {
        variant = "outline"
        size = "icon"
        ChevronRight { className = ClassName("h-4 w-4") }
    }
}