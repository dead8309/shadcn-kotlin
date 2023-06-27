// Automatically generated - do not modify!

@file:JsModule("@radix-ui/react-accordion")
@file:JsNonModule

@file:Suppress(
"VIRTUAL_MEMBER_HIDDEN",
)

package radix_ui.components


external interface AccordionProps:
AccordionImplProps,
react.PropsWithClassName{
    var type: String /* 'single' | 'multiple' */
}

external interface AccordionImplProps: 
react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
react.PropsWithClassName {
/**
 * The controlled stateful value of the accordion items whose contents are expanded.
 */
var value: Any

/**
 * The value of the items whose contents are expanded when the accordion is initially rendered. Use
 * `defaultValue` if you do not need to control the state of an accordion.
 */
var defaultValue: Any

/**
 * The callback that fires when the state of the accordion changes.
 */
var onValueChange: (value: Any) -> Unit

/**
 * Whether an accordion item can be collapsed after it has been opened.
 * @default false
 */
var collapsible: Boolean?

/**
 * Whether or not an accordion is disabled from user interaction.
 *
 * @defaultValue false
 */
var disabled: Boolean?

/**
 * The layout in which the Accordion operates.
 * @default vertical
 */
var orientation: dynamic /* React.AriaAttributes['aria-orientation'] */

/**
 * The language read direction.
 */
var dir: String?
}

external interface AccordionItemProps: 
CollapsibleProps,
react.PropsWithClassName {
/**
 * Whether or not an accordion item is disabled from user interaction.
 *
 * @defaultValue false
 */
var disabled: Boolean?

/**
 * A string value for the accordion item. All items within an accordion should use a unique value.
 */
var value: String
}

external interface AccordionHeaderProps: 
react.dom.html.HTMLAttributes<web.html.HTMLHeadingElement>,
react.PropsWithClassName {

/**
 * `AccordionHeader` contains the content for the parts of an `AccordionItem` that will be visible
 * whether or not its content is collapsed.
 */
}

external interface AccordionTriggerProps: 
CollapsibleTriggerProps,
react.PropsWithClassName {

/**
 * `AccordionTrigger` is the trigger that toggles the collapsed state of an `AccordionItem`. It
 * should always be nested inside of an `AccordionHeader`.
 */
}

external interface AccordionContentProps: 
CollapsibleContentProps,
react.PropsWithClassName {

/**
 * `AccordionContent` contains the collapsible content for an `AccordionItem`.
 */
}

@JsName("Accordion")
internal external val Accordion: react.FC<dynamic>

@JsName("AccordionItem")
internal external val AccordionItem: react.FC<AccordionItemProps>

@JsName("AccordionHeader")
internal external val AccordionHeader: react.FC<AccordionHeaderProps>

@JsName("AccordionTrigger")
internal external val AccordionTrigger: react.FC<AccordionTriggerProps>

@JsName("AccordionContent")
internal external val AccordionContent: react.FC<AccordionContentProps>
