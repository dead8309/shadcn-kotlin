---
title: Dialog
description: A window overlaid on either the primary window or another dialog window, rendering the content underneath inert.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/dialog
  api: https://www.radix-ui.com/docs/primitives/components/dialog#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.DialogDemo
---

<ComponentPreview component="DialogDemo {}" file="DialogDemo" />

## Usage

```kotlin
import shadcn.ui.components.Dialog
import shadcn.ui.components.DialogContent
import shadcn.ui.components.DialogDescription
import shadcn.ui.components.DialogHeader
import shadcn.ui.components.DialogTitle
import shadcn.ui.components.DialogTrigger
```

```kotlin
Dialog {
    DialogTrigger { + "Open" }
    DialogContent {
        DialogHeader {
            DialogTitle { + "Are you sure absolutely sure?" }
            DialogDescription {
                + "This action cannot be undone. This will permanently delete your account "
                + "and remove your data from our servers."
            }
        }
    }
}
```

## Notes

To activate the `Dialog` component from within a `Context Menu` or `Dropdown Menu`, you must encase the `Context Menu` or
`Dropdown Menu` component in the `Dialog` component. For more information, refer to the linked issue [here](https://github.com/radix-ui/primitives/issues/1836).

```kotlin {14-25}
Dialog {
    ContextMenu {
        ContextMenuTrigger { +"Right click" }
        ContextMenuContent {
            ContextMenuItem { +"Open" }
            ContextMenuItem { +"Download" }
            DialogTrigger {
                asChild = true
                ContextMenuItem {
                    span { +"Delete" }
                }
            }
        }
    }
    DialogContent {
        DialogHeader {
            DialogTitle { +"Are you sure absolutely sure?" }
            DialogDescription {
                +"This action cannot be undone. This will permanently delete your account "
                +"and remove your data from our servers."
            }
        }
        DialogFooter {
            Button {
                type = ButtonType.submit
                +"Confirm"
            }
        }
    }
}
```