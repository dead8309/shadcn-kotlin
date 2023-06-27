package org.example.kobwebreaxttailwind.pages.dashboard

import org.example.kobwebreaxttailwind.components.react.lucide_react.*
import react.FC
import react.Props
import react.VFC
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName
import web.html.InputType


val DashBoardApp = FC<Props> {
    ReactHTML.section {
        className = ClassName("container grid items-center gap-6 pb-8 pt-6 md:py-10")

        div {
            className = ClassName("md:hidden")
            img {
                src = "/examples/dashboard-light.png"
                width = 1280.0
                height = 866.0
                alt = "Dashboard"
                className = ClassName("block dark:hidden")
            }
            img {
                src = "/examples/dashboard-dark.png"
                width = 1280.0
                height = 866.0
                alt = "Dashboard"
                className = ClassName("hidden dark:block")
            }
        }
        div {
            className = ClassName("hidden flex-col md:flex")
            div {
                className = ClassName("border-b")
                div {
                    className = ClassName("flex h-16 items-center px-4")
                    div {
                        className = ClassName("ml-auto flex items-center space-x-4")
                        Input {
                            type = InputType.search
                            placeholder = "Search..."
                            className = ClassName("md:w-[100px] lg:w-[300px]")
                        }
                        UserNav{}
                    }
                }
            }
            div {
                className = ClassName("flex-1 space-y-4 p-8 pt-6")
                div {
                    className = ClassName("flex items-center justify-between space-y-2")
                    h2 {
                        className = ClassName("text-3xl font-bold tracking-tight")
                        +"Dashboard"
                    }
                    div {
                        className = ClassName("flex items-center space-x-2")/* CalendarDateRangePicker */
                        Button {
                            Download { className = ClassName("mr-2 h-4 w-4") }
                            +"Download"
                        }
                    }
                }/* Tabs */
                Tabs {
                    defaultValue = "overview"
                    className = ClassName("space-y-4")
                    TabsList {
                        TabsTrigger {
                            value = "overview"
                            +"Overview"
                        }
                        TabsTrigger {
                            value = "analytics"
                            disabled = true
                            +"Analytics"
                        }
                        TabsTrigger {
                            value = "reports"
                            disabled = true
                            +"Reports"
                        }
                        TabsTrigger {
                            value = "notifications"
                            disabled = true
                            +"Notifications"
                        }
                    }
                    TabsContent {
                        value = "overview"
                        className = ClassName("space-y-4")

                        div {
                            className = ClassName("grid gap-4 md:grid-cols-2 lg:grid-cols-4")
                            Card {
                                CardHeader {
                                    className = ClassName("flex flex-row items-center justify-between space-y-0 pb-2")
                                    CardTitle {
                                        className = ClassName("text-sm font-medium")
                                        +"Total Revenue"
                                    }
                                    DollarSign {
                                        className = ClassName("h-4 w-4 text-muted-foreground")
                                    }
                                }
                                CardContent {
                                    div {
                                        className = ClassName("text-2xl font-bold")
                                        +"$45,231.89"
                                    }
                                    p {
                                        className = ClassName("text-xs text-muted-foreground")
                                        +"+20.1% from last month"
                                    }
                                }
                            }
                            Card {
                                CardHeader {
                                    className = ClassName("flex flex-row items-center justify-between space-y-0 pb-2")
                                    CardTitle {
                                        className = ClassName("text-sm font-medium")
                                        +"Subscriptions"
                                    }
                                    Users {
                                        className = ClassName("h-4 w-4 text-muted-foreground")
                                    }
                                }
                                CardContent {
                                    div {
                                        className = ClassName("text-2xl font-bold")
                                        +"2350"
                                    }
                                    p {
                                        className = ClassName("text-xs text-muted-foreground")
                                        +"180.1 % from last month"
                                    }
                                }
                            }
                            Card {
                                CardHeader {
                                    className = ClassName("flex flex-row items-center justify-between space-y-0 pb-2")
                                    CardTitle {
                                        className = ClassName("text-sm font-medium")
                                        +"Sales"
                                    }
                                    CreditCard {
                                        className = ClassName("h-4 w-4 text-muted-foreground")
                                    }
                                }
                                CardContent {
                                    div {
                                        className = ClassName("text-2xl font-bold")
                                        +"+12,234"
                                    }
                                    p {
                                        className = ClassName("text-xs text-muted-foreground")
                                        +"+19% from last month"
                                    }
                                }
                            }
                            Card {
                                CardHeader {
                                    className = ClassName("flex flex-row items-center justify-between space-y-0 pb-2")
                                    CardTitle {
                                        className = ClassName("text-sm font-medium")
                                        +"Active Now"
                                    }
                                    CreditCard {
                                        className = ClassName("h-4 w-4 text-muted-foreground")
                                    }
                                }
                                CardContent {
                                    div {
                                        className = ClassName("text-2xl font-bold")
                                        +"+573"
                                    }
                                    p {
                                        className = ClassName("text-xs text-muted-foreground")
                                        +"+201 since last hour"
                                    }
                                }
                            }
                        }
                        div {
                            className = ClassName("grid gap-4 md:grid-cols-2 lg:grid-cols-7")
                            Card {
                                className = ClassName("col-span-4")
                                CardHeader {
                                    CardTitle {
                                        +"Overview"
                                    }
                                }
                                CardContent {
                                    className = ClassName("pl-2")
                                    +"Removed recharts as it was not working well."
                                }
                            }
                            Card {
                                className = ClassName("col-span-3")
                                CardHeader {
                                    CardTitle {
                                        +"Recent Sales"
                                    }
                                    CardDescription {
                                        +"You made 265 sales this month ."
                                    }
                                }
                                CardContent {
                                    div {
                                        className = ClassName("space-y-8")
                                        div {
                                            className = ClassName("flex items-center")
                                            Avatar {
                                                className = ClassName("h-9 w-9")
                                                AvatarImage {
                                                    src = "/avatars/01.png"
                                                    alt = "Avatar"
                                                }
                                                AvatarFallback {
                                                    +"OM"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-4 space-y-1")
                                                p {
                                                    className = ClassName("text-sm font-medium leading-none")
                                                    +"Olivia Marti"
                                                }
                                                p {
                                                    className = ClassName("text-sm text-muted-foreground")
                                                    +"olivia.martin@email.com"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-auto font-medium")
                                                +"+$1, 999.00"
                                            }
                                        }
                                        div {
                                            className = ClassName("flex items-center")
                                            Avatar {
                                                className =
                                                    ClassName("flex h-9 w-9 items-center justify-center space-y-0 border")
                                                AvatarImage {
                                                    src = "/avatars/02.png"
                                                    alt = "Avatar"
                                                }
                                                AvatarFallback {
                                                    +"JL"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-4 space-y-1")
                                                p {
                                                    className = ClassName("text-sm font-medium leading-none")
                                                    +"Jackson Lee"
                                                }
                                                p {
                                                    className = ClassName("text-sm text-muted-foreground")
                                                    +"jackson.lee@email.com"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-auto font-medium")
                                                +"+$39.00"
                                            }
                                        }
                                        div {
                                            className = ClassName("flex items-center")
                                            Avatar {
                                                className = ClassName("h-9 w-9")
                                                AvatarImage {
                                                    src = "/avatars/03.png"
                                                    alt = "Avatar"
                                                }
                                                AvatarFallback {
                                                    +"IN"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-4 space-y-1")
                                                p {
                                                    className = ClassName("text-sm font-medium leading-none")
                                                    +"Isabella Nguyen"
                                                }
                                                p {
                                                    className = ClassName("text-sm text-muted-foreground")
                                                    +"isabella.nguyen@email.com"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-auto font-medium")
                                                +"+$299.00"
                                            }
                                        }
                                        div {
                                            className = ClassName("flex items-center")
                                            Avatar {
                                                className = ClassName("h-9 w-9")
                                                AvatarImage {
                                                    src = "/avatars/04.png"
                                                    alt = "Avatar"
                                                }
                                                AvatarFallback {
                                                    +"WK"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-4 space-y-1")
                                                p {
                                                    className = ClassName("text-sm font-medium leading-none")
                                                    +"William Kim"
                                                }
                                                p {
                                                    className = ClassName("text-sm text-muted-foreground")
                                                    +"will@email.com"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-auto font-medium")
                                                +"+$99.00"
                                            }
                                        }
                                        div {
                                            className = ClassName("flex items-center")
                                            Avatar {
                                                className = ClassName("h-9 w-9")
                                                AvatarImage {
                                                    src = "/avatars/05.png"
                                                    alt = "Avatar"
                                                }
                                                AvatarFallback {
                                                    +"SD"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-4 space-y-1")
                                                p {
                                                    className = ClassName("text-sm font-medium leading-none")
                                                    +"Sofia Davis"
                                                }
                                                p {
                                                    className = ClassName("text-sm text-muted-foreground")
                                                    +"sofia.davis@email.com"
                                                }
                                            }
                                            div {
                                                className = ClassName("ml-auto font-medium")
                                                +"+$39.00"
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

val UserNav = VFC {
    DropdownMenu {
        DropdownMenuTrigger {
            asChild = true
            Button {
                variant = "ghost"
                className = ClassName("relative h-8 w-8 rounded-full")
                Avatar {
                    className = ClassName("h-8 w-8")
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
                div {
                    className = ClassName("flex flex-col space-y-1")
                    p {
                        className = ClassName("text-sm font-medium leading-none")
                        +"shadcn"
                    }
                    p {
                        className = ClassName("text-xs leading-none text-muted-foreground")
                        +"m@ example.com"
                    }
                }
            }
            DropdownMenuSeparator {}
            DropdownMenuGroup {
                DropdownMenuItem {
                    User { className = ClassName("mr-2 h-4 w-4") }
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
                        +"⌘ B"
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
                        +"⌘ S"
                    }
                }
                DropdownMenuItem {
                    PlusCircle {
                        className = ClassName("mr-2 h-4 w-4")
                    }
                    span {
                        +"New Team"
                    }
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