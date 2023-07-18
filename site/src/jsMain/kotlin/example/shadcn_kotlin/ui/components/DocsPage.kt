package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import com.varabyte.kobwebx.markdown.MarkdownContext
import example.shadcn_kotlin.ui.components.hooks.useCompose
import lucide_react.ChevronRightIcon
import lucide_react.LucideProps
import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.main
import react.dom.html.ReactHTML.p
import react.dom.svg.ReactSVG
import react.dom.svg.ReactSVG.path
import shadcn.ui.components.ScrollArea
import web.cssom.ClassName
import web.window.WindowTarget

fun DocsPage(
    mdCtx: MarkdownContext,
    content: @Composable () -> Unit
): FC<Props> {
    val title = mdCtx.frontMatter["title"]?.singleOrNull() ?: error("Page should specify title")
    val desc = mdCtx.frontMatter["description"]?.singleOrNull()
    val api = mdCtx.frontMatter["api"]?.singleOrNull()
    val link = mdCtx.frontMatter["link"]?.singleOrNull()

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
                    className = ClassName("flex items-center space-x-2 pt-4")
                    link?.let {
                        a {
                            href = it
                            target = WindowTarget._blank
                            rel = "noreferrer"
                            className =
                                ClassName("inline-flex items-center rounded-full border px-2.5 py-0.5 text-xs font-semibold transition-colors focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 border-transparent bg-secondary text-secondary-foreground hover:bg-secondary/80")
                            radix { className = ClassName("mr-1 h-3 w-3") }
                            +"Radix UI"
                        }
                    }
                    api?.let {
                        a {
                            href = it
                            target = WindowTarget._blank
                            rel = "noreferrer"
                            className =
                                ClassName("inline-flex items-center rounded-full border px-2.5 py-0.5 text-xs font-semibold transition-colors focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 border-transparent bg-secondary text-secondary-foreground hover:bg-secondary/80")
                            +"API Reference"
                        }
                    }
                }
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
            div {
                className = ClassName("hidden text-sm xl:block")
                div {
                    className = ClassName("sticky top-16 -mt-10 h-[calc(100vh-3.5rem)] overflow-hidden pt-6")
                    ScrollArea {
                        className = ClassName("pb-10")
                        // Render Toc after page has loaded
                        div { id = "toc" }
                    }
                }
            }
        }
    }
}

val radix = FC<LucideProps> {
    ReactSVG.svg {
        className = it.className
        fill = "none"
        viewBox = "0 0 25 25"
        path {
            d="M12 25C7.58173 25 4 21.4183 4 17C4 12.5817 7.58173 9 12 9V25Z"
            fill="currentcolor"
        }
        path {
            d = "M12 0H4V8H12V0Z"
            fill = "currentcolor"
        }
        path {
            d="M17 8C19.2091 8 21 6.20914 21 4C21 1.79086 19.2091 0 17 0C14.7909 0 13 1.79086 13 4C13 6.20914 14.7909 8 17 8Z"
            fill="currentcolor"
        }
    }
}