package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Input
import web.html.InputType

val InputDisabled = FC<Props> {
    Input {
        disabled = true
        type = InputType.email
        placeholder = "Email"
    }
}