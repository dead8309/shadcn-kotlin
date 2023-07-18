---
title: Context Menu
description: Displays a menu to the user — such as a set of actions or functions — triggered by a button.
radix:
    link: https://www.radix-ui.com/docs/primitives/components/context-menu
    api: https://www.radix-ui.com/docs/primitives/components/context-menu#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.ContextMenuDemo
---

<ComponentPreview component="ContextMenuDemo {}" file="ContextMenuDemo" />

## Usage

```kotlin
import shadcn.ui.components.ContextMenu
import shadcn.ui.components.ContextMenuContent
import shadcn.ui.components.ContextMenuItem
import shadcn.ui.components.ContextMenuTrigger
```

```kotlin
ContextMenu {
    ContextMenuTrigger { + "Right click" }
    ContextMenuContent {
        ContextMenuItem { + "Profile" }
        ContextMenuItem { + "Billing" }
        ContextMenuItem { + "Team" }
        ContextMenuItem { + "Subscription" }
    }
}
```