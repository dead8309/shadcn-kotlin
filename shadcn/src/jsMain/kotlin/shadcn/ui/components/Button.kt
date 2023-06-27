// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/button")
@file:JsNonModule

package shadcn.ui.components

import react.FC
import react.dom.html.ButtonHTMLAttributes
import web.html.HTMLButtonElement

external interface ButtonProps: ButtonHTMLAttributes<HTMLButtonElement> {
    @JsName("variant")
    var variant: String
    @JsName("size")
    var size: String
    override var disabled: Boolean?
}

@JsName("Button")
external val Button: FC<ButtonProps>