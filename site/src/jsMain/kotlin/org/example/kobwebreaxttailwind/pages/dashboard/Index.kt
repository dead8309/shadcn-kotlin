package org.example.kobwebreaxttailwind.pages.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Div
import react.create
import react.dom.client.createRoot
import web.dom.document

@Page
@Composable
fun DashBoardPage() {
    kotlinext.js.require("./globals.css")
    Div({ id("dashboard")
    classes("w-full")})
    LaunchedEffect(Unit) {
        val root = document.getElementById("dashboard")
        createRoot(root!!).render(DashBoardApp.create())
    }
}

