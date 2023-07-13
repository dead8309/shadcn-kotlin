package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import react.ChildrenBuilder
import react.dom.html.ReactHTML.div
import web.cssom.ClassName

@Composable
fun Steps(child: ChildrenBuilder.() -> Unit) {
    useReactEffect {
        div {
            className = ClassName("[&>h3]:step steps mb-12 ml-4 border-l pl-8 [counter-reset:step]")
            child(this)
        }
    }
}
@Composable
fun Step(child: ChildrenBuilder.() -> Unit) {
    useReactEffect {
        div {
            className = ClassName("font-heading mt-8 scroll-m-20 text-xl font-semibold tracking-tight")
            child(this)
        }
    }
}