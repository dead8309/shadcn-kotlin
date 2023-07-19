---
title: Collapsible
description: An interactive component which expands/collapses a panel.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/collapsible
  api: https://www.radix-ui.com/docs/primitives/components/collapsible#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.CollapsibleDemo
---

<ComponentPreview component="CollapsibleDemo {}" file="CollapsibleDemo" />

## Usage

```kotlin
import shadcn.ui.components.Collapsible
import shadcn.ui.components.CollapsibleContent
import shadcn.ui.components.CollapsibleTrigger
```

```kotlin
Collapsible {
    CollapsibleTrigger { +"Can I use this in my project?" }
    CollapsibleContent {
        + "Yes.Free to use for personal and commercial projects . No attribution required."
    }
}
```