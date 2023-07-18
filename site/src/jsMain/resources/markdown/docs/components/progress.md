---
title: Progress
description: Displays an indicator showing the completion progress of a task, typically displayed as a progress bar.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/progress
  api: https://www.radix-ui.com/docs/primitives/components/progress#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.ProgressDemo
---

<ComponentPreview component="ProgressDemo {}" file="ProgressDemo" />

## Usage

```kotlin
import shadcn.ui.components.Progress
```

```kotlin
Progress { value = 60 }
```