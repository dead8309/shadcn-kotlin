@file:JsModule("@lshay/ui/components/dropdown-menu")
@file:JsNonModule

package org.example.kobwebreaxttailwind.components.react.ui

import org.example.kobwebreaxttailwind.components.react.StandardProps
import react.FC
import react.Props
import react.PropsWithClassName
import react.ReactNode
import web.dom.Element
import web.events.Event
import web.html.HTMLButtonElement
import web.html.HTMLElement
import web.html.HTMLSpanElement
import web.uievents.FocusEvent
import web.uievents.KeyboardEvent
import web.uievents.PointerEvent

external interface DropdownMenuProps: Props {
    var children: ReactNode;
    var dir: String
    var open: Boolean
    var defaultOpen: Boolean
    var onOpenChange: (open: Boolean) -> Unit
    var modal: Boolean
}

@JsName("DropdownMenu")
external val DropdownMenu: FC<DropdownMenuProps>

external interface DropdownMenuTriggerProps: StandardProps<HTMLButtonElement> {
    var asChild: Boolean
}

@JsName("DropdownMenuTrigger")
external val DropdownMenuTrigger: FC<DropdownMenuTriggerProps>

external interface DropdownMenuGroupProps: Props {
    var asChild	: Boolean
}

@JsName("DropdownMenuGroup")
external val DropdownMenuGroup: FC<DropdownMenuGroupProps>

external interface DropdownMenuPortalProps: Props {
    var forceMount: Boolean
    var container: HTMLElement
}

@JsName("DropdownMenuPortal")
external val DropdownMenuPortal: FC<DropdownMenuPortalProps>

external interface DropdownMenuSubProps: Props {
    var defaultOpen	: Boolean
    var open	: Boolean
    var onOpenChange: (open: Boolean) -> Unit
}

@JsName("DropdownMenuSub")
external val DropdownMenuSub: FC<DropdownMenuSubProps>

external interface DropdownMenuRadioGroupProps: Props {
    var asChild	: Boolean
    var value	: Boolean
    var onValueChange: (value: String) -> Unit
}

@JsName("DropdownMenuRadioGroup")
external val DropdownMenuRadioGroup: FC<DropdownMenuRadioGroupProps>

external interface DropdownMenuSubTriggerProps: PropsWithClassName {
    var asChild: Boolean
    var disabled: Boolean
    var textValue: String
    var inset: Boolean
}

@JsName("DropdownMenuSubTrigger")
external val DropdownMenuSubTrigger: FC<DropdownMenuSubTriggerProps>

external interface DropdownMenuSubContentProps: PropsWithClassName {
    var asChild	: Boolean
    var loop	: Boolean
    var onEscapeKeyDown	: (event: KeyboardEvent) -> Unit
    var onPointerDownOutside: (event: PointerEvent ) -> Unit
    var onFocusOutside	: (event: FocusEvent) -> Unit
    var onInteractOutside: (event: FocusEvent) -> Unit
    var forceMount	: Boolean
    var sideOffset	: Number
    var alignOffset	: Number
    var avoidCollisions	: Boolean
    var collisionBoundary	: Array<Element>
    var collisionPadding	: Number
    var arrowPadding	: Number
    var sticky	: String
    var hideWhenDetached	: Boolean
}

@JsName("DropdownMenuSubContent")
external val DropdownMenuSubContent: FC<DropdownMenuSubContentProps>


external interface DropdownMenuContentProps: PropsWithClassName {
    var asChild	: Boolean
    var loop	: Boolean
    var onCloseAutoFocus: (event: Event) -> Unit
    var onEscapeKeyDown	: (event: KeyboardEvent) -> Unit
    var onPointerDownOutside: (event: Event) -> Unit
    var onFocusOutside: (event: FocusEvent) -> Unit
    var onInteractOutside: (event: FocusEvent) -> Unit
    var forceMount	: Boolean
    var side	: String
    var sideOffset	: Number
    var align	: String
    var alignOffset	: Number
    var avoidCollisions	: Boolean
    var collisionBoundary	: List<Element>
    var collisionPadding: Number
    var arrowPadding	: Number
    var sticky	: String
    var hideWhenDetached	: Boolean
}

@JsName("DropdownMenuContent")
external val DropdownMenuContent: FC<DropdownMenuContentProps>

external interface DropdownMenuItemProps: PropsWithClassName {
    var asChild	: Boolean
    var disabled: Boolean
    var onSelect	: (event: Event) -> Unit
    var textValue: String
}

@JsName("DropdownMenuItem")
external val DropdownMenuItem: FC<DropdownMenuItemProps>

external interface DropdownMenuCheckboxItemProps: PropsWithClassName {
    var asChild	: Boolean
    var checked	: Boolean
    var onCheckedChange	: (checked: Boolean) -> Unit
    var disabled	: Boolean
    var onSelect: (event: Event) -> Unit
    var textValue: String
}

@JsName("DropdownMenuCheckboxItem")
external val DropdownMenuCheckboxItem: FC<DropdownMenuCheckboxItemProps>

external interface DropdownMenuRadioItemProps : PropsWithClassName {
    var asChild	: Boolean
    var value	: String
    var disabled	: Boolean
    var onSelect	: (event: Event) -> Unit
    var textValue: String
}

@JsName("DropdownMenuRadioItem")
external val DropdownMenuRadioItem: FC<DropdownMenuRadioItemProps>

external interface DropdownMenuLabelProps: PropsWithClassName {
    var inset: Boolean
    var asChild: Boolean
}

@JsName("DropdownMenuLabel")
external val DropdownMenuLabel: FC<DropdownMenuLabelProps>

external interface DropdownMenuSeparatorProps: PropsWithClassName {
    var asChild: Boolean
}

@JsName("DropdownMenuSeparator")
external val DropdownMenuSeparator: FC<DropdownMenuSeparatorProps>

external interface DropdownMenuShortcutProps : StandardProps<HTMLSpanElement>

@JsName("DropdownMenuShortcut")
external val DropdownMenuShortcut : FC<DropdownMenuShortcutProps>