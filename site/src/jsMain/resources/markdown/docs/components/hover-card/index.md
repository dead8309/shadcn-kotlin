---
title: Hover Card
description: For sighted users to preview content available behind a link.
component: true
radix:
  link: https://www.radix-ui.com/docs/primitives/components/hover-card
  api: https://www.radix-ui.com/docs/primitives/components/hover-card#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.HoverCardDemo
---

<ComponentPreview component="HoverCardDemo {}" file="HoverCardDemo" />

## Usage

```kotlin
import shadcn.ui.components.HoverCard
import shadcn.ui.components.HoverCardContent
import shadcn.ui.components.HoverCardTrigger
```

```kotlin
HoverCard {
    HoverCardTrigger { + "Hover" }
    HoverCardContent {
        + "The React Framework – created and maintained by @vercel."
    }
}
```