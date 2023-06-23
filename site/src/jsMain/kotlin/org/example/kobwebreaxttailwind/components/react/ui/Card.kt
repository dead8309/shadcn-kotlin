@file:JsModule("@lshay/ui/components/card")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.html.HTMLDivElement
import web.html.HTMLHeadingElement
import web.html.HTMLParagraphElement

external interface CardProps: StandardProps<HTMLDivElement>

@JsName("Card")
external val Card: FC<CardProps>

@JsName("CardHeader")
external val CardHeader: FC<CardProps>

@JsName("CardTitle")
external val CardTitle: FC<StandardProps<HTMLHeadingElement>>

@JsName("CardDescription")
external val CardDescription: FC<StandardProps<HTMLParagraphElement>>

@JsName("CardContent")
external val CardContent: FC<CardProps>

@JsName("CardFooter")
external val CardFooter: FC<CardProps>

