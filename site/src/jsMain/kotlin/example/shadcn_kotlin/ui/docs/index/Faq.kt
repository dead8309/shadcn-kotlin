package example.shadcn_kotlin.ui.docs.index

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.Constants
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import react.ChildrenBuilder
import react.Props
import react.ReactNode
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.em
import react.dom.html.ReactHTML.p
import shadcn.ui.components.*
import web.cssom.ClassName
import web.html.HTMLParagraphElement

@Composable
fun Faq() {
    useReactEffect {
        Accordion {
            type="multiple"
            collapsible = true
                    AccordionItem {
                        value="faq-1"
                        AccordionTrigger {
                            p("Why not publish each component in its own library?")
                        }
                        AccordionContent {
                            p("The components are published all together in one single library. You can start with the default styles, but you can also override them or create your own.")
                        }
                    }
            AccordionItem {
                value="faq-2"
                AccordionTrigger {
                   p("Do you plan to publish it as a library?")
                }
                AccordionContent {
                    p("Yes. Its available on ") {
                        it.apply {
                            a("maven central","https://central.sonatype.com/artifact/io.github.dead8309/shadcn-kotlin")
                        }
                    }
                }
            }
            AccordionItem {
                value="faq-3"
                AccordionTrigger {
                    p("Which frameworks are supported?")
                }
                AccordionContent {
                    p("This port is built to be used with KotlinJs")
                }
            }
            AccordionItem {
                value="faq-4"
                AccordionTrigger {
                    p("Can I use this in my project?")
                }
                AccordionContent {
                    p("Yes. Free to use for personal and commercial projects. No attribution required.")
                    p("But hey, let me know if you do. I'd love to see what you build.")
                }
            }
        }
    }
}

fun ChildrenBuilder.p(text: String, child: (ChildrenBuilder) -> Unit = {}) = p {
    + text
    className = Constants.MDStyles.p
    child(this)
}

fun ChildrenBuilder.a(text: String,href: String? = null) = a {
    className = Constants.MDStyles.a
    this.href = href
    + text
}
