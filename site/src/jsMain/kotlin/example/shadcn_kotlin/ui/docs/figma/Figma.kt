package example.shadcn_kotlin.ui.docs.figma

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.hooks.useReactEffect
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.iframe
import web.cssom.ClassName

@Composable
fun Figma() {
    useReactEffect {
        div {
            this.className = ClassName("h-[339px] w-full mt-4")
            iframe {
                src="https://embed.figma.com/file/1203061493325953101/hf_embed?community_viewer=true&embed_host=shadcn&hub_file_id=1203061493325953101&kind=&viewer=1"
                className = ClassName("h-full w-full overflow-hidden rounded-lg border bg-muted")
            }
        }
    }
}