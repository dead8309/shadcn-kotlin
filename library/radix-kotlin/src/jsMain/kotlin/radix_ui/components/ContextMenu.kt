// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-context-menu")
@file:JsNonModule

package radix_ui.components

import web.dom.Element

external interface ContextMenuProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var onOpenChange: dynamic

var dir: String?

var modal: Boolean?
}

external interface ContextMenuTriggerProps: 
react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
react.PropsWithClassName {
var disabled: Boolean?
}

external interface ContextMenuPortalProps: 
MenuPortalProps,
react.PropsWithClassName {

}

external interface ContextMenuContentProps: 
MenuContentProps,
react.PropsWithClassName {

}

external interface ContextMenuGroupProps: 
MenuGroupProps,
react.PropsWithClassName {

}

external interface ContextMenuLabelProps: 
MenuLabelProps,
react.PropsWithClassName {

}

external interface ContextMenuItemProps: 
MenuItemProps,
react.PropsWithClassName {

}

external interface ContextMenuCheckboxItemProps: 
MenuCheckboxItemProps,
react.PropsWithClassName {

}

external interface ContextMenuRadioGroupProps: 
MenuRadioGroupProps,
react.PropsWithClassName {

}

external interface ContextMenuRadioItemProps: 
MenuRadioItemProps,
react.PropsWithClassName {

}

external interface ContextMenuItemIndicatorProps: 
MenuItemIndicatorProps,
react.PropsWithClassName {

}

external interface ContextMenuSeparatorProps: 
MenuSeparatorProps,
react.PropsWithClassName {

}

external interface ContextMenuArrowProps: 
MenuArrowProps,
react.PropsWithClassName {

}

external interface ContextMenuSubProps: 
react.PropsWithChildren,
react.PropsWithClassName {
override var children: react.ReactNode?

var open: Boolean?

var defaultOpen: Boolean?

var onOpenChange: dynamic
}

external interface ContextMenuSubTriggerProps: 
MenuSubTriggerProps,
react.PropsWithClassName {

}

external interface ContextMenuSubContentProps: 
MenuSubContentProps,
react.PropsWithClassName {

}

@JsName("ContextMenu")
internal external val ContextMenu: react.FC<ContextMenuProps>

@JsName("ContextMenuTrigger")
internal external val ContextMenuTrigger: react.FC<ContextMenuTriggerProps>

@JsName("ContextMenuPortal")
internal external val ContextMenuPortal: react.FC<ContextMenuPortalProps>

@JsName("ContextMenuContent")
internal external val ContextMenuContent: react.FC<ContextMenuContentProps>

@JsName("ContextMenuGroup")
internal external val ContextMenuGroup: react.FC<ContextMenuGroupProps>

@JsName("ContextMenuLabel")
internal external val ContextMenuLabel: react.FC<ContextMenuLabelProps>

@JsName("ContextMenuItem")
internal external val ContextMenuItem: react.FC<ContextMenuItemProps>

@JsName("ContextMenuCheckboxItem")
internal external val ContextMenuCheckboxItem: react.FC<ContextMenuCheckboxItemProps>

@JsName("ContextMenuRadioGroup")
internal external val ContextMenuRadioGroup: react.FC<ContextMenuRadioGroupProps>

@JsName("ContextMenuRadioItem")
internal external val ContextMenuRadioItem: react.FC<ContextMenuRadioItemProps>

@JsName("ContextMenuItemIndicator")
internal external val ContextMenuItemIndicator: react.FC<ContextMenuItemIndicatorProps>

@JsName("ContextMenuSeparator")
internal external val ContextMenuSeparator: react.FC<ContextMenuSeparatorProps>

@JsName("ContextMenuArrow")
internal external val ContextMenuArrow: react.FC<ContextMenuArrowProps>

@JsName("ContextMenuSub")
internal external val ContextMenuSub: react.FC<ContextMenuSubProps>

@JsName("ContextMenuSubTrigger")
internal external val ContextMenuSubTrigger: react.FC<ContextMenuSubTriggerProps>

@JsName("ContextMenuSubContent")
internal external val ContextMenuSubContent: react.FC<ContextMenuSubContentProps>
