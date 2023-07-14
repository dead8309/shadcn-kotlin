package example.shadcn_kotlin.ui.pages.components

import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.section
import react.useState
import shadcn.ui.components.Input
import web.cssom.ClassName
import web.html.InputType

data class ComponentCardProps(
    var title: String,
    var description: String,
    var children: ReactNode,
    var href: String?,
    var className: String? = null
)

external interface ComponentsSinkProps: Props {
    var components: List<ComponentCardProps>
}


val ComponentSink = FC<ComponentsSinkProps> { props ->
    val (query, setQuery) = useState("")

    val filteredComponents = props.components.sortedBy { it.title }.filter {
        it.title.lowercase().contains(query.lowercase()) || it.description.lowercase().contains(query.lowercase())
    }
    div {
        className = ClassName("flex flex-col gap-5 py-10")
        Input {
            type= InputType.text
            placeholder = "Filter components..."
            className = ClassName("w-full px-4 py-2 text-lg border rounded-lg focus:outline-none focus:ring-2 focus:ring-primary")
            value= query
            onChange={ e -> setQuery(e.target.value) }
        }
        div {
            className = ClassName("grid grid-cols-1 gap-4 md:grid-cols-2 2xl:grid-cols-3")
            filteredComponents.forEach {
                div {
                    className=ClassName("flex flex-col transition-transform border rounded-lg bg-secondary text-secondary-foreground")
                    section {
                        className = ClassName("min-h-[200px] flex py-10 mt-auto justify-center items-center ${it.className}")
                        +it.children
                    }
                    div {
                        className = ClassName("w-full p-5 mt-auto transition-opacity bg-white rounded-lg rounded-t-none dark:bg-accent dark:hover:opacity-80 hover:opacity-70")
                        h3 {
                            className = ClassName("mb-3 text-xl font-bold leading-none")
                            +it.title
                        }
                        p {
                            className = ClassName("text-sm text-foreground opacity-60")
                            +it.description
                        }
                    }
                }
            }
        }
    }
}
