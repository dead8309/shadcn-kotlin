package example.shadcn_kotlin.ui.pages.components.demo

import react.dom.html.ReactHTML.p
import kotlinx.browser.document
import org.w3c.dom.events.Event
import react.*
import react.dom.html.ReactHTML.kbd
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import web.cssom.ClassName

val CommandMenu = FC<Props> {
    val (open, setOpen) = useState(false)
    rawUseEffect({
        val down = { it: Event ->
            if (it.asDynamic().key === "k") {
                setOpen(!open)
            }
        }
        document.addEventListener("keydown", down)
        val cleanup: Cleanup =  { document.removeEventListener("keydown", down) }
        cleanup
    })

    p {
        className = ClassName("text-sm text-muted-foreground")
        + "Press "
        kbd {
            className = ClassName("pointer-events-none inline-flex h-5 select-none items-center gap-1 rounded border bg-muted px-1.5 font-mono text-[10px] font-medium text-muted-foreground opacity-100")
            span {
                className = ClassName("text-xs")
                + "⌘"
            }
            + "K"
        }
    }
    CommandDialog {
        this.open = open
        onOpenChange = setOpen

        CommandInput {
            placeholder = "Type a command or search..."
        }

        CommandList {
            CommandEmpty { +"No results found." }
            CommandGroup {
                CommandItem { +"Calendar" }
                CommandItem { +"Search Emoji " }
                CommandItem { +"Calculator" }
            }
        }
    }
}