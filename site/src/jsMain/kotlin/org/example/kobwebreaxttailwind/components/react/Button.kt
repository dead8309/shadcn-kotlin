package org.example.kobwebreaxttailwind.components.react

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.dom.Div


private const val base =
    "inline-flex items-center justify-center rounded-md text-sm font-medium transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:opacity-50 disabled:pointer-events-none ring-offset-background"

enum class ButtonVariant(val value: String) {
    DEFAULT("bg-primary text-primary-foreground hover:bg-primary/90"),
    DESTRUCTIVE("bg-destructive text-destructive-foreground hover:bg-destructive/90"),
    OUTLINE("border border-input hover:bg-accent hover:text-accent-foreground"),
    SECONDARY("bg-secondary text-secondary-foreground hover:bg-secondary/80"),
    GHOST("hover:bg-accent hover:text-accent-foreground"),
    LINK("underline-offset-4 hover:underline text-primary"),
}

enum class ButtonSize(val value: String) {
    DEFAULT( "h-10 py-2 px-4"),
    SM( "h-9 px-3 rounded-md"),
    LG( "h-11 px-8 rounded-md"),
}

@Composable
fun Button(
    text: String,
    variant: ButtonVariant = ButtonVariant.DEFAULT,
    size: ButtonSize = ButtonSize.DEFAULT
) {
    val classes = "$base ${variant.value} ${size.value}".split(" ")
    Div({ classes(classes)}) {
        SpanText(text)
    }
}