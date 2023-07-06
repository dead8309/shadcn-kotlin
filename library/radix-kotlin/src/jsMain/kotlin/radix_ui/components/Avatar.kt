// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-avatar")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface AvatarProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {

}

external interface AvatarImageProps: 
react.dom.html.ImgHTMLAttributes<web.html.HTMLImageElement>,
react.PropsWithClassName {
var onLoadingStatusChange: ((status: String)->Unit)?
}

external interface AvatarFallbackProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
var delayMs: Number?
}

@JsName("Avatar")
internal external val Avatar: react.FC<AvatarProps>

@JsName("AvatarImage")
internal external val AvatarImage: react.FC<AvatarImageProps>

@JsName("AvatarFallback")
internal external val AvatarFallback: react.FC<AvatarFallbackProps>
