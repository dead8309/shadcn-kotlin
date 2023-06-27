// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-menubar")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components

import web.dom.Element

external interface MenubarProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
var value: String?

var defaultValue: String?

var onValueChange: ((value: Any) -> Unit)?

var loop: dynamic /* RovingFocusGroupProps['loop'] */

var dir: dynamic /* RovingFocusGroupProps['dir'] */
}

external interface MenubarMenuProps: 
react.PropsWithChildren,
react.PropsWithClassName {
var value: String?

override var children: react.ReactNode?
}

external interface MenubarTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {

}

external interface MenubarPortalProps: 
MenuPortalProps,
react.PropsWithClassName {

}

external interface MenubarContentProps: 
MenuContentProps,
react.PropsWithClassName {

}

external interface MenubarGroupProps: 
MenuGroupProps,
react.PropsWithClassName {

}

external interface MenubarLabelProps: 
MenuLabelProps,
react.PropsWithClassName {

}

external interface MenubarItemProps: 
MenuItemProps,
react.PropsWithClassName {

}

external interface MenubarCheckboxItemProps: 
MenuCheckboxItemProps,
react.PropsWithClassName {

}

external interface MenubarRadioGroupProps: 
MenuRadioGroupProps,
react.PropsWithClassName {

}

external interface MenubarRadioItemProps: 
MenuRadioItemProps,
react.PropsWithClassName {

}

external interface MenubarItemIndicatorProps: 
MenuItemIndicatorProps,
react.PropsWithClassName {

}

external interface MenubarSeparatorProps: 
MenuSeparatorProps,
react.PropsWithClassName {

}

external interface MenubarArrowProps: 
MenuArrowProps,
react.PropsWithClassName {

}

external interface MenubarSubProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic
}

external interface MenubarSubTriggerProps: 
MenuSubTriggerProps,
react.PropsWithClassName {

}

external interface MenubarSubContentProps: 
MenuSubContentProps,
react.PropsWithClassName {

}

@JsName("Menubar")
external val Menubar: react.FC<MenubarProps>

@JsName("MenubarTrigger")
external val MenubarTrigger: react.FC<MenubarTriggerProps>

@JsName("MenubarPortal")
external val MenubarPortal: react.FC<MenubarPortalProps>

@JsName("MenubarContent")
external val MenubarContent: react.FC<MenubarContentProps>

@JsName("MenubarGroup")
external val MenubarGroup: react.FC<MenubarGroupProps>

@JsName("MenubarLabel")
external val MenubarLabel: react.FC<MenubarLabelProps>

@JsName("MenubarItem")
external val MenubarItem: react.FC<MenubarItemProps>

@JsName("MenubarCheckboxItem")
external val MenubarCheckboxItem: react.FC<MenubarCheckboxItemProps>

@JsName("MenubarRadioGroup")
external val MenubarRadioGroup: react.FC<MenubarRadioGroupProps>

@JsName("MenubarRadioItem")
external val MenubarRadioItem: react.FC<MenubarRadioItemProps>

@JsName("MenubarItemIndicator")
external val MenubarItemIndicator: react.FC<MenubarItemIndicatorProps>

@JsName("MenubarSeparator")
external val MenubarSeparator: react.FC<MenubarSeparatorProps>

@JsName("MenubarArrow")
external val MenubarArrow: react.FC<MenubarArrowProps>

@JsName("MenubarSub")
external val MenubarSub: react.FC<MenubarSubProps>

@JsName("MenubarSubTrigger")
external val MenubarSubTrigger: react.FC<MenubarSubTriggerProps>

@JsName("MenubarSubContent")
external val MenubarSubContent: react.FC<MenubarSubContentProps>
