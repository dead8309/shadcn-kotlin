package org.example.kobwebreaxttailwind.components.sections

import lucide_react.SidebarOpen
import react.FC
import react.Props
import react.StateSetter
import react.dom.html.AnchorHTMLAttributes
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import react.useState
import shadcn.ui.components.*
import web.cssom.ClassName
import web.html.HTMLAnchorElement

val MobileNav = FC<Props> {
    val (open,setOpen) = useState(false)
    Sheet {
        this.open = open
        onOpenChange = setOpen
        SheetTrigger {
            asChild = true
            Button {
                variant = "ghost"
                className = ClassName("mr-2 px-0 text-base hover:bg-transparent focus-visible:bg-transparent focus-visible:ring-0 focus-visible:ring-offset-0 md:hidden")
                SidebarOpen { className = ClassName("h-6 2-6") }
                span {
                    className = ClassName("sr-only")
                    +"Toggle Menu"
                }
            }
        }
        SheetContent {
            size = "xl"
            position = "left"
            className = ClassName("pr-0")
            MobileLink {
                href = "/"
                className = ClassName("flex items-center !text-foreground")
                logo { className = ClassName("mr-2 h-4 w-4") }
                span {
                    className = ClassName("font-bold")
                    +"shadcn-kotlin"
                }
                onOpenChange = setOpen
            }
            ScrollArea {
                className = ClassName("my-4 h-[calc(100vh-8rem)] pb-10 pl-6 overflow-auto")
                div {
                    className = ClassName("flex flex-col space-y-3")
                    MobileLink {
                        onOpenChange = setOpen
                        href = "/dashboard"
                        +"Dashboard"
                    }
                    MobileLink {
                        onOpenChange = setOpen
                        href = "/components"
                        +"Components"
                    }
                    MobileLink {
                        onOpenChange = setOpen
                        href = "https://github.com/dead8309/kobweb-react-tailwind#integration-with-tailwind-css"
                        +"Tailwind"
                    }
                    MobileLink {
                        onOpenChange = setOpen
                        href = "https://github.com/dead8309"
                        +"Github"
                    }
                }
            }
        }
    }
}


external interface MobileLinkProps: AnchorHTMLAttributes<HTMLAnchorElement> {
    var onOpenChange: StateSetter<Boolean>
}

val MobileLink = FC<MobileLinkProps> {
    a {
        href = it.href
        className = it.className
        onClick = { e ->
            it.onOpenChange(false)
        }
        +it.children
    }
}