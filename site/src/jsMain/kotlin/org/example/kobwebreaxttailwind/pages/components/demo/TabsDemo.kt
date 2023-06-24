package org.example.kobwebreaxttailwind.pages.components.demo

import org.example.kobwebreaxttailwind.components.react.ui.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import web.cssom.ClassName
import web.html.InputType

val TabsDemo = FC<Props> {
    Tabs {
        defaultValue="account"
        className = ClassName("w-[400px]")
        TabsList {
            className=ClassName("grid w-full grid-cols-2")
            TabsTrigger {
                value = "account"
                +"Account"
            }
            TabsTrigger {
                value = "password"
                +"Password"
            }
        }
        TabsContent {
            value = "account"
            Card {
                CardHeader {
                    CardTitle {
                        +"Account"
                    }
                    CardDescription {
                        +"Make changes to your account here. "
                        +"Click save when you're done."
                    }
                }
                CardContent {
                    className = ClassName("space-y-2")
                    div {
                        className = ClassName("space-y-1")
                        Label {
                            htmlFor ="name"
                            +"Name"
                        }
                        Input {
                            id="name"
                            defaultValue ="Pedro Duarte"
                        }
                    }
                    div {
                        className = ClassName("space-y-1")
                        Label {
                            htmlFor = "username"
                            +"Username"
                        }
                        Input {
                            id = "username"
                            defaultValue = "@peduarte"
                        }
                    }
                }
                CardFooter {
                    Button {
                        +"Save changes"
                    }
                }
            }
        }
        TabsContent {
            value = "password"
            Card {
                CardHeader {
                    CardTitle {
                        +"Password"
                    }
                    CardDescription {
                        +"Change your password here."
                        +"After saving, you'll be logged out."
                    }
                }
                CardContent {
                    className = ClassName("space-y-2")
                    div {
                        className = ClassName("space-y-1")
                        Label {
                            htmlFor ="current"
                            +"Current password"
                        }
                        Input {
                            id="current"
                            type = InputType.password
                        }
                    }
                    div {
                        className = ClassName("space-y-1")
                        Label {
                            htmlFor = "new"
                            +"New password"
                        }
                        Input {
                            id = "new"
                            type = InputType.password
                        }
                    }
                }
                CardFooter {
                    Button {
                        +"Save password"
                    }
                }
            }
        }
    }
}