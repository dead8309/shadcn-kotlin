package example.shadcn_kotlin.ui.pages.dashboard

import lucide_react.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import shadcn.ui.components.*
import web.cssom.ClassName


val DashBoardApp = FC<Props> {
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
                MainNavDashboard { className = ClassName("mx-6") }
                div {
                    className = ClassName("ml-auto flex items-center space-x-4")
                    Search {}
                    UserNav {}
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
            }
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
                                    +"+2350"
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
                                Activity {
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
                                RecentSales {}
                            }
                        }
                    }
                }
            }
        }
    }
}