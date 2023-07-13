package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Table

@Composable
fun mdTable(
    content: @Composable () -> Unit
) {
    Div({ classes("my-6","w-full","overflow-y-auto") }) {
        Table({ classes("w-full")}) {
            content()
        }
    }
}