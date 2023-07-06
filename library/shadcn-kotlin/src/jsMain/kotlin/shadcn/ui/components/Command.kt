// Automatically generated - do not modify!

@file:JsModule("@lshay/ui/components/command")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN"
)
package shadcn.ui.components

import radix_ui.components.DialogProps
import react.FC
import react.Props
import react.PropsWithClassName
import react.dom.html.HTMLAttributes
import react.dom.html.InputHTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLInputElement

external interface CommandDialogProps: DialogProps

external interface CommandInputProps: InputHTMLAttributes<HTMLInputElement> {
    var value: String?
    var onValueChange: (value: Any) -> Unit
}

external interface CommandListProps: PropsWithClassName {
    var children: react.ReactNode
}

external interface CommandEmptyProps: PropsWithClassName {
    var children: react.ReactNode
}

external interface CommandGroupProps: HTMLAttributes<HTMLDivElement> {
    var children: react.ReactNode
    var heading: react.ReactNode;
    var value: Any
}

external interface CommandSeparatorProps: HTMLAttributes<HTMLDivElement> {
    var alwaysRender: Boolean
}
external interface CommandItemProps: HTMLAttributes<HTMLDivElement> {
    var disabled: Boolean?;
    var onSelect: dynamic
}

external interface CommandShortcutProps: Props


@JsName("Command")
external val Command: react.FC<PropsWithClassName>

@JsName("CommandDialog")
external val CommandDialog: FC<CommandDialogProps>

@JsName("CommandInput")
external val CommandInput: react.FC<CommandInputProps>

@JsName("CommandList")
external val CommandList: react.FC<CommandListProps>

@JsName("CommandEmpty")
external val CommandEmpty: react.FC<CommandEmptyProps>

@JsName("CommandGroup")
external val CommandGroup: react.FC<CommandGroupProps>

@JsName("CommandSeparator")
external val CommandSeparator: react.FC<CommandSeparatorProps>

@JsName("CommandItem")
external val CommandItem: react.FC<CommandItemProps>

@JsName("CommandShortcut")
external val CommandShortcut: react.FC<CommandShortcutProps>
