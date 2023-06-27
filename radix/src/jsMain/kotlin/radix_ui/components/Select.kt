// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-select")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface SelectProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var value: String?

var defaultValue: String?

var onValueChange: (value: Any) -> Unit

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic

var dir: String?

var name: String?

var autoComplete: String?

var disabled: Boolean?

var required: Boolean?
}

external interface SelectTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface SelectValueProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
var placeholder: react.ReactNode?
}

external interface SelectIconProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface SelectPortalProps: 
PortalProps,
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?
}

external interface SelectContentProps: 
SelectContentImplProps,
react.PropsWithClassName {

}

external interface SelectContentImplProps: 
SelectPopperPositionProps,
react.PropsWithClassName {
/**
 * Event handler called when auto-focusing on close.
 * Can be prevented.
 */
var onCloseAutoFocus: dynamic /* FocusScopeProps['onUnmountAutoFocus'] */

/**
 * Event handler called when the escape key is down.
 * Can be prevented.
 */
var onEscapeKeyDown: dynamic /* DismissableLayerProps['onEscapeKeyDown'] */

/**
 * Event handler called when the a `pointerdown` event happens outside of the `DismissableLayer`.
 * Can be prevented.
 */
var onPointerDownOutside: dynamic /* DismissableLayerProps['onPointerDownOutside'] */

var position: String? /* 'item-aligned' | 'popper' */
}

external interface SelectItemAlignedPositionProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>, SelectPopperPrivateProps,
react.PropsWithClassName {

}

external interface SelectPopperPositionProps: 
PopperContentProps, SelectPopperPrivateProps,
react.PropsWithClassName {

}

external interface SelectViewportProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface SelectGroupProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface SelectLabelProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface SelectItemProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var value: String

var disabled: Boolean?

var textValue: String?
}

external interface SelectItemTextProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface SelectItemIndicatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface SelectScrollUpButtonProps: 
SelectScrollButtonImplProps,
react.PropsWithClassName {

}

external interface SelectScrollDownButtonProps: 
SelectScrollButtonImplProps,
react.PropsWithClassName {

}

external interface SelectScrollButtonImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var onAutoScroll: Unit
}

external interface SelectSeparatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface SelectArrowProps: 
PopperArrowProps,
react.PropsWithClassName {

}

external interface SelectPopperPrivateProps {
var onPlaced: dynamic
}

@JsName("Select")
external val Select: react.FC<SelectProps>

@JsName("SelectTrigger")
external val SelectTrigger: react.FC<SelectTriggerProps>

@JsName("SelectValue")
external val SelectValue: react.FC<SelectValueProps>

@JsName("SelectIcon")
external val SelectIcon: react.FC<SelectIconProps>

@JsName("SelectPortal")
external val SelectPortal: react.FC<SelectPortalProps>

@JsName("SelectContent")
external val SelectContent: react.FC<SelectContentProps>

@JsName("SelectViewport")
external val SelectViewport: react.FC<SelectViewportProps>

@JsName("SelectGroup")
external val SelectGroup: react.FC<SelectGroupProps>

@JsName("SelectLabel")
external val SelectLabel: react.FC<SelectLabelProps>

@JsName("SelectItem")
external val SelectItem: react.FC<SelectItemProps>

@JsName("SelectItemText")
external val SelectItemText: react.FC<SelectItemTextProps>

@JsName("SelectItemIndicator")
external val SelectItemIndicator: react.FC<SelectItemIndicatorProps>

@JsName("SelectScrollUpButton")
external val SelectScrollUpButton: react.FC<SelectScrollUpButtonProps>

@JsName("SelectScrollDownButton")
external val SelectScrollDownButton: react.FC<SelectScrollDownButtonProps>

@JsName("SelectSeparator")
external val SelectSeparator: react.FC<SelectSeparatorProps>

@JsName("SelectArrow")
external val SelectArrow: react.FC<SelectArrowProps>
