object Styles {
    val p = cn("leading-7 [&:not(:first-child)]:mt-6")
    val a =  cn("font-medium underline underline-offset-4")
    val ul = cn("my-6 ml-6 list-disc")
    val ol = cn("my-6 ml-6 list-decimal")
    val li = cn("mt-2")
    val blockquote = cn("mt-6 border-l-2 pl-6 italic")
    val img = cn("rounded-md")
    val hr = cn("my-4 md:my-8")
    object table {
        operator fun invoke() = cn("w-full")
        val parentDiv = cn("my-6 w-full overflow-y-auto")
    }
    val tr = cn("m-0 border-t p-0 even:bg-muted")
    val th = cn("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
    val td = cn("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
    val inline_code = cn("bg-muted py-[0.2rem] px-[0.3rem] rounded text-sm")
}


fun cn(className: String) = buildString {
    append("classes(")
    append(className.split(" ").joinToString(",") { "\"" + it + "\"" })
    append(")")
}


fun getHeadingClassNameFromLevel(level: Int) = when (level) {
    1 -> cn("font-heading mt-2 scroll-m-20 text-4xl font-bold")
    2 -> cn("font-heading mt-12 scroll-m-20 border-b pb-2 text-2xl font-semibold tracking-tight first:mt-0")
    3 -> cn("font-heading mt-8 scroll-m-20 text-xl font-semibold tracking-tight")
    4 -> cn("font-heading mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
    5 -> cn("mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
    6 -> cn("mt-8 scroll-m-20 text-base font-semibold tracking-tight")
    else  -> ""
}
