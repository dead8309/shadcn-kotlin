package example.shadcn_kotlin.ui.pages.dashboard

import react.FC
import react.PropsWithClassName
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.nav
import web.cssom.ClassName

val MainNavDashboard = FC<PropsWithClassName> {
    nav {
        className = ClassName("flex items-center space-x-4 lg:space-x-6 ${it.className}")
        a {
            href = "/dashboard"
            className = ClassName("text-sm font-medium transition-colors hover:text-primary")
            +"Overview"
        }
        a {
            href = "/dashboard"
            className = ClassName("text-sm font-medium text-muted-foreground transition-colors hover:text-primary")
            +"Customers"
        }
        a {
            href = "/dashboard"
            className = ClassName("text-sm font-medium text-muted-foreground transition-colors hover:text-primary")
            +"Products"
        }
        a {
            href = "/dashboard"
            className = ClassName("text-sm font-medium text-muted-foreground transition-colors hover:text-primary")
            +"Settings"
        }
    }
}