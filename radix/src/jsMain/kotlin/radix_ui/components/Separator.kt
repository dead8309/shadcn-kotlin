// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-separator")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface SeparatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
/**
 * Either `vertical` or `horizontal`. Defaults to `horizontal`.
 */
var orientation: String?

/**
 * Whether or not the component is purely decorative. When true, accessibility-related attributes
 * are updated so that that the rendered element is removed from the accessibility tree.
 */
var decorative: Boolean?
}

@JsName("Separator")
external val Separator: react.FC<SeparatorProps>
