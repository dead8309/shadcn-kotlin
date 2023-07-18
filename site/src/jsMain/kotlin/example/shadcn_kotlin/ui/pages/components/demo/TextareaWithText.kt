package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import shadcn.ui.components.Label
import shadcn.ui.components.Textarea
import web.cssom.ClassName

val TextareaWithText = FC<Props> {
    div {
        className = ClassName("grid w-full gap-1.5")
        Label {
            htmlFor = "message-2"
            +"Your message"
        }
        Textarea {
            placeholder = "Type your message here."
            id = "message-2"
        }
        p {
            className = ClassName("text-sm text-muted-foreground")
            + "Your message will be copied to the support team."
        }
    }
}