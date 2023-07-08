@file:JsModule("date-fns")
@file:JsNonModule

package example.shadcn_kotlin.ui.pages.components.demo.utils

import kotlin.js.Date

@JsName("format")
external fun format(
    date: Date,
    format: String
): String