// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/calendar")
@file:JsNonModule

package shadcn.ui.components

import react.PropsWithClassName
import react.StateSetter
import kotlin.js.Date

external interface CalendarProps: PropsWithClassName {
    var mode: String
    var selected: Date?
    var onSelect: StateSetter<Date?>
    var initialFocus: Boolean
}
@JsName("Calendar")
external val Calendar: react.FC<CalendarProps>