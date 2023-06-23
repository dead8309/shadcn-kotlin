package org.example.kobwebreaxttailwind.api

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText

@Api
fun hello(ctx: ApiContext) {
    ctx.res.setBodyText("hello world")
}