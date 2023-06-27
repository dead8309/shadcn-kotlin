// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-hover-card")
@file:JsNonModule

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface HoverCardProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: ((open: Boolean)->Unit)?

var openDelay: Number?

var closeDelay: Number?
}

external interface HoverCardTriggerProps: 
react.dom.html.AnchorHTMLAttributes<web.html.HTMLAnchorElement>,
react.PropsWithClassName {

}

external interface HoverCardPortalProps: 
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

external interface HoverCardContentProps: 
HoverCardContentImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface HoverCardContentImplProps: 
PopperContentProps,
react.PropsWithClassName {
/**
 * Event handler called when the escape key is down.
 * Can be prevented.
 */
var onEscapeKeyDown: dynamic /* DismissableLayerProps['onEscapeKeyDown'] */

/**
 * Event handler called when the a `pointerdown` event happens outside of the `HoverCard`.
 * Can be prevented.
 */
var onPointerDownOutside: dynamic /* DismissableLayerProps['onPointerDownOutside'] */

/**
 * Event handler called when the focus moves outside of the `HoverCard`.
 * Can be prevented.
 */
var onFocusOutside: dynamic /* DismissableLayerProps['onFocusOutside'] */

/**
 * Event handler called when an interaction happens outside the `HoverCard`.
 * Specifically, when a `pointerdown` event happens outside or focus moves outside of it.
 * Can be prevented.
 */
var onInteractOutside: dynamic /* DismissableLayerProps['onInteractOutside'] */
}

external interface HoverCardArrowProps: 
PopperArrowProps,
react.PropsWithClassName {

}

@JsName("HoverCard")
external val HoverCard: react.FC<HoverCardProps>

@JsName("HoverCardTrigger")
external val HoverCardTrigger: react.FC<HoverCardTriggerProps>

@JsName("HoverCardPortal")
external val HoverCardPortal: react.FC<HoverCardPortalProps>

@JsName("HoverCardContent")
external val HoverCardContent: react.FC<HoverCardContentProps>

@JsName("HoverCardArrow")
external val HoverCardArrow: react.FC<HoverCardArrowProps>
