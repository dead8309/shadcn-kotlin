package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import web.cssom.ClassName

val TypographyLarge = FC<Props> {
    div {
        className = ClassName("text-lg font-semibold")
        +"Are you sure absolutely sure?"
    }
}