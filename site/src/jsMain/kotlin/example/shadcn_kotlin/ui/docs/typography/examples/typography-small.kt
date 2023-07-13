package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.small
import react.dom.html.ReactHTML.ul
import web.cssom.ClassName

val TypographySmall = FC<Props> {
    small {
        className = ClassName("text-sm font-medium leading-none")
        + "Email address"
    }
}