package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.*
import web.cssom.ClassName

val ContextMenuDemo = FC<Props> {
    ContextMenu {
        ContextMenuTrigger {
            className = ClassName("flex h-[150px] w-[300px] items-center justify-center rounded-md border border-dashed text-sm")
            +"Right click here"
        }
        ContextMenuContent {
            className = ClassName("w-64")
            ContextMenuItem {
                inset = true
                +"Back"
                ContextMenuShortcut { +"⌘[" }
            }
            ContextMenuItem {
                inset = true
                disabled = true
                +"Forward"
                ContextMenuShortcut { +"⌘]" }
            }
            ContextMenuItem {
                inset = true
                +"Reload"
                ContextMenuShortcut { +"⌘R" }
            }
            ContextMenuSub {
                ContextMenuSubTrigger {
                    inset = true
                    +"More Tools"
                }
                ContextMenuSubContent {
                    className = ClassName("w-48")
                    ContextMenuItem {
                        +"Save Page As..."
                        ContextMenuShortcut { +"⇧⌘S" }
                    }
                    ContextMenuItem { +"Name Window" }
                    ContextMenuSeparator {}
                    ContextMenuItem { +"Developer Tools" }
                }
            }
            ContextMenuSeparator {}
            ContextMenuCheckboxItem {
                checked = true
                +"Show Bookmarks Bar"
                ContextMenuShortcut { +"⌘⇧B" }
            }
            ContextMenuCheckboxItem {
                +"Show Full URLs"
            }
            ContextMenuSeparator {}
            ContextMenuRadioGroup {
                value = "pedro"
                ContextMenuLabel {
                    inset = true
                    +"People"
                }
                ContextMenuSeparator {}
                ContextMenuRadioItem {
                    value = "pedro"
                    +"Pedro Duarte"
                }
                ContextMenuRadioItem {
                    value = "colm"
                    +"Colm Tuite"
                }
            }
        }
    }
}