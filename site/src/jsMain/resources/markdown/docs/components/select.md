---
title: Select
description: Displays a list of options for the user to pick from—triggered by a button.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/select
  api: https://www.radix-ui.com/docs/primitives/components/select#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.SelectDemo
---

<ComponentPreview component="SelectDemo {}" file="SelectDemo" />

## Usage

```kotlin
import shadcn.ui.components.Select
import shadcn.ui.components.SelectContent
import shadcn.ui.components.SelectItem
import shadcn.ui.components.SelectTrigger
import shadcn.ui.components.SelectValue
```

```kotlin
Select {
    SelectTrigger {
        className = ClassName("w-[180px]")
        SelectValue { placeholder = "Theme" }
    }
    SelectContent {
        SelectItem {
            value = "light"
            +"Light"
        }
        SelectItem {
            value = "dark"
            +"Dark"
        }
        SelectItem {
            value = "system"
            +"System"
        }
    }
}
```