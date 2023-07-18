package example.shadcn_kotlin.ui.components.sections

import example.shadcn_kotlin.ui.config.SiteConfig
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.p
import web.cssom.ClassName
import web.window.WindowTarget

val Footer = FC<Props> {
    footer {
        className = ClassName("border-t py-6 md:py-0")
        div {
            className = ClassName("container flex flex-col items-center justify-between gap-4 md:h-24 md:flex-row")
            div {
                className = ClassName("flex flex-col items-center gap-4 px-8 md:flex-row md:gap-2 md:px-0")
                logo { className = ClassName("hidden h-6 w-6 md:inline-block") }
                p {
                    className = ClassName("text-center text-sm leading-loose text-muted-foreground md:text-left")
                    +"Built & designed by "
                    a {
                        href = SiteConfig.Links.twitter
                        target = WindowTarget._blank
                        rel = "noreferrer"
                        className = ClassName("font-medium underline underline-offset-4")
                        +"shadcn"
                    }
                    +". Ported to kotlin by "
                    a {
                        href = "https://github.com/dead8309"
                        target = WindowTarget._blank
                        rel = "noreferrer"
                        className = ClassName("font-medium underline underline-offset-4")
                        +"@dead8309"
                    }
                    +". The source code is available on "
                    a {
                        href = SiteConfig.Links.github
                        target = WindowTarget._blank
                        rel = "noreferrer"
                        className = ClassName("font-medium underline underline-offset-4")
                        +"GitHub"
                    }
                }
            }
        }
    }
}