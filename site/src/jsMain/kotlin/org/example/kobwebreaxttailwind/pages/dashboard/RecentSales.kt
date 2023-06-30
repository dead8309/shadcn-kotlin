package org.example.kobwebreaxttailwind.pages.dashboard

import react.FC
import react.Props
import react.dom.html.ReactHTML
import shadcn.ui.components.Avatar
import shadcn.ui.components.AvatarFallback
import shadcn.ui.components.AvatarImage
import web.cssom.ClassName

val RecentSales = FC<Props> {
    ReactHTML.div {
        className = ClassName("space-y-8")
        ReactHTML.div {
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
            ReactHTML.div {
                className = ClassName("ml-4 space-y-1")
                ReactHTML.p {
                    className = ClassName("text-sm font-medium leading-none")
                    +"Olivia Marti"
                }
                ReactHTML.p {
                    className = ClassName("text-sm text-muted-foreground")
                    +"olivia.martin@email.com"
                }
            }
            ReactHTML.div {
                className = ClassName("ml-auto font-medium")
                +"+$1, 999.00"
            }
        }
        ReactHTML.div {
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
            ReactHTML.div {
                className = ClassName("ml-4 space-y-1")
                ReactHTML.p {
                    className = ClassName("text-sm font-medium leading-none")
                    +"Jackson Lee"
                }
                ReactHTML.p {
                    className = ClassName("text-sm text-muted-foreground")
                    +"jackson.lee@email.com"
                }
            }
            ReactHTML.div {
                className = ClassName("ml-auto font-medium")
                +"+$39.00"
            }
        }
        ReactHTML.div {
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
            ReactHTML.div {
                className = ClassName("ml-4 space-y-1")
                ReactHTML.p {
                    className = ClassName("text-sm font-medium leading-none")
                    +"Isabella Nguyen"
                }
                ReactHTML.p {
                    className = ClassName("text-sm text-muted-foreground")
                    +"isabella.nguyen@email.com"
                }
            }
            ReactHTML.div {
                className = ClassName("ml-auto font-medium")
                +"+$299.00"
            }
        }
        ReactHTML.div {
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
            ReactHTML.div {
                className = ClassName("ml-4 space-y-1")
                ReactHTML.p {
                    className = ClassName("text-sm font-medium leading-none")
                    +"William Kim"
                }
                ReactHTML.p {
                    className = ClassName("text-sm text-muted-foreground")
                    +"will@email.com"
                }
            }
            ReactHTML.div {
                className = ClassName("ml-auto font-medium")
                +"+$99.00"
            }
        }
        ReactHTML.div {
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
            ReactHTML.div {
                className = ClassName("ml-4 space-y-1")
                ReactHTML.p {
                    className = ClassName("text-sm font-medium leading-none")
                    +"Sofia Davis"
                }
                ReactHTML.p {
                    className = ClassName("text-sm text-muted-foreground")
                    +"sofia.davis@email.com"
                }
            }
            ReactHTML.div {
                className = ClassName("ml-auto font-medium")
                +"+$39.00"
            }
        }
    }
}