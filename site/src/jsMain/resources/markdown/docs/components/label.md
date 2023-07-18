---
title: Label
description: Renders an accessible label associated with controls.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/label
  api: https://www.radix-ui.com/docs/primitives/components/label#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.LabelDemo
---

<ComponentPreview component="LabelDemo {}" file="LabelDemo" />

## Usage

```kotlin
import shadcn.ui.components.Label
```

```kotlin
Label {
    htmlFor="email"
    + "Your email address"
}
```