package example.shadcn_kotlin.ui.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import lucide_react.ChevronRight
import example.shadcn_kotlin.ui.components.*
import example.shadcn_kotlin.ui.components.layouts.PageLayout
import example.shadcn_kotlin.ui.components.sections.github
import example.shadcn_kotlin.ui.config.SiteConfig
import example.shadcn_kotlin.ui.pages.dashboard.DashBoardApp
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.section
import shadcn.ui.components.Separator
import web.cssom.ClassName
import web.window.WindowTarget

@Page
@Composable
fun ReactPage() {
    PageLayout(
       title = "shadcn-kotlin",
       children = ShadCnApp.create()
    )
}

val ShadCnApp = FC<Props> {
    div {
        className = ClassName("container relative pb-10")
        PageHeader {
            a {
                href = SiteConfig.Links.github
                className = ClassName("inline-flex items-center rounded-lg bg-muted px-3 py-1 text-sm font-medium")
                +"🎉"
                Separator {
                    className = ClassName("mx-2 h-4")
                    orientation = "vertical"
                }
                +" Introducing shadcn-kotlin"

                ChevronRight { className = ClassName("ml-1 h-4 w-4") }
            }
            PageHeaderHeading {
                +"Build your component library."
            }
            PageHeaderDescription {
                +"Beautifully designed components that you can copy and paste into your"
                +"apps. Accessible. Customizable. Open Source."
            }
            p {
                className = ClassName("text-sm text-red-600 dark:text-red-400")
                + "This is an unofficial port of "
                a {
                    href="https://github.com/shadcn/ui"
                    target = WindowTarget._blank
                    rel="noreferrer"
                    className = ClassName("font-medium underline underline-offset-4")
                    +"shadcn/ui"
                }
                +" to KotlinJS, and is not affiliated with "
                a {
                    href= SiteConfig.Links.twitter
                    target = WindowTarget._blank
                    rel="noreferrer"
                    className = ClassName("font-medium underline underline-offset-4")
                    +"@shadcn"
                }
                +", just inspired by him"
            }
            div {
                className = ClassName("flex w-full items-center space-x-4 pb-8 pt-4 md:pb-10")
                a {
                    href = "/docs"
                    className = buttonVariants()
                    +"Get Started"
                }
                a {
                    href = SiteConfig.Links.github
                    className = buttonVariants(ButtonVariants.outline)
                    rel = "noreferrer"
                    target = WindowTarget._blank
                    github { className = ClassName("mr-2 h-4 w-4") }
                    +"Github"
                }
            }
        }

        // <ExamplesNav className="[&>a:first-child]:text-primary" />
        section {
            className = ClassName("space-y-8 overflow-hidden rounded-lg border-2 border-primary dark:border-muted md:hidden")
            ReactHTML.img {
                src = "/examples/dashboard-light.png"
                width = 1280.0
                height = 866.0
                alt = "Dashboard"
                className = ClassName("block dark:hidden")
            }
            ReactHTML.img {
                src = "/examples/dashboard-dark.png"
                width = 1280.0
                height = 866.0
                alt = "Dashboard"
                className = ClassName("hidden dark:block")
            }
        }
        section {
            className = ClassName("hidden md:block")
            div {
                className = ClassName("overflow-hidden rounded-[0.5rem] border bg-background shadow-xl")
                DashBoardApp {}
            }
        }
    }
}











