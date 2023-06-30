// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-dialog")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface DialogProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic

var modal: Boolean?
}

external interface DialogTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
    var asChild: Boolean
}

external interface DialogPortalProps: 
PortalProps,
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface DialogOverlayProps: 
DialogOverlayImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface DialogOverlayImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface DialogContentProps: 
DialogContentTypeProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface DialogContentTypeProps: 
DialogContentImplProps,
react.PropsWithClassName {

}

external interface DialogContentImplProps: 
DismissableLayerProps,
react.PropsWithClassName {
/**
 * When `true`, focus cannot escape the `Content` via keyboard,
 * pointer, or a programmatic focus.
 * @defaultValue false
 */
var trapFocus: dynamic /* FocusScopeProps['trapped'] */

/**
 * Event handler called when auto-focusing on open.
 * Can be prevented.
 */
var onOpenAutoFocus: dynamic /* FocusScopeProps['onMountAutoFocus'] */

/**
 * Event handler called when auto-focusing on close.
 * Can be prevented.
 */
var onCloseAutoFocus: dynamic /* FocusScopeProps['onUnmountAutoFocus'] */
}

external interface DialogTitleProps: 
react.dom.html.HTMLAttributes<web.html.HTMLHeadingElement>,
react.PropsWithClassName {

}

external interface DialogDescriptionProps: 
react.dom.html.HTMLAttributes<web.html.HTMLParagraphElement>,
react.PropsWithClassName {

}

external interface DialogCloseProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
    var asChild: Boolean
}

@JsName("Dialog")
internal external val Dialog: react.FC<DialogProps>

@JsName("DialogTrigger")
internal external val DialogTrigger: react.FC<DialogTriggerProps>

@JsName("DialogPortal")
internal external val DialogPortal: react.FC<DialogPortalProps>

@JsName("DialogOverlay")
internal external val DialogOverlay: react.FC<DialogOverlayProps>

@JsName("DialogContent")
internal external val DialogContent: react.FC<DialogContentProps>

@JsName("DialogTitle")
internal external val DialogTitle: react.FC<DialogTitleProps>

@JsName("DialogDescription")
internal external val DialogDescription: react.FC<DialogDescriptionProps>

@JsName("DialogClose")
internal external val DialogClose: react.FC<DialogCloseProps>
