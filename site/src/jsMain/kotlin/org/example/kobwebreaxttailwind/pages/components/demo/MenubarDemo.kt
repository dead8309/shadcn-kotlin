package org.example.kobwebreaxttailwind.pages.components.demo

import react.FC
import react.Props
import shadcn.ui.components.*

val MenubarDemo = FC<Props> {
    Menubar {
        MenubarMenu {
            MenubarTrigger { +"File" }
            MenubarContent {
                MenubarItem {
                    +"New Tab"
                    MenubarShortcut { +"⌘T" }
                }
                MenubarItem {
                    +"New Window"
                    MenubarShortcut { +"⌘N" }
                }
                MenubarItem {
                    disabled = true
                    +"New Incognito Window"
                }
                MenubarSeparator {}
                MenubarSub {
                    MenubarSubTrigger { +"Share" }
                    MenubarSubContent {
                        MenubarItem {
                            +"Email"
                        }
                        MenubarItem {
                            +"Messages"
                        }
                        MenubarItem {
                            +"Notes"
                        }
                    }
                }
                MenubarSeparator {}
                MenubarItem {
                    +"Print..."
                    MenubarShortcut { +"⌘P" }
                }
            }
        }
        MenubarMenu {
            MenubarTrigger { +"Edit" }
            MenubarContent {
                MenubarItem {
                    +"Undo"
                    MenubarShortcut { +"⌘Z" }
                }
                MenubarItem {
                    +"Redo"
                    MenubarShortcut { +"⇧⌘Z" }
                }
                MenubarSeparator {}
                MenubarSub {
                    MenubarSubTrigger { +"Find" }
                    MenubarSubContent {
                        MenubarItem {
                            +"Search the web"
                        }
                        MenubarSeparator {}
                        MenubarItem {
                            +"Find..."
                        }
                        MenubarItem {
                            +"Find Next"
                        }
                        MenubarItem {
                            +"Find Previous"
                        }
                    }
                }
                MenubarSeparator {}
                MenubarItem {
                    +"Cut"
                }
                MenubarItem {
                    +"Copy"
                }
                MenubarItem {
                    +"Paste"
                }
            }
        }
        MenubarMenu {
            MenubarTrigger { +"View" }
            MenubarContent {
                MenubarCheckboxItem {
                    +"Always Show Bookmarks Bar"
                }
                MenubarCheckboxItem {
                    checked = true
                    +"Always Show Full URLs"
                }
                MenubarSeparator {}
                MenubarItem {
                    inset = true
                    disabled = true
                    +"Reload"
                    MenubarShortcut { +"⌘R" }
                }
                MenubarSeparator {}
                MenubarItem {
                    inset = true
                    +"Toggle Fullscreen"
                }
                MenubarSeparator {}
                MenubarItem {
                    inset = true
                    +"Hide Sidebar"
                }
            }
        }
        MenubarMenu {
            MenubarTrigger { +"Profiles" }
            MenubarContent {
                MenubarRadioGroup {
                    value = "benoit"
                    MenubarRadioItem {
                        value = "andy"
                        +"Andy"
                    }
                    MenubarRadioItem {
                        value = "benoit"
                        +"Benoit"
                    }
                    MenubarRadioItem {
                        value = "luis"
                        +"Luis"
                    }
                }
                MenubarSeparator {}
                MenubarItem {
                    inset = true
                    +"Edit..."
                }
                MenubarSeparator {}
                MenubarItem {
                    inset = true
                    +"Add Profile..."
                }
            }
        }
    }
}