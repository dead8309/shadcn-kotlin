---
title: Calendar
description: A date field component that allows users to enter and edit date.
root: .components.layouts.MDLayout
imports:
  - .pages.components.demo.CalendarDemo
---

<ComponentPreview component="CalendarDemo {}" file="CalendarDemo" />

## About

The `Calendar` component is built on top of [React DayPicker](https://react-day-picker.js.org).

## Usage

```kotlin
import shadcn.ui.components.Calendar
```

```kotlin
val (date, setDate) = useState<Date>()

Calendar {
    mode="single"
    selected= date
    onSelect= setDate
    className= ClassName("rounded-md border")
}
```

See the [React DayPicker](https://react-day-picker.js.org) documentation for more information.

## Date Picker

You can use the `<Calendar>` component to build a date picker. See the [Date Picker](/docs/components/date-picker) page for more information.