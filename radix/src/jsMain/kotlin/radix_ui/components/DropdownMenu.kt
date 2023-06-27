// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-dropdown-menu")
@file:JsNonModule

package radix_ui.components

external interface DropdownMenuProps:
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var dir: String?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic

var modal: Boolean?
}

external interface DropdownMenuTriggerProps: 
react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
react.PropsWithClassName {
    var asChild: Boolean?
}

external interface DropdownMenuPortalProps: 
MenuPortalProps,
react.PropsWithClassName {

}

external interface DropdownMenuContentProps: 
MenuContentProps,
react.PropsWithClassName {
    var align: String
}

external interface DropdownMenuGroupProps: 
MenuGroupProps,
react.PropsWithClassName {

}

external interface DropdownMenuLabelProps: 
MenuLabelProps,
react.PropsWithClassName {

}

external interface DropdownMenuItemProps: 
MenuItemProps,
react.PropsWithClassName {

}

external interface DropdownMenuCheckboxItemProps: 
MenuCheckboxItemProps,
react.PropsWithClassName {

}

external interface DropdownMenuRadioGroupProps: 
MenuRadioGroupProps,
react.PropsWithClassName {

}

external interface DropdownMenuRadioItemProps: 
MenuRadioItemProps,
react.PropsWithClassName {

}

external interface DropdownMenuItemIndicatorProps: 
MenuItemIndicatorProps,
react.PropsWithClassName {

}

external interface DropdownMenuSeparatorProps: 
MenuSeparatorProps,
react.PropsWithClassName {

}

external interface DropdownMenuArrowProps: 
MenuArrowProps,
react.PropsWithClassName {

}

external interface DropdownMenuSubProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic
}

external interface DropdownMenuSubTriggerProps: 
MenuSubTriggerProps,
react.PropsWithClassName {

}

external interface DropdownMenuSubContentProps: 
MenuSubContentProps,
react.PropsWithClassName {

}

@JsName("DropdownMenu")
external val DropdownMenu: react.FC<DropdownMenuProps>

@JsName("DropdownMenuTrigger")
external val DropdownMenuTrigger: react.FC<DropdownMenuTriggerProps>

@JsName("DropdownMenuPortal")
external val DropdownMenuPortal: react.FC<DropdownMenuPortalProps>

@JsName("DropdownMenuContent")
external val DropdownMenuContent: react.FC<DropdownMenuContentProps>

@JsName("DropdownMenuGroup")
external val DropdownMenuGroup: react.FC<DropdownMenuGroupProps>

@JsName("DropdownMenuLabel")
external val DropdownMenuLabel: react.FC<DropdownMenuLabelProps>

@JsName("DropdownMenuItem")
external val DropdownMenuItem: react.FC<DropdownMenuItemProps>

@JsName("DropdownMenuCheckboxItem")
external val DropdownMenuCheckboxItem: react.FC<DropdownMenuCheckboxItemProps>

@JsName("DropdownMenuRadioGroup")
external val DropdownMenuRadioGroup: react.FC<DropdownMenuRadioGroupProps>

@JsName("DropdownMenuRadioItem")
external val DropdownMenuRadioItem: react.FC<DropdownMenuRadioItemProps>

@JsName("DropdownMenuItemIndicator")
external val DropdownMenuItemIndicator: react.FC<DropdownMenuItemIndicatorProps>

@JsName("DropdownMenuSeparator")
external val DropdownMenuSeparator: react.FC<DropdownMenuSeparatorProps>

@JsName("DropdownMenuArrow")
external val DropdownMenuArrow: react.FC<DropdownMenuArrowProps>

@JsName("DropdownMenuSub")
external val DropdownMenuSub: react.FC<DropdownMenuSubProps>

@JsName("DropdownMenuSubTrigger")
external val DropdownMenuSubTrigger: react.FC<DropdownMenuSubTriggerProps>

@JsName("DropdownMenuSubContent")
external val DropdownMenuSubContent: react.FC<DropdownMenuSubContentProps>
