// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-roving-focus")
@file:JsNonModule

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface RovingFocusGroupProps: 
RovingFocusGroupImplProps,
react.PropsWithClassName {

}

external interface RovingFocusGroupImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var currentTabStopId: String?

var defaultCurrentTabStopId: String?

var onCurrentTabStopIdChange: ((tabStopId: String?)->Unit)?

var onEntryFocus: ((event: Event)->Unit)?
}

external interface RovingFocusItemProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
var tabStopId: String?

var focusable: Boolean?

var active: Boolean?
}

@JsName("RovingFocusGroup")
external val RovingFocusGroup: react.FC<RovingFocusGroupProps>

@JsName("RovingFocusGroupItem")
external val RovingFocusGroupItem: react.FC<dynamic>
