package org.example.kobwebreaxttailwind.pages.components.demo

import org.example.kobwebreaxttailwind.components.react.ui.CheckBoxProps
import org.example.kobwebreaxttailwind.components.react.ui.Checkbox
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.label
import web.cssom.ClassName


val CheckboxDemo = FC<CheckBoxProps> {
    div {
        className = ClassName("flex items-center space-x-2")
        Checkbox {
            id = "terms"
        }
        label {
            htmlFor = "terms"
            className = ClassName("text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70")
            +"Accept terms and conditions"
        }
    }
}