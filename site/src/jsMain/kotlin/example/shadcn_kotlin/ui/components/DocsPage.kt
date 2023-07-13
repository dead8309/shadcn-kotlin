package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import com.varabyte.kobwebx.markdown.MarkdownContext
import example.shadcn_kotlin.ui.components.hooks.useCompose
import lucide_react.ChevronRightIcon
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.p
import shadcn.ui.components.ScrollArea
import web.cssom.ClassName

fun DocsPage(
    mdCtx: MarkdownContext,
    content: @Composable () -> Unit
): FC<Props> {
    val title = mdCtx.frontMatter["title"]?.singleOrNull() ?: error("Page should specify title")
    val desc = mdCtx.frontMatter["description"]?.singleOrNull()

    return FC<Props> {
        main {
            className = ClassName("relative py-6 lg:gap-10 lg:py-8 xl:grid xl:grid-cols-[1fr_300px]")
            div {
                className = ClassName("mx-auto w-full min-w-0")
                div {
                    className = ClassName("mb-4 flex items-center space-x-1 text-sm text-muted-foreground")
                    div {
                        className = ClassName("overflow-hidden text-ellipsis whitespace-nowrap")
                        +"Docs"
                    }
                    ChevronRightIcon { className = ClassName("h-4 w-4") }
                    div {
                        className = ClassName("font-medium text-foreground")
                        +title
                    }
                }
                div {
                    className = ClassName("space-y-2")
                    h1 {
                        className = ClassName("scroll-m-20 text-4xl font-bold tracking-tight")
                        +title
                    }
                    if (desc != null) {
                        p {
                            className = ClassName("text-lg text-muted-foreground")
                            +desc
                        }
                    }
                }
                // Todo Radix Part
                div {
                    className = ClassName("pb-12 pt-8")
                    /* MDX */
                    div {
                        id = "md"
                        useCompose("md") {
                        content()
                        }
                    }
                }
                DocsPager(title)
            }
            // TODO: TOC
            if (mdCtx.frontMatter.containsKey("toc")) {
                div {
                    className = ClassName("hidden text-sm xl:block")
                    div {
                        className = ClassName("sticky top-16 -mt-10 h-[calc(100vh-3.5rem)] overflow-hidden pt-6")
                        ScrollArea {
                            className = ClassName("pb-10")
                            // Toc
                        }
                    }
                }
            }
        }
    }
}

