package example.shadcn_kotlin.ui.pages.components.demo

import lucide_react.AlertCircle
import react.FC
import react.Props
import shadcn.ui.components.Alert
import shadcn.ui.components.AlertDescription
import shadcn.ui.components.AlertTitle
import web.cssom.ClassName

val AlertDestructive = FC<Props> {
    Alert {
        variant = "destructive"
        AlertCircle { className = ClassName("h-4 w-4") }
        AlertTitle { + "Error" }
        AlertDescription { + "Your session has expired. Please log in again." }
    }
}