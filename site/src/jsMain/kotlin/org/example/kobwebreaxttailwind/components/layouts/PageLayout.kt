package org.example.kobwebreaxttailwind.components.layouts

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.example.kobwebreaxttailwind.components.sections.Footer
import org.example.kobwebreaxttailwind.components.sections.NavHeader

@Composable
fun PageLayout(title: String, content: @Composable () -> Unit) {
    LaunchedEffect(title) {
        document.title = title
    }

    Box(Modifier
        .fillMaxWidth()
        .minHeight(100.percent)
        // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
        // space at the bottom). "min-content" means the use the height of the row, which we use for the footer. "1fr"
        // means give the rest of the space to that row, and "minmax(0, 1fr)" is a CSS trick which essentially means
        // the same thing but can avoid a measurement issue if you end up nesting additional grids inside of it. (See
        // also: https://github.com/w3c/csswg-drafts/issues/1777) Since this box is set to *at least* 100%, the footer
        // will always appear at least on the bottom but can be pushed further down if the first row grows beyond the
        // page.
        .gridTemplateRows("minmax(0, 1fr) min-content")
    ) {
        Column(
            modifier = Modifier.fillMaxSize().textAlign(TextAlign.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            H1 { Text(title) }
            content()
        }
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(Modifier.align(Alignment.Center).gridRowStart(2).gridRowEnd(3))
    }
}