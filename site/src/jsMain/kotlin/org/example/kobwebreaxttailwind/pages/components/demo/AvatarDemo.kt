package org.example.kobwebreaxttailwind.pages.components.demo

import org.example.kobwebreaxttailwind.components.react.ui.Avatar
import org.example.kobwebreaxttailwind.components.react.ui.AvatarFallback
import org.example.kobwebreaxttailwind.components.react.ui.AvatarImage
import org.example.kobwebreaxttailwind.components.react.ui.AvatarProps
import react.FC

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