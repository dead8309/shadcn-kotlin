@file:JsModule("lucide-react")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.lucide_react

import react.FC
import react.dom.svg.SVGAttributes
import web.svg.SVGElement

external interface LucideProps : SVGAttributes<SVGElement> {
    var size: String?
    var absoluteStrokeWidth: Boolean
}

@JsName("Activity")
external val Activity: FC<LucideProps>

@JsName("CreditCard")
external val CreditCard: FC<LucideProps>

@JsName("DollarSign")
external val DollarSign: FC<LucideProps>

@JsName("Download")
external val Download: FC<LucideProps>

@JsName("Users")
external val Users: FC<LucideProps>

@JsName("LogOut")
external val LogOut: FC<LucideProps>

@JsName("PlusCircle")
external val PlusCircle: FC<LucideProps>

@JsName("Settings")
external val Settings: FC<LucideProps>

@JsName("User")
external val User: FC<LucideProps>
