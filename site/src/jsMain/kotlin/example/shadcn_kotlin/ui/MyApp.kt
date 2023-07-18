package example.shadcn_kotlin.ui

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.core.init.InitKobweb
import com.varabyte.kobweb.core.init.InitKobwebContext
import org.jetbrains.compose.web.dom.Div

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    Div(attrs = {
        classes("min-h-screen", "antialiased")
        id("app")
    }) {
        content()
    }
}

@InitKobweb
fun initKobweb(ctx: InitKobwebContext) {

    ctx.router.addRouteInterceptor {
        console.log(path)
        if (path == "/docs/components") {
            path = "/docs/components/accordion"
        }
    }
}