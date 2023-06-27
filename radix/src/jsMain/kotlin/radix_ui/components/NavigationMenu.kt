// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-navigation-menu")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element
import web.events.Event

external interface NavigationMenuProps: 
NavigationMenuProviderProps,
react.PropsWithClassName {
var value: String?

var defaultValue: String?

var onValueChange: ((value: Any) -> Unit)?

var dir: String?

var orientation: String?

/**
 * The duration from when the pointer enters the trigger until the tooltip gets opened.
 * @defaultValue 200
 */
var delayDuration: Number?

/**
 * How much time a user has to enter another trigger without incurring a delay again.
 * @defaultValue 300
 */
var skipDelayDuration: Number?
}

external interface NavigationMenuSubProps: 
NavigationMenuProviderProps,
react.PropsWithClassName {
var value: String?

var defaultValue: String?

var onValueChange: ((value: Any) -> Unit)?

var orientation: String?
}

external interface NavigationMenuProviderPrivateProps: 
react.PropsWithChildren,
react.PropsWithClassName {
var isRootMenu: Boolean

var scope: dynamic

override var children: react.ReactNode?

var orientation: String

var dir: String

var rootNavigationMenu: dynamic

var value: String

var onTriggerEnter: dynamic

var onTriggerLeave: Unit

var onContentEnter: Unit

var onContentLeave: Unit

var onItemSelect: dynamic

var onItemDismiss: Unit
}

external interface NavigationMenuProviderProps: 
NavigationMenuProviderPrivateProps,
react.PropsWithClassName {

}

external interface NavigationMenuListProps: 
react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
react.PropsWithClassName {

}

external interface NavigationMenuItemProps: 
react.dom.html.LiHTMLAttributes<web.html.HTMLLIElement>,
react.PropsWithClassName {
var value: String?
}

external interface NavigationMenuTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface NavigationMenuLinkProps: 
react.dom.html.AnchorHTMLAttributes<web.html.HTMLAnchorElement>,
react.PropsWithClassName {
var active: Boolean?

var onSelect: ((event: Event)->Unit)?
}

external interface NavigationMenuIndicatorProps: 
NavigationMenuIndicatorImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface NavigationMenuIndicatorImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

external interface NavigationMenuContentProps: 
NavigationMenuContentImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface NavigationMenuContentImplPrivateProps: react.PropsWithClassName {
var value: String

var triggerRef: dynamic

var focusProxyRef: dynamic

var wasEscapeCloseRef: dynamic

var onContentFocusOutside: Unit

var onRootContentClose: Unit
}

external interface NavigationMenuContentImplProps: 
DismissableLayerProps,
react.PropsWithClassName {

}

external interface NavigationMenuViewportProps: 
NavigationMenuViewportImplProps,
react.PropsWithClassName {
/**
 * Used to force mounting when more control is needed. Useful when
 * controlling animation with React animation libraries.
 */
var forceMount: Boolean? /* true */
}

external interface NavigationMenuViewportImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {

}

@JsName("NavigationMenu")
external val NavigationMenu: react.FC<NavigationMenuProps>

@JsName("NavigationMenuSub")
external val NavigationMenuSub: react.FC<NavigationMenuSubProps>

@JsName("NavigationMenuList")
external val NavigationMenuList: react.FC<NavigationMenuListProps>

@JsName("NavigationMenuItem")
external val NavigationMenuItem: react.FC<NavigationMenuItemProps>

@JsName("NavigationMenuTrigger")
external val NavigationMenuTrigger: react.FC<NavigationMenuTriggerProps>

@JsName("NavigationMenuLink")
external val NavigationMenuLink: react.FC<NavigationMenuLinkProps>

@JsName("NavigationMenuIndicator")
external val NavigationMenuIndicator: react.FC<NavigationMenuIndicatorProps>

@JsName("NavigationMenuContent")
external val NavigationMenuContent: react.FC<NavigationMenuContentProps>

@JsName("NavigationMenuViewport")
external val NavigationMenuViewport: react.FC<NavigationMenuViewportProps>
