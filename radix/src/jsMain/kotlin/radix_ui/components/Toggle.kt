// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-toggle")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface ToggleProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
/**
 * The controlled state of the toggle.
 */
var pressed: Boolean?

/**
 * The state of the toggle when initially rendered. Use `defaultPressed`
 * if you do not need to control the state of the toggle.
 * @defaultValue false
 */
var defaultPressed: Boolean?

/**
 * The callback that fires when the state of the toggle changes.
 */
var onPressedChange: dynamic
}

@JsName("Toggle")
internal external val Toggle: react.FC<ToggleProps>
