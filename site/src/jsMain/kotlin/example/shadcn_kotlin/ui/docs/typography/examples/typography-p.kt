package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import web.cssom.ClassName

val TypographyP = FC<Props> {
    p {
        className = ClassName("leading-7 [&:not(:first-child)]:mt-6")
        +"The king, seeing how much happier his subjects were, realized the error of"
        +"his ways and repealed the joke tax."
    }
}