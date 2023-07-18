package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.Terminal
import react.FC
import react.Props
import shadcn.ui.components.Alert
import shadcn.ui.components.AlertDescription
import shadcn.ui.components.AlertTitle
import web.cssom.ClassName

val AlertDemo = FC<Props> {
    Alert {
        Terminal { className = ClassName("h-4 w-4") }
        AlertTitle { + "Heads up!" }
        AlertDescription { + "All components are published in a single library." }
    }
}