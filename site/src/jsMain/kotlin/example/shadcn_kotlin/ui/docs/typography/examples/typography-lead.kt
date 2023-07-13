package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import web.cssom.ClassName

val TypographyLead = FC<Props> {
    p {
       className= ClassName("text-xl text-muted-foreground")
        +"A modal dialog that interrupts the user with important content and expects a response."
    }
}