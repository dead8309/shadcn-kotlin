package example.shadcn_kotlin.ui.pages.components

import example.shadcn_kotlin.ui.pages.components.demo.*
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.div
import web.cssom.ClassName

val demoComponents: List<ComponentCardProps> = listOf(
    ComponentCardProps(
        title = "Card",
        description = "A simple card component",
        href = "card",
        children = CardDemo.create { className = ClassName("w-[80%]") }
    ),
    ComponentCardProps(
        title = "Checkbox",
        description = "A checkbox component",
        href = "checkbox",
        children = CheckboxDemo.create(),
    ),
    ComponentCardProps(
        title = "Tabs",
        description = "A tabs component",
        href = "tabs",
        className = "[&>div]:w-[80%]",
        children = TabsDemo.create(),
    ),
    ComponentCardProps(
        title = "Avatar",
        description = "An avatar component",
        href = "avatar",
        children = div.create {
            className = ClassName("scale-[2]")
            AvatarDemo {}
        }
    ),
    ComponentCardProps(
        title = "Button",
        description = "Some button components",
        href = "button",
        className = "flex-col gap-4 py-14 mix-blend-multiply dark:mix-blend-screen",
        children = ButtonsDemo.create()
    ),
    ComponentCardProps(
        title = "Dropdown",
        description = "A dropdown component",
        href = "dropdown",
        children = DropdownMenuDemo.create(),
    ),
    ComponentCardProps(
        title = "Alert Dialog",
        description = "An alert dialog component",
        href = "alert-dialog",
        children = AlertDialogDemo.create(),
    ),
    ComponentCardProps(
        title = "Accordion",
        description = "An accordion component",
        href = "accordion",
        className = "mx-auto w-[80%] py-10",
        children = AccordionDemo.create(),
    ),
    ComponentCardProps(
        title = "Progress",
        description = "A progress component",
        href = "progress",
        className = "mix-blend-multiply dark:mix-blend-screen",
        children = ProgressDemo.create(),
    ),
    ComponentCardProps(
        title = "Slider",
        description = "A slider component",
        href = "slider",
        className = "mix-blend-multiply dark:mix-blend-screen",
        children = SliderDemo.create { className = ClassName("w-[80%]") },
    ),
    ComponentCardProps(
    title= "Hover Card",
    description= "An hover card component",
    href= "hover-card",
    children= HoverCardDemo.create(),
    ),
    ComponentCardProps(
    title= "Menubar",
    description= "A menubar component",
    href= "menubar",
    children= MenubarDemo.create(),
    ),

    ComponentCardProps(
    title= "Date Picker",
    description= "A date picker component",
    href= "date-picker",
    children= DatePickerDemo.create(),
    ),
    ComponentCardProps(
    title= "Navigation Menu",
    description= "A navigation menu component",
    href= "navigation-menu",
    className= "[&_ul>li:last-child]:hidden",
    children= NavigationMenuDemo.create(),
    ),
    ComponentCardProps(
    title= "Switch",
    description= "A switch component",
    href= "switch",
    children= SwitchDemo.create(),
    ),
    ComponentCardProps(
    title= "Select",
    description= "A select component",
    href= "select",
    children= SelectDemo.create(),
    ),
    ComponentCardProps(
    title= "Separator",
    description= "A separator component",
    href= "separator",
    children= SeparatorDemo.create(),
    ),
    ComponentCardProps(
    title= "Aspect Ratio",
    description= "An aspect ratio component",
    href= "aspect-ratio",
    className= "w-[80%] mx-auto",
    children= AspectRatioDemo.create(),
    ),
    ComponentCardProps(
    title= "Popover",
    description= "A popover component",
    href= "popover",
    children= div.create {
        className = ClassName("scale-150")
        PopoverDemo {}
    }
    ),
    /*
    ComponentCardProps(
    title= "Toast",
    description= "A toast component",
    href= "toast",
    children = ToastDemo.create(),
    ),
    */
    ComponentCardProps(
    title= "Tooltip",
    description= "A tooltip component",
    href= "tooltip",
    children= div.create {
        className = ClassName("scale-150")
        TooltipDemo {}
    }
    ),
    ComponentCardProps(
    title= "Sheet",
    description= "A sheet component",
    href= "sheet",
    children= SheetDemo.create(),
    ),
    ComponentCardProps(
    title= "Command",
    description= "A command component",
    href= "command",
    className= "w-[80%] mx-auto",
    children= CommandDemo.create(),
    ),
    ComponentCardProps(
    title= "Radio",
    description= "A radio component",
    href= "radio",
    className= "[&>span]:h-[80px] [&>span]:w-[200px]",
    children= RadioGroupDemo.create(),
    ),
    ComponentCardProps(
    title= "Context Menu",
    description= "A context menu component",
    href= "context-menu",
    className= "[&>span]:h-[80px] [&>span]:w-[200px]",
    children= ContextMenuDemo.create(),
    ),
    ComponentCardProps(
    title= "Dialog",
    description= "A dialog component",
    href= "dialog",
    children= DialogDemo.create(),
    ),
    ComponentCardProps(
    title= "Badge",
    description= "A badge component",
    href= "badge",
    children= FC<Props> {
        BadgeDemo {}
        BadgeSecondary {}
        BadgeDestructive {}
        BadgeOutline {}
    }.create()
    ),
    ComponentCardProps(
    title= "Skeleton",
    description= "A skeleton component",
    href= "skeleton",
    className= "w-[80%] mx-auto mix-blend-multiply dark:mix-blend-screen",
    children = SkeletonDemo.create(),
    ),
    ComponentCardProps(
    title= "Collapsible",
    description= "A collapsible component",
    href= "collapsible",
    className= "[&>div]:w-[80%]",
    children= CollapsibleDemo.create() ,
    ),
    ComponentCardProps(
    title= "Toggle",
    description= "A toggle component",
    href= "toggle",
    children= div.create {
        className = ClassName("flex space-x-2")
        ToggleDemo {}
        ToggleOutline {}
        ToggleDisabled {}
        ToggleWithText {}
    }
    ),
    ComponentCardProps(
    title= "ScrollArea",
    description= "A scroll area component",
    href= "scrollarea",
    children= ScrollAreaDemo.create()
    )
)
