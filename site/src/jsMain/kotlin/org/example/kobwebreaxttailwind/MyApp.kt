package org.example.kobwebreaxttailwind

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.App
import org.jetbrains.compose.web.dom.Div

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    Div(attrs = {
            classes( "min-h-screen", "antialiased")
            id("app")
    }) {
        content()
    }
}
