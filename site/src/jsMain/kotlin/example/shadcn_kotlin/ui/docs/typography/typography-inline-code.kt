package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.code
import web.cssom.ClassName

val TypographyInlineCode = FC<Props> {
    code {
        className= ClassName("relative rounded bg-muted px-[0.3rem] py-[0.2rem] font-mono text-sm font-semibold")
        + "@radix-ui/react-alert-dialog"
    }
}