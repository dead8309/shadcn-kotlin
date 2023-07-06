// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-tooltip")
@file:JsNonModule

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface TooltipProviderProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

/**
 * The duration from when the pointer enters the trigger until the tooltip gets opened.
 * @defaultValue 700
 */
var delayDuration: Number?

/**
 * How much time a user has to enter another trigger without incurring a delay again.
 * @defaultValue 300
 */
var skipDelayDuration: Number?

/**
 * When `true`, trying to hover the content will result in the tooltip closing as the pointer leaves the trigger.
 * @defaultValue false
 */
var disableHoverableContent: Boolean?
}

external interface TooltipProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: ((open: Boolean)->Unit)?

/**
 * The duration from when the pointer enters the trigger until the tooltip gets opened. This will
 * override the prop with the same name passed to Provider.
 * @defaultValue 700
 */
var delayDuration: Number?

/**
 * When `true`, trying to hover the content will result in the tooltip closing as the pointer leaves the trigger.
 * @defaultValue false
 */
var disableHoverableContent: Boolean?
}

external interface TooltipTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
    var asChild: Boolean
}

external interface TooltipPortalProps: 
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

external interface TooltipContentProps: 
TooltipContentImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface TooltipContentImplProps: 
PopperContentProps,
react.PropsWithClassName {
/**
 * A more descriptive label for accessibility purpose
 */
    // var `aria-label`: String?

/**
 * Event handler called when the escape key is down.
 * Can be prevented.
 */
var onEscapeKeyDown: dynamic /* DismissableLayerProps['onEscapeKeyDown'] */

/**
 * Event handler called when the a `pointerdown` event happens outside of the `Tooltip`.
 * Can be prevented.
 */
var onPointerDownOutside: dynamic /* DismissableLayerProps['onPointerDownOutside'] */
}

external interface TooltipArrowProps: 
PopperArrowProps,
react.PropsWithClassName {

}

@JsName("TooltipProvider")
internal external val TooltipProvider: react.FC<TooltipProviderProps>

@JsName("Tooltip")
internal external val Tooltip: react.FC<TooltipProps>

@JsName("TooltipTrigger")
internal external val TooltipTrigger: react.FC<TooltipTriggerProps>

@JsName("TooltipPortal")
internal external val TooltipPortal: react.FC<TooltipPortalProps>

@JsName("TooltipContent")
internal external val TooltipContent: react.FC<TooltipContentProps>

@JsName("TooltipArrow")
internal external val TooltipArrow: react.FC<TooltipArrowProps>
