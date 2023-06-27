// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-focus-scope")
@file:JsNonModule

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface FocusScopeProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
/**
 * When `true`, tabbing from last item will focus first tabbable
 * and shift+tab from first item will focus last tababble.
 * @defaultValue false
 */
var loop: Boolean?

/**
 * When `true`, focus cannot escape the focus scope via keyboard,
 * pointer, or a programmatic focus.
 * @defaultValue false
 */
var trapped: Boolean?

/**
 * Event handler called when auto-focusing on mount.
 * Can be prevented.
 */
var onMountAutoFocus: ((event: Event)->Unit)?

/**
 * Event handler called when auto-focusing on unmount.
 * Can be prevented.
 */
var onUnmountAutoFocus: ((event: Event)->Unit)?
}

@JsName("FocusScope")
internal external val FocusScope: react.FC<FocusScopeProps>
