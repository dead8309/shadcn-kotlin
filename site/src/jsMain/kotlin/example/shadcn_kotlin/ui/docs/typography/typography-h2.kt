package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.h2
import web.cssom.ClassName

val TypographyH2 = FC<Props> {
    h2 {
        className = ClassName("scroll-m-20 border-b pb-2 text-3xl font-semibold tracking-tight transition-colors first:mt-0")
        + "The People of the Kingdom"
    }
}