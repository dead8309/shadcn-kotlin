package org.example.kobwebreaxttailwind.pages.components.demo

import org.example.kobwebreaxttailwind.components.react.ui.*
import react.FC

val AlertDialogDemo = FC<AlertDialogProps> {
    AlertDialog {
        AlertDialogTrigger {
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