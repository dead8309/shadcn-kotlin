---
title: Command
description: Fast, composable, unstyled command menu for React.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.CommandDemo
  - .pages.components.demo.CommandMenu
---

<ComponentPreview component="CommandDemo {}" file="CommandDemo" />

## About

The `<Command />` component uses the [`cmdk`](https://cmdk.paco.me) component by [pacocoursey](https://twitter.com/pacocoursey).

## Usage

```kotlin
import shadcn.ui.components.*
```

```kotlin
Command {
    CommandInput { placeholder = "Type a command or search..." }
    CommandList {
        CommandEmpty { +"No results found." }
        CommandGroup {
            heading = ReactNode("Suggestions")
            CommandItem { +"Calendar" }
            CommandItem { +"Search Emoji" }
            CommandItem { +"Calculator" }
        }
        CommandSeparator {}
        CommandGroup {
            heading = ReactNode("Settings")
            CommandItem { +"Profile" }
            CommandItem { +"Billing" }
            CommandItem { +"Settings" }
        }
    }
}
```

## Examples

### Dialog

<ComponentPreview component="CommandMenu {}" file="CommandMenu" />

To show the command menu in a dialog, use the `CommandDialog {}` component.

```kotlin
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
    
    CommandDialog {
        this.open = open
        onOpenChange = setOpen
        
        CommandInput { placeholder = "Type a command or search..." }
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
```

### Combobox

You can use the `<Command />` component as a combobox. See the [Combobox](/docs/components/combobox) page for more information.