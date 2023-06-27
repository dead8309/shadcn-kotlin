// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-popper")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface PopperProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?
}

external interface PopperAnchorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var virtualRef: dynamic
}

external interface PopperContentProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var side: dynamic

var sideOffset: Number?

var align: dynamic

var alignOffset: Number?

var arrowPadding: Number?

var collisionBoundary: dynamic

var collisionPadding: dynamic

var sticky: String? /* 'partial' | 'always' */

var hideWhenDetached: Boolean?

var avoidCollisions: Boolean?

var onPlaced: (()->Unit)?
}

external interface PopperArrowProps: 
ArrowProps,
react.PropsWithClassName {

}

@JsName("Popper")
external val Popper: react.FC<PopperProps>

@JsName("PopperAnchor")
external val PopperAnchor: react.FC<PopperAnchorProps>

@JsName("PopperContent")
external val PopperContent: react.FC<PopperContentProps>

@JsName("PopperArrow")
external val PopperArrow: react.FC<PopperArrowProps>
