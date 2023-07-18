---
title: Date Picker
description: A date picker component with range and presets.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.DatePickerDemo
---

<ComponentPreview component="DatePickerDemo {}" file="DatePickerDemo" />

## Installation

The Date Picker is built using a composition of the `<Popover />` and the `<Calendar />` components.

## Usage

```kotlin
val (date, setDate) = useState<Date>()
    Popover {
        PopoverTrigger {
            asChild = true
            Button {
                variant = "outline"
                className =
                    ClassName(
                    "w-[280px] justify-start text-left font-normal${
                        if (date == null) " text-muted-foreground" else ""
                    }")
                CalendarIcon {
                    className = ClassName("mr-2 h-4 w-4")
                }
                if (date != null)
                    +format(date,"PPP")
                else {
                    span {
                        +"Pick a date"
                    }
                }
            }
        }
        PopoverContent {
            className = ClassName("w-auto p-0" )
            Calendar {
                mode = "single"
                selected=date
                onSelect= setDate
                initialFocus = true
            }
        }
    }
```

See the [React DayPicker](https://react-day-picker.js.org) documentation for more information.

## Examples

### Date Picker

<ComponentPreview component="DatePickerDemo {}" file="DatePickerDemo" />