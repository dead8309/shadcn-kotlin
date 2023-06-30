package org.example.kobwebreaxttailwind.components

import react.FC
import react.dom.html.HTMLAttributes
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.section
import web.cssom.ClassName
import web.html.HTMLDivElement
import web.html.HTMLHeadingElement
import web.html.HTMLParagraphElement

external interface PageHeaderProps : HTMLAttributes<HTMLDivElement>

val PageHeader = FC<PageHeaderProps> {
    section {
        className= ClassName("flex max-w-[980px] flex-col items-start gap-2 px-4 pt-8 md:pt-12 ${it.className}")
        +it.children
    }
}
external interface PageHeaderHeadingProps : HTMLAttributes<HTMLHeadingElement>

val PageHeaderHeading = FC<PageHeaderHeadingProps> {
    h1 {
        className= ClassName("text-3xl font-bold leading-tight tracking-tighter md:text-5xl lg:text-6xl lg:leading-[1.1] ${it.className}")
        +it.children
    }
}

external interface PageHeaderDescriptionProps : HTMLAttributes<HTMLParagraphElement>

val PageHeaderDescription = FC<PageHeaderDescriptionProps> {
    p {
        className= ClassName("max-w-[750px] text-lg text-muted-foreground sm:text-xl ${it.className}")
        +it.children
    }
}