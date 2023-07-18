---
title: Button
description: Displays a button or a component that looks like a button.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.buttons.*
---

<ComponentPreview component="ButtonDemo {}" file="button-demo" />

## Usage

```kotlin
import shadcn.ui.components.Button
```

```kotlin
Button {
    variant = "outline"
    +"Outline"
}
```


## Examples

### Primary

<ComponentPreview component="ButtonDemo {}" file="button-demo" />

### Secondary

<ComponentPreview component="ButtonSecondary {}" file="button-secondary" />

### Destructive

<ComponentPreview component="ButtonDestructive {}" file="button-destructive" />

### Outline

<ComponentPreview component="ButtonOutline {}" file="button-outline" />

### Ghost

<ComponentPreview component="ButtonGhost {}" file="button-ghost" />

### Link

<ComponentPreview component="ButtonLink {}" file="button-link" />

### Icon

<ComponentPreview component="ButtonIcon {}" file="button-icon" />

### With Icon

<ComponentPreview component="ButtonWithIcon {}" file="button-with-icon" />

### Loading

<ComponentPreview component="ButtonLoading {}" file="button-loading" />