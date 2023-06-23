@file:JsModule("@lshay/ui/components/alert-dialog")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import web.events.Event
import web.html.HTMLButtonElement
import web.html.HTMLDivElement
import web.html.HTMLHeadingElement
import web.html.HTMLParagraphElement
import web.uievents.KeyboardEvent

external interface AlertDialogProps : StandardProps<HTMLButtonElement> {
    var defaultOpen: Boolean
    var open: Boolean
    var onOpenChange: (open: Boolean) -> Unit
}

@JsName("AlertDialog")
external val AlertDialog: FC<AlertDialogProps>

external interface AlertDialogTriggerProps : StandardProps<HTMLButtonElement> {
    var asChild: Boolean
}

@JsName("AlertDialogTrigger")
external val AlertDialogTrigger: FC<AlertDialogTriggerProps>

external interface AlertDialogContentProps: StandardProps<HTMLDivElement> {
    var asChild: Boolean
    var forceMount: Boolean
    var onOpenAutoFocus: (event: Event) -> Unit
    var onCloseAutoFocus: (event: Event) -> Unit
    var onEscapeKeyDown: (event: KeyboardEvent) -> Unit
}

@JsName("AlertDialogContent")
external val AlertDialogContent: FC<AlertDialogContentProps>

external interface AlertDialogHeaderProps: StandardProps<HTMLDivElement> {
    var displayName: String;
}

@JsName("AlertDialogHeader")
external val AlertDialogHeader: FC<AlertDialogHeaderProps>


external interface AlertDialogFooterProps: StandardProps<HTMLDivElement> {
    var displayName: String;
}

@JsName("AlertDialogFooter")
external val AlertDialogFooter: FC<AlertDialogFooterProps>


external interface AlertDialogTitleProps: StandardProps<HTMLHeadingElement> {
    var asChild: Boolean
}

@JsName("AlertDialogTitle")
external val AlertDialogTitle: FC<AlertDialogTitleProps>
external interface AlertDialogDescriptionProps: StandardProps<HTMLParagraphElement> {
    var asChild: Boolean
}

@JsName("AlertDialogDescription")
external val AlertDialogDescription: FC<AlertDialogDescriptionProps>

external interface AlertDialogActionProps: StandardProps<HTMLButtonElement> {
    var asChild: Boolean
}

@JsName("AlertDialogAction")
external val AlertDialogAction: FC<AlertDialogActionProps>
external interface AlertDialogCancelProps: StandardProps<HTMLParagraphElement> {
    var asChild: Boolean
}

@JsName("AlertDialogCancel")
external val AlertDialogCancel: FC<AlertDialogCancelProps>