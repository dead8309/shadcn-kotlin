package example.shadcn_kotlin.ui.pages.dashboard

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import example.shadcn_kotlin.ui.components.*
import example.shadcn_kotlin.ui.components.layouts.PageLayout
import react.FC
import react.PropsWithChildren
import react.create
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.section
import web.cssom.ClassName

@Page
@Composable
fun DashBoardPage() {
    PageLayout(
            title = "Dashboard",
            children = DashBoardPageLayout.create()
    )
}

val DashBoardPageLayout = FC<PropsWithChildren> {
    div {
        className = ClassName("container relative pb-10")
        PageHeader {
            PageHeaderHeading {
                className = ClassName("hidden md:block")
                +"Check out some examples"
            }
            PageHeaderHeading {
                className = ClassName("md:hidden")
                +"Examples"
            }
            PageHeaderDescription {
                +"Dashboard, cards, authentication. Some examples built using the"
                +"components. Use this as a guide to build your own."
            }
            section {
                className = ClassName("flex w-full items-center space-x-4 pb-8 pt-4 md:pb-10")
                a {
                    href = "/"
                    className = buttonVariants(extraClassName = "rounded-[6px]")
                    +"Get Started"
                }
                a {
                    href = "/components"
                    className = buttonVariants(variant = ButtonVariants.outline, extraClassName = "rounded-[6px]")
                    +"Components"
                }
            }
        }
        section {
            div {
                className = ClassName("overflow-hidden rounded-[0.5rem] border bg-background shadow-xl")
                DashBoardApp {}
            }
        }
    }
}