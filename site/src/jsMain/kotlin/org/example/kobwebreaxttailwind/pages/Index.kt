package org.example.kobwebreaxttailwind.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.Page
import org.example.kobwebreaxttailwind.components.layouts.PageLayout
import org.example.kobwebreaxttailwind.components.react.Button
import org.example.kobwebreaxttailwind.components.react.ButtonSize
import org.example.kobwebreaxttailwind.components.react.ButtonVariant
import org.example.kobwebreaxttailwind.components.react.ui.Checkbox
import org.example.kobwebreaxttailwind.components.react.ui.Label
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import react.useState
import web.cssom.ClassName
import web.dom.document

@Page
@Composable
fun ReactPage() {
    kotlinext.js.require("./globals.css")
    PageLayout("React") {
        Text("React Components will appear here")
        Button(
            text = "Shadcn Button in Kobweb",
            variant = ButtonVariant.DEFAULT,
            size = ButtonSize.DEFAULT
        )
        Div(attrs = {
            classes("flex","flex-col","gap-y-4")
            id("shadcn")
        })
        LaunchedEffect(Unit) {
            val root = document.getElementById("shadcn")
            createRoot(root!!).render(ShadCnApp.create())
        }
    }
}

val ShadCnApp = FC<Props> {
    val (check,setChecked) = useState(true)
    div {
        Checkbox {
            checked = check
            defaultChecked = false
            onCheckedChange = { setChecked(it) }
            id = "shad-check"
        }
        Label {
            htmlFor = "shad-check"
            +"Accept Terms"
        }
    }

    org.example.kobwebreaxttailwind.components.react.ui.Button {
        variant = "default"
        +"Default Button"
    }
    org.example.kobwebreaxttailwind.components.react.ui.Button {
        variant = "destructive"
        +"Destructive Button"
    }
    org.example.kobwebreaxttailwind.components.react.ui.Button {
        variant = "outline"
        +"Outline Button"
    }
    org.example.kobwebreaxttailwind.components.react.ui.Button {
        variant = "secondary"
        className = ClassName("h-11 px-8 rounded-md")
        +"Secondary Button"
    }
}