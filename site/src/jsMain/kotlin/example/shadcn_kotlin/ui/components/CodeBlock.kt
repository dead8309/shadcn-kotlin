package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import lucide_react.CheckIcon
import lucide_react.CopyIcon
import org.jetbrains.compose.web.dom.Div
import react.*
import react.dom.client.createRoot
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.code
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.pre
import react.dom.html.ReactHTML.span
import shadcn.ui.components.Button
import shadcn.ui.components.ScrollArea
import web.cssom.ClassName
import web.dom.document
import web.events.Event
import web.events.EventType
import web.html.HTMLButtonElement
import web.navigator.navigator
import web.timers.setTimeout
import kotlin.time.Duration.Companion.seconds

@Composable
fun CodeBlock(text: String, lang: String? = null) {
    useReactEffect {
        CodeBlock {
            value = text
        }
    }
}

val CodeBlock = FC<PropsWithValue<String>> { props ->
    div {
        className = ClassName("relative")
        pre {
            className =
                ClassName("mb-4 mt-6 max-h-[650px] overflow-x-auto rounded-lg border py-4 data-[theme=dark]:bg-background data-[theme=light]:bg-white")
            code {
                this.lang = lang
                className = ClassName("flex flex-col relative rounded font-mono text-sm")
                props.value.split("\n").map {
                    span {
                        className = ClassName("px-4 py-0.5")
                        + it
                    }
                }
            }
            CopyButton {
                value = props.value
                className = ClassName("absolute right-4 top-4")
            }
        }
    }
}

fun copyToClipboard(value: String) {
    navigator.clipboard.writeText(value)
}

external interface CopyButtonProps : HTMLAttributes<HTMLButtonElement> {
    var value: String
    var src: String?
}

val CopyButton = FC<CopyButtonProps> { props ->
    val (hasCopied, setHasCopied) = useState(false)
    useEffect(arrayOf(hasCopied)) {
        setTimeout(2.seconds) {
            setHasCopied(false)
        }
    }
    Button {
        size = "icon"
        variant = "outline"
        className = ClassName("z-10 h-6 w-6 hover:bg-muted ${props.className}")
        onClick = {
            copyToClipboard(props.value)
            setHasCopied(true)
        }
        if (hasCopied)
            CheckIcon { className = ClassName("h-3 w-3") }
        else
            CopyIcon { className = ClassName("h-3 w-3") }

        span {
            className = ClassName("sr-only")
            +"Copy"
        }
    }
}