@file:JsModule("@lshay/ui/components/input")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import react.FC
import react.dom.html.InputHTMLAttributes
import web.html.HTMLInputElement

external interface InputProps: InputHTMLAttributes<HTMLInputElement>

@JsName("Input")
external val Input: FC<InputProps>