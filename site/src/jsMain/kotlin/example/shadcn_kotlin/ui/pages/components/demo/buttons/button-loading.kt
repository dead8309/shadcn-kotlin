package example.shadcn_kotlin.ui.pages.components.demo.buttons

import lucide_react.Loader2
import react.FC
import react.Props
import shadcn.ui.components.Button
import web.cssom.ClassName

val ButtonLoading= FC<Props> {
    Button {
        disabled = true
        Loader2 {
            className = ClassName("mr-2 h-4 w-4 animate-spin")
        }
        +"Please wait"
    }
}