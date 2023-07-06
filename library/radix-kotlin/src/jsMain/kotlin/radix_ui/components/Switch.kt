// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-switch")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface SwitchProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
var checked: Boolean?

var defaultChecked: Boolean?

var required: Boolean?

var onCheckedChange: dynamic
}

external interface SwitchThumbProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

@JsName("Switch")
internal external val Switch: react.FC<SwitchProps>

@JsName("SwitchThumb")
internal external val SwitchThumb: react.FC<SwitchThumbProps>
