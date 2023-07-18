---
title: Tooltip
description: A popup that displays information related to an element when the element receives keyboard focus or the mouse hovers over it.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/tooltip
  api: https://www.radix-ui.com/docs/primitives/components/tooltip#api-reference
root: .components.layouts.MDLayout
imports:
   - .pages.components.demo.TooltipDemo
---

<ComponentPreview component="TooltipDemo {}" file="TooltipDemo" />

## Usage

```kotlin
import shadcn.ui.components.Tooltip
import shadcn.ui.components.TooltipContent
import shadcn.ui.components.TooltipProvider
import shadcn.ui.components.TooltipTrigger
```

```kotlin
TooltipProvider {
    Tooltip {
        TooltipTrigger { +"Hover" }
        TooltipContent {
            p { +"Add to library" }
        }
    }
}
```