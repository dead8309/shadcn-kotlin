---
title: Input
description: Displays a form input field or a component that looks like an input field.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.InputDemo
  - .pages.components.demo.InputFile
  - .pages.components.demo.InputDisabled
  - .pages.components.demo.InputWithLabel
  - .pages.components.demo.InputWithButton
---

<ComponentPreview component="InputDemo {}" file="InputDemo" />

## Usage

```kotlin
import shadcn.ui.components.Input
```

```kotlin
Input {}
```

## Examples

### Default

<ComponentPreview component="InputDemo {}" file="InputDemo" />

### File

<ComponentPreview component="InputFile {}" file="InputFile" />

### Disabled

<ComponentPreview component="InputDisabled {}" file="InputDisabled" />

### With Label

<ComponentPreview component="InputWithLabel {}" file="InputWithLabel" />

### With Button

<ComponentPreview component="InputWithButton {}" file="InputWithButton" />