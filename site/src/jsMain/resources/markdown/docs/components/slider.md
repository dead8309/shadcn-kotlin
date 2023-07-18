---
title: Slider
description: An input where the user selects a value from within a given range.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/slider
  api: https://www.radix-ui.com/docs/primitives/components/slider#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.SliderDemo
---

<ComponentPreview component="SliderDemo {}" file="SliderDemo" />

## Usage

```kotlin
import shadcn.ui.components.Slider
```

```kotlin
Slider {
    defaultValue = arrayOf(33)
    max = 100
    step = 1
}
```
