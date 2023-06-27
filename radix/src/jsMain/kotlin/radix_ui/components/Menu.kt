// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-menu")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface MenuProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var onOpenChange: dynamic

var dir: String?

var modal: Boolean?
}

external interface MenuAnchorProps: 
PopperAnchorProps,
react.PropsWithClassName {

}

external interface MenuPortalProps: 
PortalProps,
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface MenuContentProps: 
MenuRootContentTypeProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface MenuRootContentTypeProps: 
MenuContentImplProps,
react.PropsWithClassName {

}

external interface MenuContentImplProps: 
MenuContentImplPrivateProps /* MenuContentImplPrivateProps, Omit<PopperContentProps, 'dir' | 'onPlaced'> */,
react.PropsWithClassName {
/**
 * Event handler called when auto-focusing on close.
 * Can be prevented.
 */
var onCloseAutoFocus: dynamic /* FocusScopeProps['onUnmountAutoFocus'] */

/**
 * Whether keyboard navigation should loop around
 * @defaultValue false
 */
var loop: dynamic /* RovingFocusGroupProps['loop'] */

var onEntryFocus: dynamic /* RovingFocusGroupProps['onEntryFocus'] */

var onEscapeKeyDown: dynamic /* DismissableLayerProps['onEscapeKeyDown'] */

var onPointerDownOutside: dynamic /* DismissableLayerProps['onPointerDownOutside'] */

var onFocusOutside: dynamic /* DismissableLayerProps['onFocusOutside'] */

var onInteractOutside: dynamic /* DismissableLayerProps['onInteractOutside'] */
}

external interface MenuGroupProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface MenuLabelProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface MenuItemProps: 
MenuItemImplProps,
react.PropsWithClassName {
var onSelect: ((event: Event)->Unit)?
}

external interface MenuItemImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var disabled: Boolean?

var textValue: String?
}

external interface MenuCheckboxItemProps: 
MenuItemProps,
react.PropsWithClassName {
var checked: Boolean?

var onCheckedChange: ((checked: Boolean)->Unit)?
}

external interface MenuRadioGroupProps: 
MenuGroupProps,
react.PropsWithClassName {
var value: String?

var onValueChange: ((value: Any) -> Unit)?
}

external interface MenuRadioItemProps: 
MenuItemProps,
react.PropsWithClassName {
var value: String
}

external interface MenuItemIndicatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface MenuSeparatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface MenuArrowProps: 
PopperArrowProps,
react.PropsWithClassName {

}

external interface MenuSubProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var onOpenChange: dynamic
}

external interface MenuSubTriggerProps: 
MenuItemImplProps,
react.PropsWithClassName {

}

external interface MenuSubContentProps: 
MenuContentImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface MenuContentImplPrivateProps {
var onOpenAutoFocus: dynamic /* FocusScopeProps['onMountAutoFocus'] */

var onDismiss: dynamic /* DismissableLayerProps['onDismiss'] */

var disableOutsidePointerEvents: dynamic /* DismissableLayerProps['disableOutsidePointerEvents'] */

/**
 * Whether scrolling outside the `MenuContent` should be prevented
 * (default: `false`)
 */
var disableOutsideScroll: Boolean?

/**
 * Whether focus should be trapped within the `MenuContent`
 * (default: false)
 */
var trapFocus: dynamic
}

@JsName("Menu")
external val Menu: react.FC<MenuProps>

@JsName("MenuAnchor")
external val MenuAnchor: react.FC<MenuAnchorProps>

@JsName("MenuPortal")
external val MenuPortal: react.FC<MenuPortalProps>

@JsName("MenuContent")
external val MenuContent: react.FC<MenuContentProps>

@JsName("MenuGroup")
external val MenuGroup: react.FC<MenuGroupProps>

@JsName("MenuLabel")
external val MenuLabel: react.FC<MenuLabelProps>

@JsName("MenuItem")
external val MenuItem: react.FC<MenuItemProps>

@JsName("MenuCheckboxItem")
external val MenuCheckboxItem: react.FC<MenuCheckboxItemProps>

@JsName("MenuRadioGroup")
external val MenuRadioGroup: react.FC<MenuRadioGroupProps>

@JsName("MenuRadioItem")
external val MenuRadioItem: react.FC<MenuRadioItemProps>

@JsName("MenuItemIndicator")
external val MenuItemIndicator: react.FC<MenuItemIndicatorProps>

@JsName("MenuSeparator")
external val MenuSeparator: react.FC<MenuSeparatorProps>

@JsName("MenuArrow")
external val MenuArrow: react.FC<MenuArrowProps>

@JsName("MenuSub")
external val MenuSub: react.FC<MenuSubProps>

@JsName("MenuSubTrigger")
external val MenuSubTrigger: react.FC<MenuSubTriggerProps>

@JsName("MenuSubContent")
external val MenuSubContent: react.FC<MenuSubContentProps>
