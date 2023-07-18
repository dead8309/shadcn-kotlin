package example.shadcn_kotlin.ui.pages.components.demo

import react.FC
import react.Props
import react.useState
import shadcn.ui.components.Calendar
import web.cssom.ClassName
import kotlin.js.Date

val CalendarDemo = FC<Props> {
    val (date, setDate) = useState<Date>()

    Calendar {
        mode="single"
        selected= date
        onSelect= setDate
        className= ClassName("rounded-md border")
    }
}