---
title: Textarea
description: Displays a form textarea or a component that looks like a textarea.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.TextareaDemo
  - .pages.components.demo.TextareaDisabled
  - .pages.components.demo.TextareaWithText
  - .pages.components.demo.TextareaWithLabel
  - .pages.components.demo.TextareaWithButton
---

<ComponentPreview component="TextareaDemo {}" file="TextareaDemo" />

## Usage

```kotlin
import shadcn.ui.components.Textarea
```

```kotlin
Textarea {}
```

## Examples

### Default

<ComponentPreview component="TextareaDemo {}" file="TextareaDemo" />


### Disabled

<ComponentPreview component="TextareaDisabled {}" file="TextareaDisabled" />

### With Label

<ComponentPreview component="TextareaWithLabel {}" file="TextareaWithLabel" />

### With Text

<ComponentPreview component="TextareaWithText {}" file="TextareaWithText" />

### With Button

<ComponentPreview component="TextareaWithButton {}" file="TextareaWithButton" />