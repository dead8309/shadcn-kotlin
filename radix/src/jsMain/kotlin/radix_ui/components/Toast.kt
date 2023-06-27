// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-toast")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import js.core.ReadonlyArray
import web.dom.Element

external interface ToastProviderProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

/**
 * An author-localized label for each toast. Used to help screen reader users
 * associate the interruption with a toast.
 * @defaultValue 'Notification'
 */
var label: String?

/**
 * Time in milliseconds that each toast should remain visible for.
 * @defaultValue 5000
 */
var duration: Number?

/**
 * Direction of pointer swipe that should close the toast.
 * @defaultValue 'right'
 */
var swipeDirection: String?

/**
 * Distance in pixels that the swipe must pass before a close is triggered.
 * @defaultValue 50
 */
var swipeThreshold: Number?
}

external interface ToastViewportProps: 
react.dom.html.OlHTMLAttributes<web.html.HTMLOListElement>,
react.PropsWithClassName {
/**
 * The keys to use as the keyboard shortcut that will move focus to the toast viewport.
 * @defaultValue ['F8']
 */
var hotkey: ReadonlyArray<String>?

/**
 * An author-localized label for the toast viewport to provide context for screen reader users
 * when navigating page landmarks. The available `{hotkey}` placeholder will be replaced for you.
 * @defaultValue 'Notifications ({hotkey})'
 */
var label: String?
}

external interface ToastProps: 
ToastImplProps,
react.PropsWithClassName {
var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic

/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface ToastImplProps: 
ToastImplPrivateProps, react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>,
react.PropsWithClassName {
var type: String? /* 'foreground' | 'background' */

/**
 * Time in milliseconds that toast should remain visible for. Overrides value
 * given to `ToastProvider`.
 */
var duration: Number?

var onEscapeKeyDown: dynamic /* DismissableLayerProps['onEscapeKeyDown'] */

var onPause: Unit

var onResume: Unit

var onSwipeStart: dynamic

var onSwipeMove: dynamic

var onSwipeCancel: dynamic

var onSwipeEnd: dynamic
}

external interface ToastTitleProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface ToastDescriptionProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface ToastActionProps: 
ToastCloseProps,
react.PropsWithClassName {
/**
 * A short description for an alternate way to carry out the action. For screen reader users
 * who will not be able to navigate to the button easily/quickly.
 * @example <ToastAction altText="Goto account settings to upgrade">Upgrade</ToastAction>
 * @example <ToastAction altText="Undo (Alt+U)">Undo</ToastAction>
 */
var altText: String
}

external interface ToastCloseProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface ToastImplPrivateProps {
var open: Boolean

var onClose: dynamic
}

@JsName("ToastProvider")
external val ToastProvider: react.FC<ToastProviderProps>

@JsName("ToastViewport")
external val ToastViewport: react.FC<ToastViewportProps>

@JsName("Toast")
external val Toast: react.FC<ToastProps>

@JsName("ToastTitle")
external val ToastTitle: react.FC<ToastTitleProps>

@JsName("ToastDescription")
external val ToastDescription: react.FC<ToastDescriptionProps>

@JsName("ToastAction")
external val ToastAction: react.FC<ToastActionProps>

@JsName("ToastClose")
external val ToastClose: react.FC<ToastCloseProps>
