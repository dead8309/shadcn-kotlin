package example.shadcn_kotlin.ui.components.sections

import example.shadcn_kotlin.ui.config.docsConfig
import lucide_react.SidebarOpen
import react.*
import react.dom.html.AnchorHTMLAttributes
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.span
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
                    docsConfig.mainNav.forEach {
                        MobileLink {
                            key= it.href
                            href= it.href
                            onOpenChange= setOpen
                            + it.title
                        }
                    }
                }
                div {
                    className = ClassName("flex flex-col space-y-2")
                    docsConfig.sidebarNav.forEachIndexed { index, item ->
                        div {
                            key = index.toString()
                            className = ClassName("flex flex-col space-y-3 pt-6")
                            h4 {
                                className = ClassName("font-medium")
                                + item.title
                            }
                            item.items.forEach {
                                Fragment {
                                    key = it.href
                                    if (it.href != null && it.disabled == null) {
                                        MobileLink {
                                            href = it.href
                                            onOpenChange = setOpen
                                            className = ClassName("text-muted-foreground")
                                            + it.title
                                        }
                                    } else {
                                        + it.title
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


external interface MobileLinkProps: AnchorHTMLAttributes<HTMLAnchorElement> {
    var onOpenChange: StateSetter<Boolean>
}

val MobileLink = FC<MobileLinkProps> {
    a {
        href = it.href
        className = it.className
        onClick = { _ ->
            it.onOpenChange(false)
        }
        +it.children
    }
}