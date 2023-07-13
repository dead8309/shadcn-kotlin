package example.shadcn_kotlin.ui.components.sidebarnav

import kotlinx.browser.window
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import react.dom.html.ReactHTML.span
import web.cssom.ClassName
import web.window.WindowTarget

external interface DocsSidebarNavProps: Props {
    var items: List<SidebarNavItem>?
}

val DocsSidebarNav = FC<DocsSidebarNavProps> {
    val items = it.items ?: return@FC
    div {
        className = ClassName("w-full")
        items.forEachIndexed { index, item ->
            div {
                key = index.toString()
                className = ClassName("pb-4")
                h4 {
                    className = ClassName("mb-1 rounded-md px-2 py-1 text-sm font-semibold")
                    + item.title
                }
                DocsSidebarNavItems {
                    this.items = item.items
                }

            }
        }

    }

}

external interface DocsSidebarNavItemsProps: Props {
    var items: List<NavItemWithChildren>?
}

val DocsSidebarNavItems = FC<DocsSidebarNavItemsProps> {
    var pathname = window.location.pathname
    if (pathname.endsWith("/"))
        pathname = pathname.dropLast(1)

    val items = it.items ?: return@FC
    div {
        className = ClassName("grid grid-flow-row auto-rows-max text-sm")
        items.forEachIndexed { index, item ->
            val href = item.href
            val disabled = item.disabled
            if (href != null && disabled == null) {
                a {
                    key = index.toString()
                    this.href = href
                    var cn = "group flex w-full items-center rounded-md border border-transparent px-2 py-1 hover:underline"
                    if (disabled == true) cn += " cursor-not-allowed opacity-60"
                    cn += if (item.href === pathname) " font-medium text-foreground" else  " text-muted-foreground"
                    className = ClassName(cn)
                    target = WindowTarget._self
                    rel = "noreferrer"

                    + item.title
                    if (item.label != null) {
                        span  {
                            className = ClassName("ml-2 rounded-md bg-[#adfa1d] px-1.5 py-0.5 text-xs leading-none text-[#000000] no-underline group-hover:no-underline")
                            + item.label
                        }
                    }
                }
            } else {
                span {
                    key = index.toString()
                    className = ClassName("flex w-full cursor-not-allowed items-center rounded-md p-2 text-muted-foreground hover:underline ${if (item.disabled == true) "cursor-not-allowed opacity-60" else ""}")
                    + item.title
                    if (item.label != null) {
                        span {
                            className =
                                ClassName("ml-2 rounded-md bg-muted px-1.5 py-0.5 text-xs leading-none text-muted-foreground no-underline group-hover:no-underline")
                            +item.label
                        }
                    }
                }
            }
        }
    }
}