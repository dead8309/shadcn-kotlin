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
internal external val Menubar: react.FC<MenubarProps>

@JsName("MenubarTrigger")
internal external val MenubarTrigger: react.FC<MenubarTriggerProps>

@JsName("MenubarPortal")
internal external val MenubarPortal: react.FC<MenubarPortalProps>

@JsName("MenubarContent")
internal external val MenubarContent: react.FC<MenubarContentProps>

@JsName("MenubarGroup")
internal external val MenubarGroup: react.FC<MenubarGroupProps>

@JsName("MenubarLabel")
internal external val MenubarLabel: react.FC<MenubarLabelProps>

@JsName("MenubarItem")
internal external val MenubarItem: react.FC<MenubarItemProps>

@JsName("MenubarCheckboxItem")
internal external val MenubarCheckboxItem: react.FC<MenubarCheckboxItemProps>

@JsName("MenubarRadioGroup")
internal external val MenubarRadioGroup: react.FC<MenubarRadioGroupProps>

@JsName("MenubarRadioItem")
internal external val MenubarRadioItem: react.FC<MenubarRadioItemProps>

@JsName("MenubarItemIndicator")
internal external val MenubarItemIndicator: react.FC<MenubarItemIndicatorProps>

@JsName("MenubarSeparator")
internal external val MenubarSeparator: react.FC<MenubarSeparatorProps>

@JsName("MenubarArrow")
internal external val MenubarArrow: react.FC<MenubarArrowProps>

@JsName("MenubarSub")
internal external val MenubarSub: react.FC<MenubarSubProps>

@JsName("MenubarSubTrigger")
internal external val MenubarSubTrigger: react.FC<MenubarSubTriggerProps>

@JsName("MenubarSubContent")
internal external val MenubarSubContent: react.FC<MenubarSubContentProps>
