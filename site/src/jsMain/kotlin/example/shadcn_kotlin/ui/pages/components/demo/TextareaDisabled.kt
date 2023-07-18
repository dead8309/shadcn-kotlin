package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Textarea

val TextareaDisabled = FC<Props> {
    Textarea {
        placeholder = "Type your message here."
        disabled = true
    }
}