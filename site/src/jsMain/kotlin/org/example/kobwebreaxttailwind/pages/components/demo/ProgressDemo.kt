package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import react.useEffect
import react.useState
import shadcn.ui.components.Progress
import web.cssom.ClassName
import web.timers.setInterval
import kotlin.time.Duration.Companion.milliseconds

val ProgressDemo = FC<Props> {
    Progress {
        value = 60
        className = ClassName("w-[60%]")
    }
}