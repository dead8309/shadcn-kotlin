// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-collapsible")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface CollapsibleProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var defaultOpen: Boolean?

var open: Boolean?

var disabled: Boolean?

var onOpenChange: dynamic
}

external interface CollapsibleTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
    var asChild: Boolean?
}

external interface CollapsibleContentProps: 
CollapsibleContentImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface CollapsibleContentImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var present: Boolean
}

@JsName("Collapsible")
internal external val Collapsible: react.FC<CollapsibleProps>

@JsName("CollapsibleTrigger")
internal external val CollapsibleTrigger: react.FC<CollapsibleTriggerProps>

@JsName("CollapsibleContent")
internal external val CollapsibleContent: react.FC<CollapsibleContentProps>
