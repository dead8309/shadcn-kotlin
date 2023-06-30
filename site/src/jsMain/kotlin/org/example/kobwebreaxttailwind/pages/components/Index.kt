package org.example.kobwebreaxttailwind.pages.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.example.kobwebreaxttailwind.components.layouts.PageLayout
import react.FC
import react.Props
import react.create


@Page
@Composable
fun ComponentPage() {
    PageLayout(
            title = "Components Demo",
            children = ComponentApp.create()
    )
}

val ComponentApp = FC<Props> {
        ComponentSink {
            components = demoComponents
        }
}