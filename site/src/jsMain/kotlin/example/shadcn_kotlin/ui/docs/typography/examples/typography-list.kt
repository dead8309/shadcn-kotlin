package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import web.cssom.ClassName

val TypographyList = FC<Props> {
    ul {
        className = ClassName("my-6 ml-6 list-disc [&>li]:mt-2")
        li {
            +"1st level of puns: 5 gold coins"
        }
        li {
            +"2nd level of jokes: 10 gold coins"
        }
        li {
            +"3rd level of one-liners : 20 gold coins"
        }
    }
}