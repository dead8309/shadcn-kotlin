package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.h4
import web.cssom.ClassName

val TypographyH4 = FC<Props> {
    h4 {
        className = ClassName("scroll-m-20 text-xl font-semibold tracking-tight")
        + "People stopped telling jokes"
    }
}