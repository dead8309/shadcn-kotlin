package example.shadcn_kotlin.ui.docs.typography

import androidx.compose.runtime.Composable
import example.shadcn_kotlin.ui.components.ComponentPreview
import example.shadcn_kotlin.ui.docs.typography.examples.*
import react.create

object Typography {
    @Composable
    operator fun invoke(code: String) {
        ComponentPreview(
            component = TypographyDemo.create(),
            code = code
        )
    }
    @Composable
    fun H1(code: String) {
        ComponentPreview(
            component = TypographyH1.create(),
            code = code
        )
    }
    @Composable
    fun H2(code: String) {
        ComponentPreview(
            component = TypographyH2.create(),
            code = code
        )
    }
    @Composable
    fun H3(code: String) {
        ComponentPreview(
            component = TypographyH3.create(),
            code = code
        )
    }
    @Composable
    fun H4(code: String) {
        ComponentPreview(
            component = TypographyH4.create(),
            code = code
        )
    }
    @Composable
    fun P(code: String) {
        ComponentPreview(
            component = TypographyP.create(),
            code = code
        )
    }
    @Composable
    fun Blockquote(code: String) {
        ComponentPreview(
            component = TypographyBlockquote.create(),
            code = code
        )
    }
    @Composable
    fun Table(code: String) {
        ComponentPreview(
            component = TypographyTable.create(),
            code = code
        )
    }
    @Composable
    fun List(code: String) {
        ComponentPreview(
            component = TypographyList.create(),
            code = code
        )
    }
    @Composable
    fun InlineCode(code: String) {
        ComponentPreview(
            component = TypographyInlineCode.create(),
            code = code
        )
    }
    @Composable
    fun Lead(code: String) {
        ComponentPreview(
            component = TypographyLead.create(),
            code = code
        )
    }
    @Composable
    fun Large(code: String) {
        ComponentPreview(
            component = TypographyLarge.create(),
            code = code
        )
    }
    @Composable
    fun Small(code: String) {
        ComponentPreview(
            component = TypographySmall.create(),
            code = code
        )
    }
    @Composable
    fun Muted(code: String) {
        ComponentPreview(
            component = TypographyMuted.create(),
            code = code
        )
    }
}
