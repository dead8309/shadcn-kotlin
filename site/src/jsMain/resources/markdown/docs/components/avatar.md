---
title: Avatar
description: An image element with a fallback for representing the user.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/avatar
  api: https://www.radix-ui.com/docs/primitives/components/avatar#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.AvatarDemo
---

<ComponentPreview component="AvatarDemo {}" file="AvatarDemo" />

## Usage

```kotlin
import shadcn.ui.components.Avatar
import shadcn.ui.components.AvatarFallback
import shadcn.ui.components.AvatarImage
```

```kotlin
Avatar {
    AvatarImage {
        src = "https://github.com/shadcn.png"
        alt = "@shadcn"
    }
    AvatarFallback {
        +"CN"
    }
}
```