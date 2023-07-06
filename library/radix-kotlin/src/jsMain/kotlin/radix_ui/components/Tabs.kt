// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-tabs")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface TabsProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
/** The value for the selected tab, if controlled */
var value: String?

/** The value of the tab to select by default, if uncontrolled */
var defaultValue: String?

/** A function called when a new tab is selected */
var onValueChange: ((value: Any) -> Unit)?

/**
 * The orientation the tabs are layed out.
 * Mainly so arrow navigation is done accordingly (left & right vs. up & down)
 * @defaultValue horizontal
 */
var orientation: dynamic /* RovingFocusGroupProps['orientation'] */

/**
 * The direction of navigation between toolbar items.
 */
var dir: dynamic /* RovingFocusGroupProps['dir'] */

/**
 * Whether a tab is activated automatically or manually.
 * @defaultValue automatic
 * */
var activationMode: String? /* 'automatic' | 'manual' */
}

external interface TabsListProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var loop: dynamic /* RovingFocusGroupProps['loop'] */
}

external interface TabsTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
var value: String
}

external interface TabsContentProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var value: String

/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

@JsName("Tabs")
internal external val Tabs: react.FC<TabsProps>

@JsName("TabsList")
internal external val TabsList: react.FC<TabsListProps>

@JsName("TabsTrigger")
internal external val TabsTrigger: react.FC<TabsTriggerProps>

@JsName("TabsContent")
internal external val TabsContent: react.FC<TabsContentProps>
