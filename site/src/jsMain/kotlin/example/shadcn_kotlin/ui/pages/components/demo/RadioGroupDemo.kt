package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Label
import shadcn.ui.components.RadioGroup
import shadcn.ui.components.RadioGroupItem
import web.cssom.ClassName

val RadioGroupDemo = FC<Props> {
    RadioGroup {
        defaultValue = "comfortable"
        div {
            className = ClassName("flex items-center space-x-2")
            RadioGroupItem {
                value = "default"
                id = "r1"
            }
            Label {
                htmlFor = "r1"
                +"Default"
            }
        }
        div {
            className = ClassName("flex items-center space-x-2")
            RadioGroupItem {
                value = "comfortable"
                id = "r2"
            }
            Label {
                htmlFor = "r2"
                +"Comfortable"
            }
        }
        div {
            className = ClassName("flex items-center space-x-2")
            RadioGroupItem {
                value = "compact"
                id = "r3"
            }
            Label {
                htmlFor = "r3"
                +"Compact"
            }
        }
    }
}
