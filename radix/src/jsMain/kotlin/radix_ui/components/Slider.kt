// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-slider")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface SliderProps: 
SliderHorizontalProps,
SliderVerticalProps,
react.PropsWithClassName {
var name: String?

var disabled: Boolean?

var orientation: dynamic /* React.AriaAttributes['aria-orientation'] */

var dir: String?

var min: Number?

var max: Number?

var step: Number?

var minStepsBetweenThumbs: Number?

var value: dynamic

var defaultValue: dynamic

var onValueChange: (value: Any) -> Unit

var onValueCommit: dynamic

var inverted: Boolean?
}

external interface SliderOrientationProps: 
SliderImplProps,
react.PropsWithClassName {

}

external interface SliderHorizontalProps: 
SliderOrientationProps,
react.PropsWithClassName {
var dir: String?
}

external interface SliderVerticalProps: 
SliderOrientationProps,
react.PropsWithClassName {

}

external interface SliderImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>, SliderImplPrivateProps,
react.PropsWithClassName {

}

external interface SliderTrackProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface SliderRangeProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface SliderThumbProps: 
SliderThumbImplProps,
react.PropsWithClassName {

}

external interface SliderThumbImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
var index: Number
}

external interface SliderOrientationPrivateProps {
var min: Number

var max: Number

var inverted: Boolean

var onSlideStart: dynamic

var onSlideMove: dynamic

var onSlideEnd: Unit

var onHomeKeyDown: dynamic

var onEndKeyDown: dynamic

var onStepKeyDown: dynamic
}

external interface SliderImplPrivateProps {
var onSlideStart: dynamic

var onSlideMove: dynamic

var onSlideEnd: dynamic

var onHomeKeyDown: dynamic

var onEndKeyDown: dynamic

var onStepKeyDown: dynamic
}

@JsName("Slider")
internal external val Slider: react.FC<SliderProps>

@JsName("SliderTrack")
internal external val SliderTrack: react.FC<SliderTrackProps>

@JsName("SliderRange")
internal external val SliderRange: react.FC<SliderRangeProps>

@JsName("SliderThumb")
internal external val SliderThumb: react.FC<SliderThumbProps>
