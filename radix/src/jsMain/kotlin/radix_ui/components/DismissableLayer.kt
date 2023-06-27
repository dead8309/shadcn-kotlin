// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-dismissable-layer")
@file:JsNonModule

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface DismissableLayerProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
/**
 * When `true`, hover/focus/click interactions will be disabled on elements outside
 * the `DismissableLayer`. Users will need to click twice on outside elements to
 * interact with them: once to close the `DismissableLayer`, and again to trigger the element.
 */
var disableOutsidePointerEvents: Boolean?

/**
 * Event handler called when the escape key is down.
 * Can be prevented.
 */
var onEscapeKeyDown: ((event: react.dom.events.SyntheticEvent<*, *>)->Unit)?

/**
 * Event handler called when the a `pointerdown` event happens outside of the `DismissableLayer`.
 * Can be prevented.
 */
var onPointerDownOutside: ((event: react.dom.events.PointerEvent<*>)->Unit)?

/**
 * Event handler called when the focus moves outside of the `DismissableLayer`.
 * Can be prevented.
 */
var onFocusOutside: ((event: react.dom.events.SyntheticEvent<*, *>)->Unit)?

/**
 * Event handler called when an interaction happens outside the `DismissableLayer`.
 * Specifically, when a `pointerdown` event happens outside or focus moves outside of it.
 * Can be prevented.
 */
var onInteractOutside: ((event: react.dom.events.SyntheticEvent<*, *>)->Unit /* (event: PointerDownOutsideEvent | FocusOutsideEvent) => void */)?

/**
 * Handler called when the `DismissableLayer` should be dismissed
 */
var onDismiss: (()->Unit)?
}

external interface DismissableLayerBranchProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

@JsName("DismissableLayer")
external val DismissableLayer: react.FC<DismissableLayerProps>

@JsName("DismissableLayerBranch")
external val DismissableLayerBranch: react.FC<DismissableLayerBranchProps>
