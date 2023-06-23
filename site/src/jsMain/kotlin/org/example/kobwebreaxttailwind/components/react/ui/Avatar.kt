@file:JsModule("@lshay/ui/components/avatar")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import react.PropsWithChildren
import react.PropsWithClassName
import react.dom.html.ImgHTMLAttributes
import web.html.HTMLImageElement
import web.html.HTMLSpanElement

external interface AvatarProps: StandardProps<HTMLSpanElement> {
    var asChild: Boolean
}

@JsName("Avatar")
external val Avatar: FC<AvatarProps>


external interface AvatarImageProps: PropsWithClassName, PropsWithChildren,ImgHTMLAttributes<HTMLImageElement> {
    var onLoadingStatusChange: (status: String) -> Unit
}

@JsName("AvatarImage")
external val AvatarImage: FC<AvatarImageProps>


external interface AvatarFallbackProps: StandardProps<HTMLSpanElement> {
    var delayMs: Number?;
}

@JsName("AvatarFallback")
external val AvatarFallback: FC<AvatarFallbackProps>




