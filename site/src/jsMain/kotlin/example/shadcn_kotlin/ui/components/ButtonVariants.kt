package example.shadcn_kotlin.ui.components

import example.shadcn_kotlin.ui.components.ButtonVariants.*
import web.cssom.ClassName

private const val BASE = "inline-flex items-center justify-center rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50"

enum class ButtonVariants {
    default,
    destructive,
    outline,
    secondary,
    ghost,
    link
}
enum class ButtonSize {
    default,sm,lg,icon
}
fun buttonVariants(
        variant: ButtonVariants = default,
        size: ButtonSize = ButtonSize.default,
        extraClassName: String = ""
): ClassName {
    val first = when (variant) {
        default -> "bg-primary text-primary-foreground hover:bg-primary/90"
        destructive -> "bg-destructive text-destructive-foreground hover:bg-destructive/90"
        outline -> "border border-input bg-background hover:bg-accent hover:text-accent-foreground"
        secondary -> "bg-secondary text-secondary-foreground hover:bg-secondary/80"
        ghost -> "hover:bg-accent hover:text-accent-foreground"
        link -> "text-primary underline-offset-4 hover:underline"
    }
    val second = when (size) {
        ButtonSize.default -> "h-10 px-4 py-2"
        ButtonSize.sm -> "h-9 rounded-md px-3"
        ButtonSize.lg -> "h-11 rounded-md px-8"
        ButtonSize.icon -> "h-10 w-10"
    }
    return ClassName("$BASE $first $second $extraClassName")
}