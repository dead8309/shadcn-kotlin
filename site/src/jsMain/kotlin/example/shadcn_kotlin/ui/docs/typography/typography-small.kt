package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.small
import web.cssom.ClassName

val TypographySmall = FC<Props> {
    small {
        className = ClassName("text-sm font-medium leading-none")
        + "Email address"
    }
}