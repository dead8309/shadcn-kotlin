package example.shadcn_kotlin.ui.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobwebx.markdown.markdown
import example.shadcn_kotlin.ui.components.DocsPage
import example.shadcn_kotlin.ui.components.Toc
import example.shadcn_kotlin.ui.components.sections.Footer
import example.shadcn_kotlin.ui.components.sections.NavHeader
import example.shadcn_kotlin.ui.components.sidebarnav.DocsSidebarNav
import example.shadcn_kotlin.ui.components.sidebarnav.sideNavbarItems
import example.shadcn_kotlin.ui.theme.ThemeProvider
import kotlinx.coroutines.delay
import react.FC
import react.Props
import react.PropsWithChildren
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import shadcn.ui.components.ScrollArea
import web.cssom.ClassName
import web.dom.document

@Composable
fun MDLayout(
    content: @Composable () -> Unit
) {
    val ctx = rememberPageContext()
    val mdCtx = ctx.markdown!!

    kotlinext.js.require("./globals.css")
    val layout = FC<Props> {
        ThemeProvider {
            defaultTheme = "system"
            enableSystem = true
            ReactHTML.div {
                className = ClassName("relative flex min-h-screen flex-col")
                NavHeader {}
                ReactHTML.div {
                    className = ClassName("flex-1")
                    DocsLayout {
                        div {
                            val page = DocsPage(mdCtx) {
                                content()
                            }
                            page {}
                        }
                    }
                }
                Footer {}
            }
        }
        // Toaster
    }
    LaunchedEffect(Unit) {
        val root = document.getElementById("app")
        createRoot(root!!).render(layout.create())
        delay(1)
        // Render Toc after a delay to make sure that dom is loaded
        val toc = document.getElementById("toc")
        createRoot(toc!!).render(Toc.create())
    }
}

val DocsLayout = FC<PropsWithChildren> {
    ReactHTML.div {
        className = ClassName("border-b")
        ReactHTML.div {
            className = ClassName("container flex-1 items-start md:grid md:grid-cols-[220px_minmax(0,1fr)] md:gap-6 lg:grid-cols-[240px_minmax(0,1fr)] lg:gap-10")
            ReactHTML.aside {
                className = ClassName("fixed top-14 z-30 -ml-2 hidden h-[calc(100vh-3.5rem)] w-full shrink-0 md:sticky md:block")
                ScrollArea {
                    className = ClassName("h-full py-6 pl-8 pr-6 lg:py-8")
                    DocsSidebarNav {
                        items = sideNavbarItems
                    }
                }
            }
            + it.children
        }
    }
}


