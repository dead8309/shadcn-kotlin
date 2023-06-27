package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.Accordion
import shadcn.ui.components.AccordionContent
import shadcn.ui.components.AccordionItem
import shadcn.ui.components.AccordionTrigger
import web.cssom.ClassName

val AccordionDemo = FC<Props> {
    Accordion {
        type = "single"
        collapsible = true
        className = ClassName("w-full")
        AccordionItem {
            value ="item-1"
            AccordionTrigger {
                +"Is it accessible?"
            }
            AccordionContent {
                +"Yes. It adheres to the WAI-ARIA design pattern."
            }
        }
        AccordionItem {
            value ="item-2"
            AccordionTrigger {
                +"Is it styled?"
            }
            AccordionContent {
                +" Yes. It comes with default styles that matches the other components aesthetic."
            }
        }
        AccordionItem {
            value ="item-3"
            AccordionTrigger {
                +"Is it animated?"
            }
            AccordionContent {
                +"Yes. It's animated by default, but you can disable it if you prefer."
            }
        }
    }
}
