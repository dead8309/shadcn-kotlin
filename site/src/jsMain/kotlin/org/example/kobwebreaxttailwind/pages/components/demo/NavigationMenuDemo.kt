package org.example.kobwebreaxttailwind.pages.components.demo

import lucide_react.Bird
import lucide_react.LucideProps
import react.FC
import react.Props
import react.dom.html.AnchorHTMLAttributes
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.link
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul
import react.dom.svg.ReactSVG.circle
import react.dom.svg.ReactSVG.svg
import react.dom.svg.StrokeLinecap
import react.dom.svg.StrokeLinejoin
import shadcn.ui.components.*
import web.cssom.ClassName
import web.cssom.circle
import web.html.HTMLAnchorElement

data class NavigationMenuDemoItem(
    val title: String,
    val href: String,
    val description: String
)

private val components = listOf(
    NavigationMenuDemoItem(
        title = "Alert Dialog",
        href = "/docs/primitives/alert-dialog",
        description =
        "A modal dialog that interrupts the user with important content and expects a response."
    ),
    NavigationMenuDemoItem(
        title = "Hover Card",
        href = "/docs/primitives/hover-card",
        description =
        "For sighted users to preview content available behind a link.",
    ),
    NavigationMenuDemoItem(
        title = "Progress",
        href = "/docs/primitives/progress",
        description =
        "Displays an indicator showing the completion progress of a task, typically displayed as a progress bar.",
    ),
    NavigationMenuDemoItem(
        title = "Scroll-area",
        href = "/docs/primitives/scroll-area",
        description = "Visually or semantically separates content.",
    ),
    NavigationMenuDemoItem(
        title = "Tabs",
        href = "/docs/primitives/tabs",
        description =
        "A set of layered sections of content—known as tab panels—that are displayed one at a time.",
    ),
    NavigationMenuDemoItem(
        title = "Tooltip",
        href = "/docs/primitives/tooltip",
        description =
        "A popup that displays information related to an element when the element receives keyboard focus or the mouse hovers over it.",
    ),
)

val NavigationMenuDemo = FC<Props> {
    NavigationMenu {
        NavigationMenuList {
            NavigationMenuItem {
                NavigationMenuTrigger { +"Get started" }
                NavigationMenuContent {
                    ul {
                        className = ClassName("grid gap-3 p-6 md:w-[400px] lg:w-[500px] lg:grid-cols-[.75fr_1fr]")
                        li {
                            className = ClassName("row-span-3")
                            NavigationMenuLink {
                                asChild = true
                                a {
                                    className =
                                        ClassName("flex h-full w-full select-none flex-col justify-end rounded-md bg-gradient-to-b from-muted/50 to-muted p-6 no-underline outline-none focus:shadow-md")
                                    href = "/"
                                    Bird {
                                        className = ClassName("h-6 w-6")
                                    }
                                    div {
                                        className = ClassName("mb-2 mt-4 text-lg font-medium")
                                        +"shadcn/ui"
                                    }
                                    p {
                                        className = ClassName("text-sm leading-tight text-muted-foreground")
                                        +"Beautifully designed components built with Radix UI and Tailwind CSS."
                                    }
                                }
                            }
                        }
                        ListItem {
                            href = "/docs"
                            title = "Introduction"
                            +"Re-usable components built using Radix UI and Tailwind CSS."
                        }
                        ListItem {
                            href = "/docs/installation"
                            title = "Installation"
                            +"How to install dependencies and structure your app."
                        }
                        ListItem {
                            href = "/docs/primitives/typography"
                            title = "Introduction"
                            +"Styles for headings, paragraphs, lists...etc"
                        }
                    }
                }
            }
            NavigationMenuItem {
                NavigationMenuTrigger { +"Components" }
                NavigationMenuContent {
                    ul {
                        className = ClassName("grid w-[400px] gap-3 p-4 md:w-[500px] md:grid-cols-2 lg:w-[600px] ")
                        components.map {
                            ListItem {
                                key = it.title
                                title = it.title
                                href = it.href

                                +it.description
                            }
                        }
                    }
                }
            }
            NavigationMenuItem {
                a {
                    href = "/docs"
                    NavigationMenuLink {
                        asChild = true
                        className = ClassName(
                                "inline-flex items-center justify-center rounded-md text-sm font-medium transition-colors focus:outline-none focus:bg-accent focus:text-accent-foreground disabled:opacity-50 disabled:pointer-events-none bg-background hover:bg-accent hover:text-accent-foreground data-[state=open]:bg-accent/50 data-[active]:bg-accent/50 h-10 py-2 px-4 group w-max"
                                )
                        +"Documentation"
                    }
                }
            }
        }
    }
}

val ListItem = FC<AnchorHTMLAttributes<HTMLAnchorElement>> {
    li {
        NavigationMenuLink {
            asChild = true
            a {
                ref = it.ref
                className =
                    ClassName("block select-none space-y-1 rounded-md p-3 leading-none no-underline outline-none transition-colors hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground ${it.className}")
                div {
                    className = ClassName("text-sm font-medium leading-none")
                    +it.title
                }
                p {
                    className = ClassName("line-clamp-2 text-sm leading-snug text-muted-foreground")
                    +it.children
                }
            }
        }
    }
}