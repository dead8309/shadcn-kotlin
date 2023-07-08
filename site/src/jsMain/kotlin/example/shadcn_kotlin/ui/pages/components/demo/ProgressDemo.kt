package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Progress
import web.cssom.ClassName

val ProgressDemo = FC<Props> {
    Progress {
        value = 60
        className = ClassName("w-[60%]")
    }
}