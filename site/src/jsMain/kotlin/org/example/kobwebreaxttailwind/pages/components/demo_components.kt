package org.example.kobwebreaxttailwind.pages.components

import org.example.kobwebreaxttailwind.pages.components.demo.*
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
    )
)

/*
TODO : Provide Wrapper these components

ComponentCardProps(
title= "Slider",
description= "A slider component",
href= "slider",
className= "mix-blend-multiply dark:mix-blend-screen",
children= <SliderDemo className="w-[80%]" />,
),

ComponentCardProps(
title= "Hover Card",
description= "An hover card component",
href= "hover-card",
children= <HoverCardDemo />,
),
,
ComponentCardProps(
title= "Menubar",
description= "A menubar component",
href= "menubar",
children= <MenubarDemo />,
),


ComponentCardProps(
title= "Date Picker",
description= "A date picker component",
href= "date-picker",
children= <DatePickerDemo />,
),
ComponentCardProps(
title= "Accordion",
description= "An accordion component",
href= "accordion",
className= "mx-auto w-[80%] py-10",
children= <AccordionDemo />,
),
ComponentCardProps(
title= "Navigation Menu",
description= "A navigation menu component",
href= "navigation-menu",
className= "[&_ul>li:last-child]:hidden",
children= <NavigationMenuDemo />,
),
ComponentCardProps(
title= "Switch",
description= "A switch component",
href= "switch",
children= <SwitchDemo />,
),
ComponentCardProps(
title= "Select",
description= "A select component",
href= "select",
children= <SelectDemo />,
),
ComponentCardProps(
title= "Separator",
description= "A separator component",
href= "separator",
children= <SeparatorDemo />,
),
ComponentCardProps(
title= "Aspect Ratio",
description= "An aspect ratio component",
href= "aspect-ratio",
className= "w-[80%] mx-auto",
children= <AspectRatioDemo />,
),
ComponentCardProps(
title= "Popover",
description= "A popover component",
href= "popover",
children= (
<div className="scale-150">
<PopoverDemo />
</div>
),
),
ComponentCardProps(
title= "Toast",
description= "A toast component",
href= "toast",
children= <ToastDemo />,
),
ComponentCardProps(
title= "Tooltip",
description= "A tooltip component",
href= "tooltip",
children= (
<div className="scale-150">
<TooltipDemo />
</div>
),
),
ComponentCardProps(
title= "Sheet",
description= "A sheet component",
href= "sheet",
children= <SheetDemo />,
),
ComponentCardProps(
title= "Progress",
description= "A progress component",
href= "progress",
className= "mix-blend-multiply dark:mix-blend-screen",
children= <ProgressDemo />,
),
ComponentCardProps(
title= "Command",
description= "A command component",
href= "command",
className= "w-[80%] mx-auto",
children= <CommandDemo isSinkDemo />,
),
ComponentCardProps(
title= "Radio",
description= "A radio component",
href= "radio",
className= "[&>span]:h-[80px] [&>span]:w-[200px]",
children= <RadioGroupDemo />,
),
ComponentCardProps(
title= "Context Menu",
description= "A context menu component",
href= "context-menu",
className= "[&>span]:h-[80px] [&>span]:w-[200px]",
children= <ContextMenuDemo />,
),

ComponentCardProps(
title= "Dialog",
description= "A dialog component",
href= "dialog",
children= <DialogDemo />,
),
ComponentCardProps(
title= "Badge",
description= "A badge component",
href= "badge",
children= (
<>
<BadgeDemo />
<BadgeSecondary />
<BadgeDestructive />
<BadgeOutline />
</>
),
),
ComponentCardProps(
title= "Skeleton",
description= "A skeleton component",
href= "skeleton",
className= "w-[80%] mx-auto mix-blend-multiply dark:mix-blend-screen",
children= <SkeletonDemo />,
),
ComponentCardProps(
title= "Collapsible",
description= "A collapsible component",
href= "collapsible",
className= "[&>div]:w-[80%]",
children= <CollapsibleDemo />,
),
ComponentCardProps(
title= "Toggle",
description= "A toggle component",
href= "toggle",
children= (
<div className="flex space-x-2">
<ToggleDemo />
<ToggleOutline />
<ToggleDisabled />
<ToggleWithText />
</div>
),*/
