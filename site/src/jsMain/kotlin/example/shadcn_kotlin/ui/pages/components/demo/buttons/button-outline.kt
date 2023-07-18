package example.shadcn_kotlin.ui.pages.components.demo.buttons

import react.FC
import react.Props
import shadcn.ui.components.Button

val ButtonOutline = FC<Props> {
    Button {
        variant = "outline"
        +"Outline"
    }
}