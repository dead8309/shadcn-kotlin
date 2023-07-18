---
title: Table
description: A responsive table component.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.TableDemo
---

<ComponentPreview component="TableDemo {}" file="TableDemo" />

## Usage

```kotlin
import shadcn.ui.components.Table
import shadcn.ui.components.TableBody
import shadcn.ui.components.TableCaption
import shadcn.ui.components.TableCell
import shadcn.ui.components.TableHead
import shadcn.ui.components.TableHeader
import shadcn.ui.components.TableRow
```

```kotlin
Table {
    TableCaption { + "A list of your recent invoices ."}
    TableHeader {
        TableRow {
            TableHead {
                className = ClassName("w-[100px]")
                    +"Invoice"
            }
            TableHead { +"Status" }
            TableHead { +"Method" }
            TableHead {
                className = ClassName("text-right")
                    +"Amount"
            }
        }
    }
    TableBody {
            TableRow {
                TableCell {
                    className = ClassName("font-medium")
                    + "INV001"
                }
                TableCell { +"Paid" }
                TableCell { +"Credit Card" }
                TableCell {
                    className = ClassName("text-right")
                    + "$250"
                }
            }
    }
}
```