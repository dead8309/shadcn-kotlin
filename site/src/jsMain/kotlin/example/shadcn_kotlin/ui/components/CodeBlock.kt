package example.shadcn_kotlin.ui.components

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import lucide_react.CheckIcon
import lucide_react.CopyIcon
import react.FC
import react.Props
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.code
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.pre
import react.dom.html.ReactHTML.span
import react.useEffect
import react.useState
import shadcn.ui.components.Button
import web.cssom.ClassName
import web.html.HTMLButtonElement
import web.navigator.navigator
import web.timers.setTimeout
import kotlin.time.Duration.Companion.seconds

@Composable
fun CodeBlock(
    code: String,
    lang: String,
    highlight: String,
    title: String? = ""
) {
    useReactEffect {
        CodeBlock {
            value = code
            this.lang = lang
            this.highlight = highlight
            this.title = title
        }
    }
}
external interface CodeBlockProps: Props {
    var value: String
    var lang: String?
    var highlight: String
    var title: String?
}

val CodeBlock = FC<CodeBlockProps> { props ->
    if (props.title != null) {
        div {
            className = ClassName("text-sm leading-5 font-medium mt-2 pt-6 px-4")
            +props.title
        }
    }
    div {
        className = ClassName("relative")
        pre {
            // TODO: Add line highlight attr("data-line", highlight)
            className =
                ClassName("mb-4 mt-6 max-h-[650px] overflow-x-auto rounded-lg border py-4 data-[theme=dark]:bg-background data-[theme=light]:bg-white")
            code {
                className = ClassName("relative rounded font-mono text-sm language-${props.lang}")
                + props.value
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