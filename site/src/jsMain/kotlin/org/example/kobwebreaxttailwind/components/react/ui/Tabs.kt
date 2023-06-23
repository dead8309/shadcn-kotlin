@file:JsModule("@lshay/ui/components/tabs")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.html.HTMLDivElement

external interface TabProps: StandardProps<HTMLDivElement> {
    var asChild: Boolean
    override var defaultValue: Any?
    var value: String
    var onValueChange: (value: String) -> Unit
    var orientation: String
    override var dir: String?
    var activationMode: String
}

@JsName("Tabs")
external val Tabs: FC<TabProps>


external interface TabsListProps: StandardProps<HTMLDivElement> {
    var asChild: Boolean
    var loop: Boolean
}

@JsName("TabsList")
external val TabsList: FC<TabsListProps>

external interface TabsTriggerProps: StandardProps<HTMLDivElement> {
    var asChild: Boolean
    var value: String
    var disabled: Boolean
}

@JsName("TabsTrigger")
external val TabsTrigger: FC<TabsTriggerProps>

external interface TabsContentProps: StandardProps<HTMLDivElement> {
    var asChild: Boolean
    var value: String
    var forceMount: Boolean
}

@JsName("TabsContent")
external val TabsContent: FC<TabsContentProps>

