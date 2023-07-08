package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.BellRing
import lucide_react.Check
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

data class Notification(
    val title: String,
    val description: String
)


 val notifications = listOf(
     Notification(
         title = "Your call has been confirmed.",
         description =  "1 hour ago",
     ),
     Notification(
         title = "You have a new message!",
         description =  "1 hour ago",
     ),
     Notification(
         title = "Your subscription is expiring soon!",
         description =  "2 hour ago",
     ),
 )
val CardDemo = FC<CardProps> {
    Card {
        className = ClassName("w-[380px]")
        CardHeader {
            CardTitle {
                +"Notifications"
            }
            CardDescription {
                +"You have 1 unread messages"
            }
        }
        CardContent {
            className = ClassName("grid gap-4")
            div {
                className = ClassName("flex items-center p-4 space-x-4 border rounded-md ")
                BellRing {}
                div {
                    className = ClassName("flex-1 space-y-1")
                    p {
                        className = ClassName("text-sm font-medium leading-none")
                        +"Push Notifications"
                    }
                    p {
                        className = ClassName("text-sm text-muted-foreground")
                        +"Send notifications to device."
                    }
                }

            }
            div {
                notifications.forEachIndexed { index, notification ->
                    div {
                        key = index.toString()
                        className = ClassName("mb-4 grid grid-cols-[25px_1fr] items-start pb-4 last:mb-0 last:pb-0")
                        span {
                            className = ClassName("flex w-2 h-2 translate-y-1 rounded-full bg-sky-500")
                        }
                        div {
                            className = ClassName("space-y-1")
                            p {
                                className = ClassName("text-sm font-medium leading-none")
                                +notification.title
                            }
                            p {
                                className = ClassName("text-sm text-muted-foreground")
                                +notification.description
                            }
                        }
                    }
                }

            }
        }
        CardFooter {
            Button {
                className = ClassName("w-full")
                Check {
                    className = ClassName("w-4 h-4 mr-2")
                }
                +"Mark all as read"
            }
        }
    }
}