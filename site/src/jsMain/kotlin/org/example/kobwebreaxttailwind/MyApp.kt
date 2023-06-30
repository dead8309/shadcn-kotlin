package org.example.kobwebreaxttailwind

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import org.jetbrains.compose.web.dom.Div

@InitSilk
fun initSilk(ctx: InitSilkContext) {}
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
