package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Button
import shadcn.ui.components.Input
import web.cssom.ClassName
import web.html.ButtonType
import web.html.InputType

val InputWithButton = FC<Props> {
    div {
        className = ClassName("flex w-full max-w-sm items-center space-x-2")
        Input {
            type = InputType.email
            placeholder = "Email"
        }
        Button {
            type = ButtonType.submit
            +"Subscribe"
        }
    }
}