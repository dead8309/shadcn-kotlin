package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import web.cssom.ClassName

val TypographyH1 = FC<Props> {
    h1 {
        className = ClassName("scroll-m-20 text-4xl font-extrabold tracking-tight lg:text-5xl")
        + "Taxing Laughter: The Joke Tax Chronicles"
    }
}