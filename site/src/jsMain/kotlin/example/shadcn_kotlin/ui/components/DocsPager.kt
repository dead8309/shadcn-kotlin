package example.shadcn_kotlin.ui.components

import example.shadcn_kotlin.ui.components.sidebarnav.sideNavbarItems
import kotlinx.browser.window
import lucide_react.ChevronLeftIcon
import lucide_react.ChevronRightIcon
import react.ChildrenBuilder
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import web.cssom.ClassName

data class NavItemData(val title: String, val href: String?)


// Not an ideal Pager But hey!, it works!!
fun ChildrenBuilder.DocsPager(title: String) {
    val navItemsData: List<NavItemData> = sideNavbarItems.flatMap { sidebarNavItem ->
        sidebarNavItem.items.flatMap { navItemWithChildren ->
            listOf(NavItemData(navItemWithChildren.title, navItemWithChildren.href)) +
                    navItemWithChildren.items.map { childItem ->
                        NavItemData(childItem.title, childItem.href)
                    }
        }
    }
    val searchResult = navItemsData.find { it.title == title } ?: return
    div {
        className = ClassName("flex flex-row items-center justify-between")

        val prev = navItemsData.getOrNull(navItemsData.indexOf(searchResult) - 1)
        val next = navItemsData.getOrNull(navItemsData.indexOf(searchResult) + 1)

        if (prev != null) {
            a {
                className = buttonVariants(ButtonVariants.outline)
                ChevronLeftIcon {
                    className = ClassName("mr-2 h-4 w-4")
                }
                href = prev.href
                +prev.title
            }
        }
        if (next != null) {
            a {
                className = buttonVariants(ButtonVariants.outline, extraClassName = "ml-auto")
                +next.title
                ChevronRightIcon {
                    className = ClassName("ml-2 h-4 w-4")
                }
                href = next.href
            }
        }
    }
}