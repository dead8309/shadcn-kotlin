---
title: Navigation Menu
description: A collection of links for navigating websites.
radix:
  link: https://www.radix-ui.com/docs/primitives/components/navigation-menu
  api: https://www.radix-ui.com/docs/primitives/components/navigation-menu#api-reference
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.NavigationMenuDemo
---

<ComponentPreview component="NavigationMenuDemo {}" file="NavigationMenuDemo" />

## Usage

```kotlin
import shadcn.ui.components.NavigationMenu
import shadcn.ui.components.NavigationMenuContent
import shadcn.ui.components.NavigationMenuIndicator
import shadcn.ui.components.NavigationMenuItem
import shadcn.ui.components.NavigationMenuLink
import shadcn.ui.components.NavigationMenuList
import shadcn.ui.components.NavigationMenuTrigger
import shadcn.ui.components.NavigationMenuViewport
```

```kotlin
NavigationMenu {
    NavigationMenuList {
        NavigationMenuItem {
            NavigationMenuTrigger { +"Item One" }
            NavigationMenuContent {
                NavigationMenuLink { +"Link" }
            }
        }
    }
}
```