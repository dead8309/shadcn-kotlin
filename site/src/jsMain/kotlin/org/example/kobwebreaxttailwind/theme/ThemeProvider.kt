@file:JsModule("next-themes")
@file:JsNonModule

package org.example.kobwebreaxttailwind.theme

import react.Props

external interface UseThemeProps {
    operator fun component1(): (theme: String) -> Unit

    var themes: Array<String>
    var forcedTheme: String?
    var setTheme: (theme: String) -> Unit
    var theme: String?
    var resolvedTheme: String?
    var systemTheme: String? /* 'dark' | 'light' */
}
external interface ThemeProviderProps: Props {
    var themes: Array<String>
    var forcedTheme: String?
    var enableSystem: Boolean?
    var disableTransitionOnChange: Boolean?
    var enableColorScheme: Boolean?
    var storageKey: String
    var defaultTheme: String?
    var attribute: String?
    var value: Any?
    var nonce: String?
    var children: react.ReactNode?
}

@JsName("useTheme")
external val useTheme: () -> UseThemeProps

@JsName("ThemeProvider")
external val ThemeProvider: react.FC<ThemeProviderProps>;