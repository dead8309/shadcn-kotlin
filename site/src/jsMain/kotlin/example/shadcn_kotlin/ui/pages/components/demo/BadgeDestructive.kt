package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Badge

val BadgeDestructive = FC<Props> {
    Badge {
        variant = "destructive"
        +"Destructive"
    }
}