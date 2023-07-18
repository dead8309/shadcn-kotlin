---
title: Alert
description: Displays a callout for user attention.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.AlertDemo
  - .pages.components.demo.AlertDestructive
---

<ComponentPreview component="AlertDemo {}" file="AlertDemo" />

## Usage

```kotlin
import shadcn.ui.components.Alert
import shadcn.ui.components.AlertDescription
import shadcn.ui.components.AlertTitle
```

```kotlin
Alert {
    Terminal { className = ClassName("h-4 w-4") }
    AlertTitle { +"Heads up!" }
    AlertDescription { +"All components are published in a single library." }
}
```

## Examples

### Default

<ComponentPreview component="AlertDemo {}" file="AlertDemo" />

### Destructive

<ComponentPreview component="AlertDestructive {}" file="AlertDestructive" />