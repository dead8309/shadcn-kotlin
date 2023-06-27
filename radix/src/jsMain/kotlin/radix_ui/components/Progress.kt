// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-progress")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface ProgressProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var value: dynamic

var max: Number?

var getValueLabel: dynamic
}

external interface ProgressIndicatorProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

@JsName("Progress")
internal external val Progress: react.FC<ProgressProps>

@JsName("ProgressIndicator")
internal external val ProgressIndicator: react.FC<ProgressIndicatorProps>
