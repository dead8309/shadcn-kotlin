package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.*
import lucide_react.Calendar
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.span
import shadcn.ui.components.*
import shadcn.ui.components.Command
import web.cssom.ClassName

val CommandDemo = FC<Props> {
    Command {
        className = ClassName("border rounded-lg shadow-md")
        CommandInput {
            placeholder = "Type a command or search..."
        }
        CommandList {
            CommandEmpty { +"No results found." }
            CommandGroup {
                heading = ReactNode("Suggestions")
                CommandItem {
                    Calendar { className = ClassName("w-4 h-4 mr-2") }
                    span { +"Calendar" }
                }
                CommandItem {
                    Smile { className = ClassName("w-4 h-4 mr-2") }
                    span { +"Search Emoji" }
                }
                CommandItem {
                    Calculator { className = ClassName("w-4 h-4 mr-2") }
                    span { +"Calculator" }
                }
            }
            CommandSeparator {}
            CommandGroup {
                heading = ReactNode("Settings")
                CommandItem {
                    User { className = ClassName("w-4 h-4 mr-2") }
                    span { +"Profile" }
                    CommandShortcut { +"⌘P" }
                }
                CommandItem {
                    CreditCard { className = ClassName("w-4 h-4 mr-2") }
                    span { +"Billing" }
                    CommandShortcut { +"⌘B" }
                }
            }
        }
    }
}