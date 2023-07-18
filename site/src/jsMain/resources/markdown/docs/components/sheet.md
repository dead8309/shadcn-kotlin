---
title: Sheet
description: Extends the Dialog component to display content that complements the main content of the screen.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/dialog
  api: https://www.radix-ui.com/docs/primitives/components/dialog#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.SheetDemo
  - .pages.components.demo.SheetSideDemo
---

<ComponentPreview component="SheetDemo {}" file="SheetDemo" />

### Usage

```kotlin
import shadcn.ui.components.Sheet
import shadcn.ui.components.SheetContent
import shadcn.ui.components.SheetDescription
import shadcn.ui.components.SheetHeader
import shadcn.ui.components.SheetTitle
import shadcn.ui.components.SheetTrigger
```

```kotlin
Shhet {
    SheetTrigger { + "Open" }
    SheetContent {
        SheetHeader {
            SheetTitle { + "Are you sure absolutely sure?" }
            SheetDescription {
                +"This action cannot be undone.This will permanently delete your account"
                + "and remove your data from our servers."
            }
        }
    }
}
```

## Examples

### Side

Use the `side` property to `<SheetContent />` to indicate the edge of the screen where the component will appear. The values can be `top`, `right`, `bottom` or `left`.

<ComponentPreview component="SheetSideDemo {}" file="SheetSideDemo" />

### Size

You can adjust the size of the sheet using CSS classes:

```kotlin {4}
Shhet {
    SheetTrigger { + "Open" }
    SheetContent {
        className = ClassName("w-[400px] sm:w-[540px]")
        SheetHeader {
            SheetTitle { + "Are you sure absolutely sure?" }
            SheetDescription {
                +"This action cannot be undone.This will permanently delete your account"
                + "and remove your data from our servers."
            }
        }
    }
}
```
