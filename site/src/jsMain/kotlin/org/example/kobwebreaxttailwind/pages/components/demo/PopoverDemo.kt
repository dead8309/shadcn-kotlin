package org.example.kobwebreaxttailwind.pages.components.demo

import lucide_react.Settings2
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

val PopoverDemo = FC<Props> {
    Popover {
        PopoverTrigger {
            asChild = true
            Button {
                variant = "outline"
                className = ClassName("w-10 rounded-full p-0")
                Settings2 { className = ClassName("h-4 w-4") }
                span {
                    className = ClassName("sr-only")
                    +"Open popover"
                }
            }
        }
        PopoverContent {
            className = ClassName("w-80")
            div {
                className = ClassName("grid gap-4")
                div {
                    className = ClassName("space-y-2")
                    h4 {
                        className = ClassName("font-medium leading-none")
                        +"Dimensions"
                    }
                    p {
                        className = ClassName("text-sm text-muted-foreground")
                        +"Set the dimensions for the layer ."
                    }
                }
                div {
                    className = ClassName("grid gap-2")
                    div {
                        className = ClassName("grid grid-cols-3 items-center gap-4")
                        Label {
                            htmlFor = "width"
                            +"Width"
                        }
                        Input {
                            id = "width"
                            defaultValue = "100%"
                            className = ClassName("col-span-2 h-8")
                        }
                    }
                    div {
                        className = ClassName("grid grid-cols-3 items-center gap-4")
                        Label {
                            htmlFor = "maxWidth"
                            +"Max.width"
                        }
                        Input {
                            id = "maxWidth"
                            defaultValue = "300px"
                            className = ClassName("col-span-2 h-8")
                        }
                    }
                    div {
                        className = ClassName("grid grid-cols-3 items-center gap-4")
                        Label {
                            htmlFor = "height"
                            +"Height"
                        }
                        Input {
                            id = "height"
                            defaultValue = "25px"
                            className = ClassName("col-span-2 h-8")
                        }
                    }
                    div {
                        className = ClassName("grid grid-cols-3 items-center gap-4")
                        Label {
                            htmlFor = "maxHeight"
                            +"Max. height"
                        }
                        Input {
                            id = "maxHeight"
                            defaultValue = "none"
                            className = ClassName("col-span-2 h-8")
                        }
                    }
                }
            }
        }
    }
}