package example.shadcn_kotlin.ui.pages.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import example.shadcn_kotlin.ui.components.layouts.PageLayout
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.section
import web.cssom.ClassName


@Page
@Composable
fun ComponentPage() {
    PageLayout(
            title = "Components Demo",
            children = ComponentApp.create()
    )
}

val ComponentApp = FC<Props> {
    section {
        className = ClassName("container grid items-center gap-6 pb-8 pt-6 md:py-10")
        ComponentSink {
            components = demoComponents
        }
    }
}