// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/alert-dialog")
@file:JsNonModule

package shadcn.ui.components


import radix_ui.components.*
import react.FC
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement


external interface AlertDialogHeaderProps: HTMLAttributes<HTMLDivElement> {
    var displayName: String;
}
external interface AlertDialogFooterProps: HTMLAttributes<HTMLDivElement> {
    var displayName: String;
}

@JsName("AlertDialog")
external val AlertDialog: react.FC<AlertDialogProps>

@JsName("AlertDialogTrigger")
external val AlertDialogTrigger: react.FC<AlertDialogTriggerProps>

@JsName("AlertDialogHeader")
external val AlertDialogHeader: FC<AlertDialogHeaderProps>

@JsName("AlertDialogFooter")
external val AlertDialogFooter: FC<AlertDialogFooterProps>

@JsName("AlertDialogContent")
external val AlertDialogContent: react.FC<AlertDialogContentProps>

@JsName("AlertDialogTitle")
external val AlertDialogTitle: react.FC<AlertDialogTitleProps>

@JsName("AlertDialogDescription")
external val AlertDialogDescription: react.FC<AlertDialogDescriptionProps>

@JsName("AlertDialogAction")
external val AlertDialogAction: react.FC<AlertDialogActionProps>

@JsName("AlertDialogCancel")
external val AlertDialogCancel: react.FC<AlertDialogCancelProps>
