package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import react.ReactNode
import shadcn.ui.components.*
import web.cssom.ClassName

val SelectDemo = FC<Props> {
    Select {
        SelectTrigger {
            className = ClassName("w-[180px]")
            SelectValue {
                placeholder = ReactNode("Select a fruit")
            }
        }
        SelectContent {
            SelectGroup {
                SelectLabel { +"Fruits" }
                SelectItem {
                    value = "apple"
                    +"Apple"
                }
                SelectItem {
                    value = "banana"
                    +"Banana"
                }
                SelectItem {
                    value = "blueberry"
                    +"Blueberry"
                }
                SelectItem {
                    value = "grapes"
                    +"Grapes"
                }
                SelectItem {
                    value = "pineapple"
                    +"Pineapple"
                }
            }
        }
    }
}