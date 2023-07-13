package example.shadcn_kotlin.ui.docs.typography.examples

import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.p
import web.cssom.ClassName

val TypographyTable = FC<Props> {
    ReactHTML.div {
        className = ClassName("my-6 w-full overflow-y-auto")
        ReactHTML.table {
            className = ClassName("w-full")
            ReactHTML.thead {
                ReactHTML.tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    ReactHTML.th {
                        className =
                            ClassName("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"King's Treasury"
                    }
                    ReactHTML.th {
                        className =
                            ClassName("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"People's happiness"
                    }
                }
            }
            ReactHTML.tbody {
                ReactHTML.tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Empty"
                    }
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Overflowing"
                    }
                }
                ReactHTML.tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Modest"
                    }
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Satisfied"
                    }
                }
                ReactHTML.tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Full"
                    }
                    ReactHTML.td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Ecstatic"
                    }
                }
            }
        }
    }
}