package org.example.kobwebreaxttailwind.components.react

import react.PropsWithChildren
import react.PropsWithClassName
import react.dom.html.HTMLAttributes
import web.dom.Element

external interface StandardProps<T: Element>: PropsWithClassName, PropsWithChildren, HTMLAttributes<T>