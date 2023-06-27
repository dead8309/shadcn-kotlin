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
    val (progress, setProgress) = useState(0)
    useEffect {
        val timer = setInterval(600.milliseconds){
            if (progress == 100)
                setProgress(0)
            else
                setProgress(progress+1)
        }
    }
    Progress {
        value = progress
        className = ClassName("w-[60%]")
    }
}