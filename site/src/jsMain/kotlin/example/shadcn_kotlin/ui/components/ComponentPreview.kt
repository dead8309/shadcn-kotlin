package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.hooks.useCompose
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import react.*
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Tabs
import shadcn.ui.components.TabsContent
import shadcn.ui.components.TabsList
import shadcn.ui.components.TabsTrigger
import web.crypto.Crypto
import web.crypto.CryptoKey
import web.crypto.crypto
import web.cssom.ClassName
import web.html.HTMLDivElement

external interface ComponentPreviewProps: HTMLAttributes<HTMLDivElement> {
    var name: String
    var extractClassname: Boolean?
    var extractedClassNames: String?
    var align: String? /* "center" | "start" | "end" */
}
@Composable
fun ComponentPreview(
    style: String = "",
    component: ReactNode,
    code: String = ""
) {
    useReactEffect {
            div {
                className = ClassName("group relative my-4 flex flex-col space-y-2 $style")
                Tabs {
                    defaultValue = "preview"
                    className = ClassName("relative mr-auto w-full")
                    div {
                        className = ClassName("flex items-center justify-between pb-3")
                        TabsList {
                            className = ClassName("w-full justify-start rounded-none border-b bg-transparent p-0")
                            TabsTrigger {
                                value = "preview"
                                className = ClassName(
                                    "relative h-9 rounded-none border-b-2 border-b-transparent bg-transparent px-4 pb-3 pt-2 font-semibold text-muted-foreground shadow-none transition-none data-[state=active]:border-b-primary data-[state=active]:text-foreground data-[state=active]:shadow-none"
                                )
                                +"Preview"
                            }
                            TabsTrigger {
                                value = "code"
                                className = ClassName(
                                    "relative h-9 rounded-none border-b-2 border-b-transparent bg-transparent px-4 pb-3 pt-2 font-semibold text-muted-foreground shadow-none transition-none data-[state=active]:border-b-primary data-[state=active]:text-foreground data-[state=active]:shadow-none"
                                )
                                +"Code"
                            }
                        }
                    }
                    TabsContent {
                        value = "preview"
                        className = ClassName("relative rounded-md border")
                        div {
                            className = ClassName("preview flex min-h-[350px] w-full justify-center p-10 items-center")
                            + component
                        }
                    }
                    TabsContent {
                        value = "code"
                        div {
                            className = ClassName("flex flex-col space-y-4")
                            div {
                                className = ClassName("w-full rounded-md [&_pre]:my-0 [&_pre]:max-h-[350px] [&_pre]:overflow-auto")
                                CodeBlock {
                                    value = code
                                }
                            }
                        }
                    }
                }
            }
    }
}