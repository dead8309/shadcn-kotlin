// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-popover")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface PopoverProps: 
react.PropsWithChildren,
react.PropsWithClassName {
    /* override */ var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: ((open: Boolean)->Unit)?

var modal: Boolean?
}

external interface PopoverAnchorProps: 
PopperAnchorProps,
react.PropsWithClassName {

}

external interface PopoverTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface PopoverPortalProps: 
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

external interface PopoverContentProps: 
PopoverContentTypeProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface PopoverContentTypeProps: 
PopoverContentImplProps,
react.PropsWithClassName {

}

external interface PopoverContentImplProps: 
PopperContentProps,
react.PropsWithClassName {
/**
 * Whether focus should be trapped within the `Popover`
 * (default: false)
 */
var trapFocus: dynamic /* FocusScopeProps['trapped'] */

/**
 * Event handler called when auto-focusing on open.
 * Can be prevented.
 */
var onOpenAutoFocus: dynamic /* FocusScopeProps['onMountAutoFocus'] */

/**
 * Event handler called when auto-focusing on close.
 * Can be prevented.
 */
var onCloseAutoFocus: dynamic /* FocusScopeProps['onUnmountAutoFocus'] */
}

external interface PopoverCloseProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface PopoverArrowProps: 
PopperArrowProps,
react.PropsWithClassName {

}

@JsName("Popover")
internal external val Popover: react.FC<PopoverProps>

@JsName("PopoverAnchor")
internal external val PopoverAnchor: react.FC<PopoverAnchorProps>

@JsName("PopoverTrigger")
internal external val PopoverTrigger: react.FC<PopoverTriggerProps>

@JsName("PopoverPortal")
internal external val PopoverPortal: react.FC<PopoverPortalProps>

@JsName("PopoverContent")
internal external val PopoverContent: react.FC<PopoverContentProps>

@JsName("PopoverClose")
internal external val PopoverClose: react.FC<PopoverCloseProps>

@JsName("PopoverArrow")
internal external val PopoverArrow: react.FC<PopoverArrowProps>
