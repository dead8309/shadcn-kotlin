package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Badge

val BadgeOutline = FC<Props> {
    Badge {
        variant="outline"
        +"Outline"
    }
}