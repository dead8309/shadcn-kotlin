package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Badge

val BadgeDemo = FC<Props> {
    Badge {
        +"Badge"
    }
}
val BadgeSecondary = FC<Props> {
    Badge {
        variant = "secondary"
        +"Secondary"
    }
}
val BadgeDestructive = FC<Props> {
    Badge {
        variant = "destructive"
        +"Destructive"
    }
}
val BadgeOutline = FC<Props> {
    Badge {
        variant="outline"
        +"Outline"
    }
}