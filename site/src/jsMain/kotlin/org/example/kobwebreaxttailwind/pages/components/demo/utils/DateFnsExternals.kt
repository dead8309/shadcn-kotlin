@file:JsModule("date-fns")
@file:JsNonModule

package org.example.kobwebreaxttailwind.pages.components.demo.utils

import kotlin.js.Date

@JsName("format")
external fun format(
    date: Date,
    format: String
): String