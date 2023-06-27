package org.example.kobwebreaxttailwind.pages.components.demo

import radix_ui.components.CheckboxProps
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.label
import shadcn.ui.components.Checkbox
import web.cssom.ClassName


val CheckboxDemo = FC<CheckboxProps> {
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