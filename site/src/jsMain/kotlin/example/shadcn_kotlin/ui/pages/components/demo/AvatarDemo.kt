package example.shadcn_kotlin.ui.pages.components.demo

import radix_ui.components.AvatarProps
import react.FC
import shadcn.ui.components.Avatar
import shadcn.ui.components.AvatarFallback
import shadcn.ui.components.AvatarImage

val AvatarDemo = FC<AvatarProps> {
    Avatar {
        AvatarImage {
            src = "https://github.com/shadcn.png"
            alt = "@shadcn"
        }
        AvatarFallback {
            +"CN"
        }
    }
}