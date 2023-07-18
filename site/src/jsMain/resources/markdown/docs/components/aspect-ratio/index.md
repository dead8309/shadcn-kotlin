---
title: Aspect Ratio
description: Displays content within a desired ratio.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/aspect-ratio
  api: https://www.radix-ui.com/docs/primitives/components/aspect-ratio#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.AspectRatioDemo
---

<ComponentPreview component="AspectRatioDemo {}" file="AspectRatioDemo" />

## Usage

```kotlin
import react.dom.html.ReactHTML.img
import shadcn.ui.components.AspectRatio
```

```kotlin
AspectRatio {
    ratio = 16 / 9
    className = ClassName("bg-muted")
    img {
        src = "https://images.unsplash.com/photo-1588345921523-c2dcdb7f1dcd?w=800&dpr=2&q=80"
        alt = "Photo by Drew Beamer"
        className = ClassName("rounded-md object-cover")
    }
}
```