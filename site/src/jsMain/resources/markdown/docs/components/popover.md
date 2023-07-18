---
title: Popover
description: Displays rich content in a portal, triggered by a button.
component: true
radix:
    link: https://www.radix-ui.com/docs/primitives/components/popover
    api: https://www.radix-ui.com/docs/primitives/components/popover#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.PopoverDemo
---

<ComponentPreview component="PopoverDemo {}" file="PopoverDemo" />

## Usage

```kotlin
import shadcn.ui.components.Popover
import shadcn.ui.components.PopoverContent
import shadcn.ui.components.PopoverTrigger
```

```kotlin
Popover {
    PopoverTrigger { +"Open" }
    PopoverContent { +"Place content for the popover here." }
}
```