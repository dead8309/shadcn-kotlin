package org.example.kobwebreaxttailwind

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerBaseStyle
import org.jetbrains.compose.web.dom.Div

@InitSilk
fun initSilk(ctx: InitSilkContext) {
    ctx.stylesheet.registerBaseStyle("body") {
        Modifier
                .fontFamily(
                        "-apple-system", "BlinkMacSystemFont", "Segoe UI", "Roboto", "Oxygen", "Ubuntu",
                        "Cantarell", "Fira Sans", "Droid Sans", "Helvetica Neue", "sans-serif"
                )
    }
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    Div(attrs = {
        classes("w-full", "h-full", "min-h-screen", "bg-background", "antialiased")
        id("app")
    }) {
        content()
    }
}
