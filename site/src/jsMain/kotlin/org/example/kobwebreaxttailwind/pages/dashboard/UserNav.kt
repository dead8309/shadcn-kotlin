package org.example.kobwebreaxttailwind.pages.dashboard

import lucide_react.*
import react.VFC
import react.dom.html.ReactHTML
import shadcn.ui.components.*
import web.cssom.ClassName


val UserNav = VFC {
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "ghost"
                className = ClassName("relative h-10 w-10 rounded-full")
                Avatar {
                    className = ClassName("h-10 w-10")
                    AvatarImage {
                        src = "/avatars/01.png"
                        alt = "@shadcn"
                    }
                    AvatarFallback {
                        +"SC"
                    }
                }
            }
        }
        DropdownMenuContent {
            className = ClassName("w-56")
            align = "end"
            forceMount = true
            DropdownMenuLabel {
                className = ClassName("font-normal")
                ReactHTML.div {
                    className = ClassName("flex flex-col space-y-1")
                    ReactHTML.p {
                        className = ClassName("text-sm font-medium leading-none")
                        +"shadcn"
                    }
                    ReactHTML.p {
                        className = ClassName("text-xs leading-none text-muted-foreground")
                        +"m@ example.com"
                    }
                }
            }
            DropdownMenuSeparator {}
            DropdownMenuGroup {
                DropdownMenuItem {
                    User { className = ClassName("mr-2 h-4 w-4") }
                    ReactHTML.span {
                        +"Profile"
                    }
                    DropdownMenuShortcut {
                        +"⇧⌘P"
                    }
                }
                DropdownMenuItem {
                    CreditCard {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    ReactHTML.span {
                        +"Billing"
                    }
                    DropdownMenuShortcut {
                        +"⌘ B"
                    }
                }
                DropdownMenuItem {
                    Settings {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    ReactHTML.span {
                        +"Settings"
                    }
                    DropdownMenuShortcut {
                        +"⌘ S"
                    }
                }
                DropdownMenuItem {
                    PlusCircle {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    ReactHTML.span {
                        +"New Team"
                    }
                }
            }
            DropdownMenuSeparator {}
            DropdownMenuItem {
                LogOut {
                    className = ClassName("mr-2 h-4 w-4")
                }
                ReactHTML.span {
                    +"Log out"
                }
                DropdownMenuShortcut {
                    +"⇧⌘Q"
                }
            }
        }
    }
}