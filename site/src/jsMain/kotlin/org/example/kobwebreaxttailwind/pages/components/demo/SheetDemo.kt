package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import shadcn.ui.components.*
import web.cssom.ClassName
import web.html.ButtonType

val SheetDemo = FC<Props> {
    h4 {
        className = ClassName("text-sm text-destructive")
        + "Currently broken"
    }
    /*
Sheet {
    SheetTrigger {
        asChild = true
        Button {
            variant = "outline"
            +"Open"
        }
    }
    SheetContent {
        position = "right"
        size = "sm"
        shadcn.ui.components.SheetHeader {
            shadcn.ui.components.SheetTitle {
                +"Edit profile"
            }
            shadcn.ui.components.SheetDescription {
                +"Make changes to your profile here . Click save when you 're done."
            }
        }
        react.dom.html.ReactHTML.div {
            className = web.cssom.ClassName("grid gap-4 py-4")
            react.dom.html.ReactHTML.div {
                className = web.cssom.ClassName("grid grid-cols-4 items-center gap-4")
                shadcn.ui.components.Label {
                    htmlFor = "name"
                    className = web.cssom.ClassName("text-right")
                    +"Name"
                }

            }
            react.dom.html.ReactHTML.div {
                className = web.cssom.ClassName("grid grid-cols-4 items-center gap-4")
                shadcn.ui.components.Label {
                    htmlFor = "username"
                    className = web.cssom.ClassName("text-right")
                    +"Username"
                }
                shadcn.ui.components.Input {
                    id = "username"
                    value = "@peduarte"
                    className = web.cssom.ClassName("col-span-3")
                }
            }
        }
        shadcn.ui.components.SheetFooter {
            shadcn.ui.components.SheetClose {
                asChild = true
                shadcn.ui.components.Button {
                    type = web.html.ButtonType.submit
                    +"Save changes"
                }
            }
        }
    }
}*/
}
