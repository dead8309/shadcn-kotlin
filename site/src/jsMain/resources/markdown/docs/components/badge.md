---
title: Badge
description: Displays a badge or a component that looks like a badge.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.BadgeDemo
  - .pages.components.demo.BadgeDestructive
  - .pages.components.demo.BadgeOutline
  - .pages.components.demo.BadgeSecondary
---

<ComponentPreview component="BadgeDemo {}" file="BadgeDemo" />

## Usage

```kotlin
import shadcn.ui.components.Badge
```

```kotlin
Badge {
    variant="outline"
    +"Badge"
}
```

## Examples

### Default

<ComponentPreview component="BadgeDemo {}" file="BadgeDemo" />

---

### Secondary

<ComponentPreview component="BadgeSecondary {}" file="BadgeSecondary" />

---

### Outline

<ComponentPreview component="BadgeOutline {}" file="BadgeOutline" />

---

### Destructive

<ComponentPreview component="BadgeDestructive {}" file="BadgeDestructive" />