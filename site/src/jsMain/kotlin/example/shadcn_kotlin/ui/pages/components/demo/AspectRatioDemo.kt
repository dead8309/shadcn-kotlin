package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.dom.html.ReactHTML.img
import shadcn.ui.components.AspectRatio
import web.cssom.ClassName

val AspectRatioDemo = FC<Props> {
    AspectRatio {
        ratio = 16 / 9
        className = ClassName("bg-muted")
        img {
            src = "https://images.unsplash.com/photo-1588345921523-c2dcdb7f1dcd?w=800&dpr=2&q=80"
            alt = "Photo by Drew Beamer"
            className = ClassName("rounded-md object-cover")
        }
    }
}