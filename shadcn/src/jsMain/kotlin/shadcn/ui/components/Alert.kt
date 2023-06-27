// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/alert")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package shadcn.ui.components


import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLHeadingElement
import web.html.HTMLParagraphElement

external interface AlertProps: HTMLAttributes<HTMLDivElement> {
    var variant: String /* 'default' | 'destructive' */
}

@JsName("Alert")
external val Alert: react.FC<AlertProps>

@JsName("AlertTitle")
external val AlertTitle: react.FC<HTMLAttributes<HTMLHeadingElement>>

@JsName("AlertDescription")
external val AlertDescription: react.FC<HTMLAttributes<HTMLParagraphElement>>
