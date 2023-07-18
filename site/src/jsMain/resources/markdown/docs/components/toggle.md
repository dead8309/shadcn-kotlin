---
title: Toggle
description: A two-state button that can be either on or off.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/toggle
  api: https://www.radix-ui.com/docs/primitives/components/toggle#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.ToggleDemo
  - .pages.components.demo.ToggleOutline
  - .pages.components.demo.ToggleDisabled
  - .pages.components.demo.ToggleWithText
---

<ComponentPreview component="ToggleDemo {}" file="ToggleDemo" />

## Usage

```kotlin
import shadcn.ui.components.Toggle
```

```kotlin
Toggle { + "Toggle" }
```

## Examples

### Default

<ComponentPreview component="ToggleDemo {}" file="ToggleDemo" />

### Outline

<ComponentPreview component="ToggleOutline {}" file="ToggleOutline" />

### With Text

<ComponentPreview component="ToggleWithText {}" file="ToggleWithText" />

### Disabled

<ComponentPreview component="ToggleDisabled {}" file="ToggleDisabled" />
