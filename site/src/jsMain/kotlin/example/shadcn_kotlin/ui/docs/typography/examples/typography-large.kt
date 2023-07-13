package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import web.cssom.ClassName

val TypographyLarge = FC<Props> {
    div {
        className = ClassName("text-lg font-semibold")
        +"Are you sure absolutely sure?"
    }
}