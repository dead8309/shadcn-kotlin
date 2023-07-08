package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.*
import web.cssom.ClassName
import web.html.ButtonType

val DialogDemo = FC<Props> {
    Dialog {
        DialogTrigger {
            asChild = true
            Button {
                variant = "outline"
                +"Edit Profile"
            }
        }
        DialogContent {
            className = ClassName("sm:max-w-[425px]")
            DialogHeader {
                DialogTitle {
                    +"Edit profile"
                }
                DialogDescription {
                    +"Make changes to your profile here . Click save when you 're done."
                }
            }
            div {
                className = ClassName("grid gap-4 py-4")
                div {
                    className = ClassName("grid grid-cols-4 items-center gap-4")
                    Label {
                        htmlFor = "name"
                        className = ClassName("text-right")
                        +"Name"
                    }
                    Input {
                        id = "name"
                        defaultValue = "Pedro Duarte"
                        className = ClassName("col-span-3")
                    }
                }
                div {
                    className = ClassName("grid grid-cols-4 items-center gap-4")
                    Label {
                        htmlFor = "username"
                        className = ClassName("text-right")
                        +"Username"
                    }
                    Input {
                        id = "username"
                        defaultValue = "@peduarte"
                        className = ClassName("col-span-3")
                    }
                }
            }
            DialogFooter {
                Button {
                    type = ButtonType.submit
                    +"Save changes"
                }
            }
        }
    }
}