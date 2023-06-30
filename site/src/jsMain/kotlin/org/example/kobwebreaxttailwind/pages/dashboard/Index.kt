package org.example.kobwebreaxttailwind.pages.dashboard

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.example.kobwebreaxttailwind.components.layouts.PageLayout
import react.create

@Page
@Composable
fun DashBoardPage() {
    PageLayout(
            title = "Dashboard",
            children = DashBoardApp.create()
    )
}

