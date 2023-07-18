---
title: Tabs
description: A set of layered sections of content—known as tab panels—that are displayed one at a time.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/tabs
  api: https://www.radix-ui.com/docs/primitives/components/tabs#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.TabsDemo
---

<ComponentPreview component="TabsDemo {}" file="TabsDemo" />

## Usage

```kotlin
import shadcn.ui.components.Tabs
import shadcn.ui.components.TabsContent
import shadcn.ui.components.TabsList
import shadcn.ui.components.TabsTrigger
```

```kotlin
Tabs {
    defaultValue = "account"
    className = ClassName("w-[400px]")
    TabsList {
        TabsTrigger {
            value = "account"
            +"Account"
        }
        TabsTrigger {
            value = "password"
            +"Password"
        }
    }
    TabsContent {
        value = "account"
        +"Make changes to your account here."
    }
    TabsContent {
        value = "password"
        +"Change your password here."
    }
}
```
