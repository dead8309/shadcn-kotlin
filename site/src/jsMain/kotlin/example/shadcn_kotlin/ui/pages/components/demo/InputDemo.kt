package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Input
import web.html.InputType

val InputDemo = FC<Props> {
    Input {
        type = InputType.email
        placeholder = "Email"
    }
}