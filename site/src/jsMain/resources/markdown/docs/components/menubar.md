---
title: Menubar
description: A visually persistent menu common in desktop applications that provides quick access to a consistent set of commands.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/menubar
  api: https://www.radix-ui.com/docs/primitives/components/menubar#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.MenubarDemo
---

<ComponentPreview component="MenubarDemo {}" file="MenubarDemo" />

## Usage

```kotlin
import shadcn.ui.components.Menubar
import shadcn.ui.components.MenubarContent
import shadcn.ui.components.MenubarItem
import shadcn.ui.components.MenubarMenu
import shadcn.ui.components.MenubarSeparator
import shadcn.ui.components.MenubarShortcut
import shadcn.ui.components.MenubarTrigger
```

```kotlin
Menubar {
    MenubarMenu {
        MenubarTrigger { +"File" }
        MenubarContent {
            MenubarItem {
                + "New Tab "
                MenubarShortcut { +"⌘T" }
            }
            MenubarItem { + "New Window" }
            MenubarSeparator {}
            MenubarItem { + "Share" }
            MenubarSeparator {}
            MenubarItem { + "Print" }
        }
    }
}
```