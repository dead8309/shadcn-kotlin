package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.*
import web.cssom.ClassName

val SheetSideDemo = FC<Props> {
    val sheetSides = listOf("top", "right", "bottom", "left")
    div {
        className = ClassName("grid grid-cols-2 gap-2")
        sheetSides.forEach { side ->
            Sheet {
                key = side
                SheetTrigger {
                    asChild = true
                    Button {
                        variant = "outline"
                        +side
                    }
                }
                SheetContent {
                    position = side
                    SheetHeader {
                        SheetTitle {
                            +"Edit profile"
                        }
                        SheetDescription {
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
                    SheetFooter {
                        Button {
                            +"Save Changes"
                        }
                    }
                }
            }
        }
    }

}