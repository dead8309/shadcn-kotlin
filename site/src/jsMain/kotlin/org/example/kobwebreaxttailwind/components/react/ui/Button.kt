@file:JsModule("@lshay/ui/components/button")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.html.HTMLButtonElement

external interface ButtonProps: StandardProps<HTMLButtonElement> {
    @JsName("variant")
    var variant: String
    @JsName("size")
    var size: String
}

@JsName("Button")
external val Button: FC<ButtonProps>