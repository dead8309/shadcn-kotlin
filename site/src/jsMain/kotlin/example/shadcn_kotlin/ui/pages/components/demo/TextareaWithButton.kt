package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Button
import shadcn.ui.components.Textarea
import web.cssom.ClassName

val TextareaWithButton = FC<Props> {
    div {
        className = ClassName("grid w-full gap-2")
        Textarea { placeholder = "Type your message here." }
        Button { +"Send message" }

    }
}