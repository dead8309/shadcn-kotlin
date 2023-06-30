package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Label
import shadcn.ui.components.Switch
import web.cssom.ClassName

val SwitchDemo = FC<Props> {
    div {
        className = ClassName("flex items-center space-x-2")
        Switch { id = "airplane-mode" }
        Label {
            htmlFor = "airplane-mode"
            +"Airplane Mode"
        }
    }
}