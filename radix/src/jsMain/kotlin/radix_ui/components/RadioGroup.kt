// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-radio-group")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface RadioProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
var checked: Boolean?

var required: Boolean?

var onCheck: Unit
}

external interface RadioIndicatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface RadioGroupProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var name: dynamic /* RadioGroupContextValue['name'] */

var required: dynamic /* Radix.ComponentPropsWithoutRef<typeof Radio>['required'] */

var disabled: dynamic /* Radix.ComponentPropsWithoutRef<typeof Radio>['disabled'] */

var dir: dynamic /* RovingFocusGroupProps['dir'] */

var orientation: dynamic /* RovingFocusGroupProps['orientation'] */

var loop: dynamic /* RovingFocusGroupProps['loop'] */

var defaultValue: String?

var value: dynamic /* RadioGroupContextValue['value'] */

var onValueChange: ((value: Any) -> Unit)?
}

external interface RadioGroupItemProps: 
RadioProps,
react.PropsWithClassName {
var value: String
}

external interface RadioGroupIndicatorProps: 
RadioIndicatorProps,
react.PropsWithClassName {

}

@JsName("RadioGroup")
external val RadioGroup: react.FC<RadioGroupProps>

@JsName("RadioGroupItem")
external val RadioGroupItem: react.FC<RadioGroupItemProps>

@JsName("RadioGroupIndicator")
external val RadioGroupIndicator: react.FC<RadioGroupIndicatorProps>
