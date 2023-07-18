package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Label
import shadcn.ui.components.Textarea
import web.cssom.ClassName

val TextareaWithLabel = FC<Props> {
    div {
        className = ClassName("grid w-full gap-1.5")
        Label {
            htmlFor="message"
            + "Your message"
        }
        Textarea {
            placeholder="Type your message here."
            id="message"
        }
    }
}