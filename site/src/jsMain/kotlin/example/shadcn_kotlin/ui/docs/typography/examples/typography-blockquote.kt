package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.blockquote
import web.cssom.ClassName

val TypographyBlockquote = FC<Props> {
    blockquote {
        className = ClassName("mt-6 border-l-2 pl-6 italic")
        + "After all,\" he said, \"everyone enjoys a good joke, so it's only fair that"
        + "they should pay for the privilege."
    }
}