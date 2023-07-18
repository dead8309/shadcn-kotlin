---
title: Radio Group
description: A set of checkable buttons—known as radio buttons—where no more than one of the buttons can be checked at a time.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/radio-group
  api: https://www.radix-ui.com/docs/primitives/components/radio-group#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.RadioGroupDemo
---

<ComponentPreview component="RadioGroupDemo {}" file="RadioGroupDemo" />

## Usage

```kotlin
import shadcn.ui.components.Label
import shadcn.ui.components.RadioGroup
import shadcn.ui.components.RadioGroupItem
```

```kotlin
RadioGroup {
    defaultValue = "option-one"
    div {
        className = ClassName("flex items-center space-x-2")
        RadioGroupItem {
            value = "option-one"
            id = "option-one"
        }
        Label {
            htmlFor = "option-one"
            +"Option One"
        }
    }
    div {
        className = ClassName("flex items-center space-x-2")
        RadioGroupItem {
            value = "option-two"
            id = "option-two"
        }
        Label {
            htmlFor = "option-two"
            +"Option Two"
        }
    }
}
```