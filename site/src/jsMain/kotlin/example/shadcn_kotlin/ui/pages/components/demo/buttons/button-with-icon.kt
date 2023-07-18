package example.shadcn_kotlin.ui.pages.components.demo.buttons

import lucide_react.Mail
import react.FC
import react.Props
import shadcn.ui.components.Button
import web.cssom.ClassName

val ButtonWithIcon = FC<Props> {
    Button {
        Mail {
            className = ClassName("mr-2 h-4 w-4")
        }
        +"Login with Email"
    }
}