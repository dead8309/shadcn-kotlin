package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Checkbox
import shadcn.ui.components.Label
import web.cssom.ClassName

val LabelDemo = FC<Props> {
    div {
        div {
            className = ClassName("flex items-center space-x-2")
            Checkbox { id = "terms" }
            Label {
                htmlFor = "terms"
                + "Accept terms and conditions"
            }
        }
    }
}