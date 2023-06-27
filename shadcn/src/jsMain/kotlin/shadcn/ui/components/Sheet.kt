// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/sheet")
@file:JsNonModule

package shadcn.ui.components


import radix_ui.components.*
import react.FC
import web.html.HTMLDivElement


@JsName("Sheet")
external val Sheet: react.FC<DialogProps>

@JsName("SheetTrigger")
external val SheetTrigger: react.FC<DialogTriggerProps>

@JsName("SheetClose")
external val SheetClose: react.FC<DialogCloseProps>

/**
 * @property SheetContent already uses them internally so not exporting them
 *
@JsName("SheetPortal")
external val SheetPortal: react.FC<DialogPortalProps>

@JsName("SheetOverlay")
external val SheetOverlay: react.FC<DialogOverlayProps>
*/

external interface SheetContentProps: DialogContentProps {
    var side: String /* top | bottom | left | right */
}

@JsName("SheetContent")
external val SheetContent: react.FC<SheetContentProps>

@JsName("SheetHeader")
external val SheetHeader: react.FC<react.dom.html.HTMLAttributes<HTMLDivElement>>

@JsName("SheetFooter")
external val SheetFooter: react.FC<react.dom.html.HTMLAttributes<HTMLDivElement>>

@JsName("SheetTitle")
external val SheetTitle: react.FC<DialogTitleProps>

@JsName("SheetDescription")
external val SheetDescription: react.FC<DialogDescriptionProps>