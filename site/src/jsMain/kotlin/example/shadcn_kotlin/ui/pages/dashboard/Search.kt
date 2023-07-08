package example.shadcn_kotlin.ui.pages.dashboard

import react.FC
import react.Props
import shadcn.ui.components.Input
import web.cssom.ClassName
import web.html.InputType

val Search = FC<Props> {
    Input {
        type = InputType.search
        placeholder = "Search..."
        className = ClassName("md:w-[100px] lg:w-[300px]")
    }
}