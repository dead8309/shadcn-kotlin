package example.shadcn_kotlin.ui.components.sidebarnav


abstract class NavItem {
    abstract val title: String
    abstract val href: String?
    abstract val disabled: Boolean?
    abstract val external: Boolean?
    abstract val icon: String?
    abstract val label: String?
}

data class NavItemWithChildren(
    override val title: String,
    override val href: String?,
    val items: List<NavItemWithChildren> = emptyList()
) : NavItem() {
    override val disabled: Boolean? = null
    override val external: Boolean? = null
    override val icon: String? = null
    override val label: String? = null
}

data class SidebarNavItem(
    override val title: String,
    override val href: String?,
    val items: List<NavItemWithChildren> = emptyList()
) : NavItem() {
    override val disabled: Boolean? = null
    override val external: Boolean? = null
    override val icon: String? = null
    override val label: String? = null
}
