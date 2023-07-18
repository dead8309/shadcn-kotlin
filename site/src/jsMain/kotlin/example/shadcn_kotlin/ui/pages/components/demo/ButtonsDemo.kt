package example.shadcn_kotlin.ui.pages.components.demo

import example.shadcn_kotlin.ui.pages.components.demo.buttons.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import shadcn.ui.components.Button
import web.cssom.ClassName

val ButtonsDemo = FC<Props> {
    div {
        className = ClassName("grid grid-cols-2 gap-4 md:grid-cols-3 2xl:grid-cols-4")
        ButtonDemo {}
        ButtonDestructive {}
        ButtonGhost {}
        ButtonIcon {}
        ButtonLink {}
        ButtonLoading {}
        ButtonOutline {}
        ButtonSecondary {}
        ButtonWithIcon {}
        Button {
            size = "lg"
            +"Large"
        }
        Button {
            size = "sm"
            +"Small"
        }
    }
}