package example.shadcn_kotlin.ui.docs.typography

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import web.cssom.ClassName

val TypographyTable = FC<Props> {
   div {
        className = ClassName("my-6 w-full overflow-y-auto")
        table {
            className = ClassName("w-full")
            thead {
                tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    th {
                        className =
                            ClassName("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"King's Treasury"
                    }
                    th {
                        className =
                            ClassName("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"People's happiness"
                    }
                }
            }
            tbody {
                tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Empty"
                    }
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Overflowing"
                    }
                }
                tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Modest"
                    }
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Satisfied"
                    }
                }
                tr {
                    className = ClassName("m-0 border-t p-0 even:bg-muted")
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Full"
                    }
                    td {
                        className =
                            ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
                        +"Ecstatic"
                    }
                }
            }
        }
    }
}