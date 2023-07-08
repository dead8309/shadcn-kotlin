package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Skeleton
import web.cssom.ClassName

val SkeletonDemo = FC<Props> {
    div {
        className = ClassName("flex items-center space-x-4")
        Skeleton {
            className = ClassName("h-12 w-12 rounded-full")
        }
        div {
            className = ClassName("space-y-2")
            Skeleton {
                className = ClassName("h-4 w-[250px]")
            }
            Skeleton {
                className = ClassName("h-4 w-[250px]")
            }
        }
    }
}