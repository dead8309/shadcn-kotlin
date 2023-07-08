package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h4
import shadcn.ui.components.ScrollArea
import shadcn.ui.components.Separator
import web.cssom.ClassName

val ScrollAreaDemo = FC<Props> {

    val tags = (1..50)
        .toList()
        .map {
            "v1.2.0-beta.${50 - it}"
        }

    ScrollArea {
        className = ClassName("h-72 w-48 rounded-md border")
        div {
            className = ClassName("p-4")
            h4 {
                className = ClassName("mb-4 text-sm font-medium leading-none")
                +"Tags"
            }
            tags.forEach {
                div {
                    className =ClassName("text-sm")
                    key = it
                    +it
                }
                Separator { className = ClassName("my-2") }
            }
        }
    }
}