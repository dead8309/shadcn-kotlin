package org.example.kobwebreaxttailwind.pages.components.demo

import radix_ui.components.AlertDialogProps
import react.FC
import shadcn.ui.components.*

val AlertDialogDemo = FC<AlertDialogProps> {
    AlertDialog {
        AlertDialogTrigger {
            asChild = true
            Button {
                variant ="outline"
                +"Show Dialog"
            }
        }
        AlertDialogContent {
            AlertDialogHeader {
                AlertDialogTitle {
                    +"Are you absolutely sure?"
                }
                AlertDialogDescription {
                    +"This action cannot be undone. This will permanently delete your "
                    +"account and remove your data from our servers."
                }
            }
            AlertDialogFooter {
                AlertDialogCancel {
                    +"Cancel"
                }
                AlertDialogAction {
                    +"Continue"
                }
            }
        }
    }
}