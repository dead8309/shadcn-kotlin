package example.shadcn_kotlin.ui.components.hooks

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.jetbrains.compose.web.dom.Div
import react.ChildrenBuilder
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import web.crypto.crypto
import web.dom.document

@Composable
fun useReactEffect(
    content: ChildrenBuilder.() -> Unit
) {
    val id = crypto.randomUUID()
    Div({ id("rc-$id")})
    val node = FC<Props> {
        content()
    }
    LaunchedEffect(Unit) {
        val root = document.getElementById("rc-$id")
        createRoot(root!!).render(node.create())
    }
}
