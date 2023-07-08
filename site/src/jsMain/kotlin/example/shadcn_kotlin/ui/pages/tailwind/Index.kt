package example.shadcn_kotlin.ui.pages.tailwind

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun IndexPage() {
    kotlinext.js.require("./globals.css")
    Div({classes("bg-red-700")}){
        Text("Hello")
    }
}