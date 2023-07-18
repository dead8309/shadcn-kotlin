---
title: Accordion
description: A vertically stacked set of interactive headings that each reveal a section of content.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/accordion
  api: https://www.radix-ui.com/docs/primitives/components/accordion#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.AccordionDemo
---

<ComponentPreview component="AccordionDemo {}" file="AccordionDemo" />

## Usage

```kotlin
import shadcn.ui.components.Accordion
import shadcn.ui.components.AccordionContent
import shadcn.ui.components.AccordionItem
import shadcn.ui.components.AccordionTrigger
```

```kotlin
Accordion {
    type = "single"
    collapsible = true
    AccordionItem {
        value = "item-1"
        AccordionTrigger {
            +"Is it accessible?"
        }
        AccordionContent {
            +"Yes. It adheres to the WAI-ARIA design pattern."
        }
    }
}
```