package example.shadcn_kotlin.ui.components.hooks

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.renderComposable
import react.useLayoutEffectOnce
import web.crypto.crypto

fun useCompose(
    id: String = "",
    composable: @Composable () -> Unit
) {
    useLayoutEffectOnce {
        renderComposable(id.ifEmpty { crypto.randomUUID() }) {
            composable()
        }
    }
}