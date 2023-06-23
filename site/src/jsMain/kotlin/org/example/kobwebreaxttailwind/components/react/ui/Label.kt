@file:JsModule("@lshay/ui/components/label")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.html.HTMLLabelElement

external interface LabelProps: StandardProps<HTMLLabelElement> {
    var htmlFor: String
}

@JsName("Label")
external val Label: FC<LabelProps>