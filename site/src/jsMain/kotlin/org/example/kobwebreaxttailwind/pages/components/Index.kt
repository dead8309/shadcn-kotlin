package org.example.kobwebreaxttailwind.pages.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Div
import react.create
import react.dom.client.createRoot
import web.dom.document


@Page
@Composable
fun ComponentPage() {
    kotlinext.js.require("./globals.css")
    Div({ id("sink")
        classes("w-full")})
    LaunchedEffect(Unit) {
        val root = document.getElementById("sink")
        createRoot(root!!).render(ComponentSink.create {
            components = demoComponents
        })
    }
}

