---
title: Alert Dialog
description: A modal dialog that interrupts the user with important content and expects a response.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/alert-dialog
  api: https://www.radix-ui.com/docs/primitives/components/alert-dialog#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.AlertDialogDemo
---

<ComponentPreview component="AlertDialogDemo {}" file="AlertDialogDemo" />

## Usage

```kotlin
import shadcn.ui.components.AlertDialog
import shadcn.ui.components.AlertDialogContent
import shadcn.ui.components.AlertDialogHeader
import shadcn.ui.components.AlertDialogTrigger
import shadcn.ui.components.AlertDialogTitle
import shadcn.ui.components.AlertDialogDescription
import shadcn.ui.components.AlertDialogFooter
import shadcn.ui.components.AlertDialogCancel
import shadcn.ui.components.AlertDialogAction
```

```kotlin
AlertDialog {
    AlertDialogTrigger { +"Show Dialog" }
    AlertDialogContent {
        AlertDialogHeader {
            AlertDialogTitle { +"Are you absolutely sure?" }
            AlertDialogDescription {
                +"This action cannot be undone. This will permanently delete your "
                +"account and remove your data from our servers."
            }
        }
        AlertDialogFooter {
            AlertDialogCancel { +"Cancel" }
            AlertDialogAction { +"Continue" }
        }
    }
}
```