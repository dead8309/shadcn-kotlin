package org.example.kobwebreaxttailwind.pages.components.demo

import radix_ui.components.SliderProps
import react.FC
import shadcn.ui.components.Slider

val SliderDemo = FC<SliderProps> {
    Slider {
        defaultValue = arrayOf(50)
        max = 100
        step = 1
        className = it.className
    }
}