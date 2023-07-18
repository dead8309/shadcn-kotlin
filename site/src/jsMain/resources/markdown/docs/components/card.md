---
title: Card
description: Displays a card with header, content, and footer.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.CardDemo
---

<ComponentPreview component="CardDemo {}" file="CardDemo" />

## Usage

```kotlin
import shadcn.ui.components.Card
import shadcn.ui.components.CardHeader
import shadcn.ui.components.CardTitle
import shadcn.ui.components.CardDescription
import shadcn.ui.components.CardContent
import shadcn.ui.components.CardFooter
```

```kotlin
Card {
    CardHeader {
        CardTitle { +"Card Title" }
        CardDescription { + "Card Description" }
    }
    CardContent { 
        p { + "Card Content" }
    }
    CardFooter {
        p { + "Card Footer" }
    }
}
```