package example.shadcn_kotlin.ui.pages.components.demo

import example.shadcn_kotlin.ui.pages.components.demo.utils.format
import lucide_react.CalendarIcon
import react.FC
import react.Props
import react.dom.html.ReactHTML.span
import react.useState
import shadcn.ui.components.*
import web.cssom.ClassName
import kotlin.js.Date

val DatePickerDemo = FC<Props> {
    val (date, setDate) = useState<Date>()

    Popover {
        PopoverTrigger {
            asChild = true
            Button {
                variant = "outline"
                className =
                    ClassName(
                    "w-[280px] justify-start text-left font-normal" + if (date == null) " text-muted-foreground" else "")
                CalendarIcon {
                    className = ClassName("mr-2 h-4 w-4")
                }
                if (date != null)
                    +format(date,"PPP")
                else {
                    span {
                        +"Pick a date"
                    }
                }
            }
        }
        PopoverContent {
            className = ClassName("w-auto p-0" )
            Calendar {
                mode = "single"
                selected=date
                onSelect= setDate
                initialFocus = true
            }
        }
    }
}