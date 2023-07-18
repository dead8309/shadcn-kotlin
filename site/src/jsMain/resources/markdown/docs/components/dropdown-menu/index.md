---
title: Dropdown Menu
description: Displays a menu to the user — such as a set of actions or functions — triggered by a button.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/dropdown-menu
  api: https://www.radix-ui.com/docs/primitives/components/dropdown-menu#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.DropdownMenuDemo
  - .pages.components.demo.DropdownMenuCheckboxes
  - .pages.components.demo.DropdownMenuRadioGroupDemo
---

<ComponentPreview component="DropdownMenuDemo {}" file="DropdownMenuDemo" />

## Usage

```kotlin
import shadcn.ui.components.DropdownMenu
import shadcn.ui.components.DropdownMenuContent
import shadcn.ui.components.DropdownMenuItem
import shadcn.ui.components.DropdownMenuLabel
import shadcn.ui.components.DropdownMenuSeparator
import shadcn.ui.components.DropdownMenuTrigger
```

```kotlin
DropdownMenu {
    DropdownMenuTrigger { + "Open" }
    DropdownMenuContent {
        DropdownMenuLabel { + "My Account" }
        DropdownMenuSeparator {}
        DropdownMenuItem { + "Profile" }
        DropdownMenuItem { + "Billing" }
        DropdownMenuItem { + "Team" }
        DropdownMenuItem { + "Subscription" }
    }
}
```

## Examples

### Checkboxes

<ComponentPreview component="DropdownMenuCheckboxes {}" file="DropdownMenuCheckboxes" />

### Radio Group

<ComponentPreview component="DropdownMenuRadioGroupDemo {}" file="DropdownMenuRadioGroupDemo" />