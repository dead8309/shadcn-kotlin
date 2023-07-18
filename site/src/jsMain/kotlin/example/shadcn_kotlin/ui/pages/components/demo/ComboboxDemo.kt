package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Check
import lucide_react.ChevronsUpDown
import react.FC
import react.Props
import react.dom.aria.AriaRole
import react.dom.aria.ariaExpanded
import react.useState
import shadcn.ui.components.*
import web.cssom.ClassName

val frameworks = mapOf(
    "next.js" to "Next.js",
    "sveltekit" to "SvelteKit",
    "nuxt.js" to "Nuxt.js",
    "remix" to "Remix",
    "astro" to "Astro"
)

val ComboboxDemo = FC<Props> {
    val (open, setOpen) = useState(false)
    val (value, setValue) = useState("")

    Popover {
        this.open = open
        onOpenChange = { setOpen(it) }
        PopoverTrigger {
            asChild = true
            Button {
                variant = "outline"
                role = AriaRole.combobox
                ariaExpanded = open
                className = ClassName("w-[200px] justify-between")
                + (frameworks[value] ?: "Select framework...")
                ChevronsUpDown { className = ClassName("ml-2 h-4 w-4 shrink-0 opacity-50") }
            }
        }
        PopoverContent {
            className = ClassName("w-[200px] p-0")
            Command {
                CommandInput {
                    placeholder = "Select framework..."
                }
                CommandEmpty { + "No framework found" }
                CommandGroup {
                    frameworks.forEach { (k,v) ->
                        CommandItem {
                            key = k
                            onSelect = {it: String ->
                                if (it === value) setValue("")
                                else setValue(it)
                                setOpen(false)
                            }
                            Check {
                                className = ClassName("mr-2 h-4 w-4 " + if (value === k) "opacity-100" else "opacity-0")
                            }
                            + v
                        }
                    }
                }
            }
        }
    }
}