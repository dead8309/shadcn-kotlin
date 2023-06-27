// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-scroll-area")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface ScrollAreaProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var type: dynamic /* ScrollAreaContextValue['type'] */

var dir: dynamic /* ScrollAreaContextValue['dir'] */

var scrollHideDelay: Number?
}

external interface ScrollAreaViewportProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface ScrollAreaScrollbarProps: 
ScrollAreaScrollbarVisibleProps,
react.PropsWithClassName {
var forceMount: Boolean? /* true */
}

external interface ScrollAreaScrollbarVisibleProps: 
ScrollAreaScrollbarAxisProps,
react.PropsWithClassName {
var orientation: String?
}

external interface ScrollAreaScrollbarAxisProps: 
ScrollAreaScrollbarImplProps,
react.PropsWithClassName {

}

external interface ScrollAreaScrollbarImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>, ScrollAreaScrollbarImplPrivateProps,
react.PropsWithClassName {

}

external interface ScrollAreaThumbProps: 
ScrollAreaThumbImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface ScrollAreaThumbImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface ScrollAreaCornerProps: 
ScrollAreaCornerImplProps,
react.PropsWithClassName {

}

external interface ScrollAreaCornerImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface ScrollAreaScrollbarAxisPrivateProps {
var hasThumb: Boolean

var sizes: dynamic

var onSizesChange: dynamic

var onThumbChange: dynamic

var onThumbPointerDown: dynamic

var onThumbPointerUp: Unit

var onThumbPositionChange: Unit

var onWheelScroll: dynamic

var onDragScroll: dynamic
}

external interface ScrollAreaScrollbarImplPrivateProps {
var sizes: dynamic

var hasThumb: Boolean

var onThumbChange: dynamic /* ScrollbarContext['onThumbChange'] */

var onThumbPointerUp: dynamic /* ScrollbarContext['onThumbPointerUp'] */

var onThumbPointerDown: dynamic /* ScrollbarContext['onThumbPointerDown'] */

var onThumbPositionChange: dynamic /* ScrollbarContext['onThumbPositionChange'] */

var onWheelScroll: dynamic

var onDragScroll: dynamic
}

@JsName("ScrollArea")
external val ScrollArea: react.FC<ScrollAreaProps>

@JsName("ScrollAreaViewport")
external val ScrollAreaViewport: react.FC<ScrollAreaViewportProps>

@JsName("ScrollAreaScrollbar")
external val ScrollAreaScrollbar: react.FC<ScrollAreaScrollbarProps>

@JsName("ScrollAreaThumb")
external val ScrollAreaThumb: react.FC<ScrollAreaThumbProps>

@JsName("ScrollAreaCorner")
external val ScrollAreaCorner: react.FC<ScrollAreaCornerProps>
