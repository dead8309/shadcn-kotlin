@file:JsModule("@lshay/ui/components/checkbox")
@file:JsNonModule


package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.html.HTMLButtonElement


external interface CheckBoxProps : StandardProps<HTMLButtonElement> {
    var checked: Boolean?
    override var defaultChecked: Boolean?
    var required: Boolean?
    var onCheckedChange: (checked: Boolean) -> Unit
}

@JsName("Checkbox")
external val Checkbox: FC<CheckBoxProps>

