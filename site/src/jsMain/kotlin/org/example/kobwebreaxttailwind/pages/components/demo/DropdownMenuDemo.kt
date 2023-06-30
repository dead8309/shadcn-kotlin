package org.example.kobwebreaxttailwind.pages.components.demo

import lucide_react.*
import radix_ui.components.DropdownMenuProps
import react.FC
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

val DropdownMenuDemo = FC<DropdownMenuProps> {
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "outline"
                +"Open"
            }
        }
        DropdownMenuContent {
            className = ClassName("w-56")
            DropdownMenuLabel {
                +"My Account"
            }
            DropdownMenuSeparator {}
            DropdownMenuGroup {
                DropdownMenuItem {
                    User {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
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
                    span {
                        +"Billing"
                    }
                    DropdownMenuShortcut {
                        +"⌘B"
                    }
                }
                DropdownMenuItem {
                    Settings {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
                        +"Settings"
                    }
                    DropdownMenuShortcut {
                        +"⌘S"
                    }
                }
                DropdownMenuItem {
                    Keyboard {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
                        +"Keyboard shortcuts"
                    }
                    DropdownMenuShortcut {
                        +"⌘K"
                    }
                }
            }
            DropdownMenuSeparator {}

            DropdownMenuGroup {
                DropdownMenuItem {
                    Users {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
                        +"Team"
                    }
                }
                DropdownMenuSub {
                    DropdownMenuSubTrigger {
                        UserPlus { className = ClassName("mr-2 h-4 w-4") }
                        span {
                            +"Invite users"
                        }
                    }
                    DropdownMenuPortal {
                        DropdownMenuSubContent {
                            DropdownMenuItem {
                                Mail {
                                    className = ClassName("mr-2 h-4 w-4")
                                }
                                span {
                                    +"Email"
                                }
                            }
                            DropdownMenuItem {
                                MessageSquare {
                                    className = ClassName("mr-2 h-4 w-4")
                                }
                                span {
                                    +"Message"
                                }
                            }
                            DropdownMenuSeparator {}
                            DropdownMenuItem {
                                PlusCircle {
                                    className = ClassName("mr-2 h-4 w-4")
                                }
                                span {
                                    +"More..."
                                }
                            }
                        }
                    }
                }
                DropdownMenuItem {
                    Plus {
                       className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
                        +"New Team"
                    }
                    DropdownMenuShortcut {
                        +"⌘+T"
                    }
                }
            }
            DropdownMenuSeparator {}
            DropdownMenuItem {
                Github {
                    className = ClassName("mr-2 h-4 w-4")
                }
                span {
                    +"Github"
                }
            }
            DropdownMenuItem {
                LifeBuoy {
                    className = ClassName("mr-2 h-4 w-4")
                }
                span {
                    +"Support"
                }
            }
            DropdownMenuItem {
                disabled = true
                Cloud {
                    className = ClassName("mr-2 h-4 w-4")
                }
                span {
                    +"API"
                }
            }
            DropdownMenuSeparator {}
            DropdownMenuItem {
                LogOut {
                    className = ClassName("mr-2 h-4 w-4")
                }
                span {
                    +"Log out"
                }
                DropdownMenuShortcut {
                    +"⇧⌘Q"
                }
            }
        }
    }
}