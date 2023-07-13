package example.shadcn_kotlin.ui.components

import js.core.push
import kotlinx.browser.window
import react.ChildrenBuilder
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import web.cssom.ClassName
import web.dom.document


val Toc = FC<Props> {
    div {
        className = ClassName("space-y-2")
        p {
            className = ClassName("font-medium")
            + "On This Page"
        }
        TableOfContentsTree(getHeadingElements("md"))
    }
}


data class TableOfContents(
    val title: String,
    val url: String,
    val items: Array<TableOfContents>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class.js != other::class.js) return false

        other as TableOfContents

        if (title != other.title) return false
        if (url != other.url) return false
        return items.contentEquals(other.items)
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + url.hashCode()
        result = 31 * result + items.contentHashCode()
        return result
    }
}

/**
 * @param id id of the container whose elements we should query
 * @param shouldGenerateMissingIds tries to generate and set id of heading elements if it's not found
 */
fun getHeadingElements(id: String,shouldGenerateMissingIds: Boolean = true): Array<TableOfContents> {
    val div = document.getElementById(id)!!
    val headings = div.querySelectorAll("h2, h3")
    val hierarchy = emptyArray<TableOfContents>()
    var currentLevel: TableOfContents? = null
    headings.forEach { heading ->
        val level = heading.tagName[1].toString().toInt()
        if (shouldGenerateMissingIds && heading.id.isEmpty()) {
            val newId = heading.innerHTML
                .replace("/[^a-zA-Z0-9 ]/g".toRegex(), "")
                .replace(" ", "-")
                .lowercase()
            heading.id = newId
        }
        val item = TableOfContents(
            title = heading.textContent ?: "",
            url = "#${heading.id}",
            items = emptyArray()
        )
        if (level == 2) {
            hierarchy.push(item)
            currentLevel = item
        } else if (level == 3 && currentLevel != null) {
            currentLevel!!.items.push(item)
        }
    }
    return hierarchy
}

var level = 1
fun ChildrenBuilder.TableOfContentsTree(toc: Array<TableOfContents>) {
    ReactHTML.ul {
        var cn = "m-0 list-none"
        cn += if (level != 1) " pl-4" else ""
        className = ClassName(cn)
        toc.forEachIndexed { i, item ->
            ReactHTML.li {
                key = i.toString()
                className = ClassName("mt-0 pt-2")
                ReactHTML.a {
                    href = item.url
                    var classN = "inline-block no-underline transition-colors hover:text-foreground"
                    classN += if (window.location.hash === item.url)
                        " font-medium text-foreground"
                    else
                        " text-muted-foreground"
                    className = ClassName(classN)
                    +item.title
                }
                if (item.items.isNotEmpty()) {
                    level++
                    TableOfContentsTree(item.items)
                }
            }
        }
    }
}
