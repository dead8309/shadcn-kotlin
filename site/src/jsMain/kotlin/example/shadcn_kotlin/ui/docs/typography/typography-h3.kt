package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.h3
import web.cssom.ClassName

val TypographyH3 = FC<Props> {
    h3 {
        className = ClassName("scroll-m-20 text-2xl font-semibold tracking-tight")
        + "The Joke Tax"
    }
}