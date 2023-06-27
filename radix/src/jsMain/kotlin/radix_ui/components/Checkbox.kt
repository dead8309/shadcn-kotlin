// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-checkbox")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface CheckboxProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
var checked: Boolean?

var defaultChecked: Boolean?

var required: Boolean?

var onCheckedChange: dynamic
}

external interface CheckboxIndicatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

@JsName("Checkbox")
internal external val Checkbox: react.FC<CheckboxProps>

@JsName("CheckboxIndicator")
internal external val CheckboxIndicator: react.FC<CheckboxIndicatorProps>
