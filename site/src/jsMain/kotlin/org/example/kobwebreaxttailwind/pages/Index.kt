package org.example.kobwebreaxttailwind.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.Page
import org.example.kobwebreaxttailwind.components.layouts.PageLayout
import org.example.kobwebreaxttailwind.components.react.ui.*
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
    PageLayout("React + Tailwind + Kobweb") {
        Text("React Components will appear here")
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
    val (check, setChecked) = useState(true)
    div {
        className = ClassName("flex flex-row items-center pt-4 gap-x-4")
        Checkbox {
            checked = check
            defaultChecked = false
            onCheckedChange = { setChecked(it) }
            id = "shad-check"
        }
        Label {
            htmlFor = "shad-check"
            className =
                ClassName("text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70")
            +"Accept terms and conditions"
        }
    }

    Button {
        variant = "default"
        +"Default Button"
    }
    Button {
        variant = "destructive"
        +"Destructive Button"
    }
    Button {
        variant = "outline"
        +"Outline Button"
    }
    Button {
        variant = "secondary"
        +"Secondary Button"
    }
    AlertDialog {
        AlertDialogTrigger {
            Button {
                variant ="outline"
                +"Show Dialog"
            }
        }
        AlertDialogContent {
            AlertDialogHeader {
                AlertDialogTitle {
                    +"Are you absolutely sure?"
                }
                AlertDialogDescription {
                    +"This action cannot be undone. This will permanently delete your "
                    +"account and remove your data from our servers."
                }
            }
            AlertDialogFooter {
                AlertDialogCancel {
                    +"Cancel"
                }
                AlertDialogAction {
                    +"Continue"
                }
            }
        }
    }
}
