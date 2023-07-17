package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import web.cssom.ClassName

val TypographyMuted = FC<Props> {
    p {
        className = ClassName("text-sm text-muted-foreground")
        + "Enter your email address."
    }
}