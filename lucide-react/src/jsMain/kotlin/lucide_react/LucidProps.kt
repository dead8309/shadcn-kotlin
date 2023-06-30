package lucide_react

import react.dom.svg.SVGAttributes
import web.svg.SVGElement

external interface LucideProps : SVGAttributes<SVGElement> {
    var size: String?
    var absoluteStrokeWidth: Boolean
}