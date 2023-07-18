package example.shadcn_kotlin.ui.config

import example.shadcn_kotlin.ui.types.MainNavItem

val mainNavbarItems = listOf(
    MainNavItem(
        title = "Documentation",
        href = "/docs",
    ),
    MainNavItem(
        title = "Components",
        href = "/docs/components/accordion",
    ),
    MainNavItem(
        title = "Examples",
        href = "/dashboard",
    ),
    MainNavItem(
        title = "Github",
        href = SiteConfig.Links.github,
    )
)
