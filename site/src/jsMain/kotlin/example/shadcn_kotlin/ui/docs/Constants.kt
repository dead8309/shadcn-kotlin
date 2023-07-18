package example.shadcn_kotlin.ui.docs

import web.cssom.ClassName

object Constants {
    object TailwindKt {
        const val repo = "https://github.com/dead8309/tailwind-kt"
        const val name = "tailwind-kt"
        val implementation = """
            plugins {
                id("io.github.dead8309.tailwind-kt").version("${'$'}latest_version")
            }
            
            kotlin {
                // Place it below `configAsKobwebApplication()`
                setupTailwindProject()
            }
        """.trimIndent()
    }
    object ShadcnKotlin {
        const val repo = "https://github.com/dead8309/shadcn-kotlin/tree/master/library/shadcn-kotlin"
        const val name = "shadcn-kotlin"
        const val version = "1.0.0"
        const val implementation = "implementation(\"io.github.dead8309:shadcn-kotlin:$version\")"
    }
    object Babel {
        const val name = "babel"
        val implementation = """
            implementation(devNpm("@babel/core","7.22.5"))
            implementation(devNpm("babel-loader","9.1.2"))
            implementation(devNpm("@babel/preset-react","7.22.5"))
            implementation(devNpm("@babel/preset-env","7.22.5"))
            implementation(devNpm("@babel/preset-typescript","7.22.5"))
        """.trimIndent()
    }

    object Configs {
        val tailwindConfigJs = """
            const { fontFamily } = require("tailwindcss/defaultTheme")

            /** @type {import('tailwindcss').Config} */
            module.exports = {
              darkMode: ["class","[data-theme='dark']"],
              content: [
              "**/*.{html,js}",
              "../../node_modules/@lshay/ui/dist/components/**/*.jsx",
              "../../node_modules/@lshay/ui/dist/components/**/*.js",
              ],
              theme: {
                container: {
                  center: true,
                  padding: "2rem",
                  screens: {
                    "2xl": "1400px",
                  },
                },
                extend: {
                  colors: {
                    border: "hsl(var(--border))",
                    input: "hsl(var(--input))",
                    ring: "hsl(var(--ring))",
                    background: "hsl(var(--background))",
                    foreground: "hsl(var(--foreground))",
                    primary: {
                      DEFAULT: "hsl(var(--primary))",
                      foreground: "hsl(var(--primary-foreground))",
                    },
                    secondary: {
                      DEFAULT: "hsl(var(--secondary))",
                      foreground: "hsl(var(--secondary-foreground))",
                    },
                    destructive: {
                      DEFAULT: "hsl(var(--destructive))",
                      foreground: "hsl(var(--destructive-foreground))",
                    },
                    muted: {
                      DEFAULT: "hsl(var(--muted))",
                      foreground: "hsl(var(--muted-foreground))",
                    },
                    accent: {
                      DEFAULT: "hsl(var(--accent))",
                      foreground: "hsl(var(--accent-foreground))",
                    },
                    popover: {
                      DEFAULT: "hsl(var(--popover))",
                      foreground: "hsl(var(--popover-foreground))",
                    },
                    card: {
                      DEFAULT: "hsl(var(--card))",
                      foreground: "hsl(var(--card-foreground))",
                    },
                  },
                  borderRadius: {
                    lg: `var(--radius)`,
                    md: `calc(var(--radius) - 2px)`,
                    sm: "calc(var(--radius) - 4px)",
                  },
                  fontFamily: {
                    sans: ["Inter", ...fontFamily.sans],
                  },
                  keyframes: {
                    "accordion-down": {
                      from: { height: 0 },
                      to: { height: "var(--radix-accordion-content-height)" },
                    },
                    "accordion-up": {
                      from: { height: "var(--radix-accordion-content-height)" },
                      to: { height: 0 },
                    },
                  },
                  animation: {
                    "accordion-down": "accordion-down 0.2s ease-out",
                    "accordion-up": "accordion-up 0.2s ease-out",
                  },
                },
              },
              plugins: [require("tailwindcss-animate")],
            }
        """.trimIndent()

        val css = """
            @import url("https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700;800;900&display=swap");

            @tailwind base;
            @tailwind components;
            @tailwind utilities;

            @layer base {
              :root {
                --background: 0 0% 100%;
                --foreground: 222.2 47.4% 11.2%;

                --muted: 210 40% 96.1%;
                --muted-foreground: 215.4 16.3% 46.9%;

                --popover: 0 0% 100%;
                --popover-foreground: 222.2 47.4% 11.2%;

                --card: 0 0% 100%;
                --card-foreground: 222.2 47.4% 11.2%;

                --border: 214.3 31.8% 91.4%;
                --input: 214.3 31.8% 91.4%;

                --primary: 222.2 47.4% 11.2%;
                --primary-foreground: 210 40% 98%;

                --secondary: 210 40% 96.1%;
                --secondary-foreground: 222.2 47.4% 11.2%;

                --accent: 210 40% 96.1%;
                --accent-foreground: 222.2 47.4% 11.2%;

                --destructive: 0 100% 50%;
                --destructive-foreground: 210 40% 98%;

                --ring: 215 20.2% 65.1%;

                --radius: 0.5rem;
              }
              [data-theme='dark'] {
                --background: 224 71% 4%;
                --foreground: 213 31% 91%;

                --muted: 223 47% 11%;
                --muted-foreground: 215.4 16.3% 56.9%;

                --popover: 224 71% 4%;
                --popover-foreground: 215 20.2% 65.1%;

                --card: 224 71% 4%;
                --card-foreground: 213 31% 91%;

                --border: 216 34% 17%;
                --input: 216 34% 17%;

                --primary: 210 40% 98%;
                --primary-foreground: 222.2 47.4% 1.2%;

                --secondary: 222.2 47.4% 11.2%;
                --secondary-foreground: 210 40% 98%;

                --accent: 216 34% 17%;
                --accent-foreground: 210 40% 98%;

                --destructive: 0 63% 31%;
                --destructive-foreground: 210 40% 98%;

                --ring: 216 34% 17%;

                --radius: 0.5rem;
              }
            }

            @layer base {
              * {
                @apply border-border;
              }
              body {
                @apply bg-background text-foreground;
                font-feature-settings: "rlig" 1, "calt" 1;
              }
            }
        """.trimIndent()
        val babelLoader = """
            config.module.rules.push({
                test: /\.(js|jsx|ts|tsx)${'$'}/,
                use: {
                    loader: 'babel-loader',
                    options: {
                      presets: [
                      '@babel/preset-env',
                      '@babel/preset-react',
                      '@babel/preset-typescript'
                      ]
                    },
                },
            });
        """.trimIndent()
        val pageLayout = """
            @Composable
            fun PageLayout(
                content: @Composable() -> Unit
            ) {
                kotlinext.js.require("./globals.css")
                // rest contents goes here
            } 
        """.trimIndent()
        val themeProvider = """
            @file:JsModule("next-themes")
            @file:JsNonModule
            @file:Suppress("UnusedProperty")

            package example.shadcn_kotlin.ui.theme

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
            external val ThemeProvider: react.FC<ThemeProviderProps>
        """.trimIndent()

        val themeProviderWrappedLayout = """
            @Composable
            fun ReactPageLayout(
                children: ReactNode
            ) {
                kotlinext.js.require("./globals.css")
                val Layout = FC<Props> {
                    ThemeProvider {
                        defaultTheme = "system"
                        enableSystem = true
                        div {
                            +children
                        }
                    }
                }
                LaunchedEffect(Unit) {
                    val root = document.getElementById("root")
                    createRoot(root!!).render(Layout.create())
                }
            }
        """.trimIndent()
    }
    object MDStyles {
        val p = ClassName("leading-7 [&:not(:first-child)]:mt-6")
        val a =  ClassName("font-medium underline underline-offset-4")
        val ul = ClassName("my-6 ml-6 list-disc")
        val ol = ClassName("my-6 ml-6 list-decimal")
        val li = ClassName("mt-2")
        val blockquote = ClassName("mt-6 border-l-2 pl-6 italic")
        val img = ClassName("rounded-md")
        val hr = ClassName("my-4 md:my-8")
        object table {
            operator fun invoke() = ClassName("w-full")
            val parentDiv = ClassName("my-6 w-full overflow-y-auto")
        }
        val tr = ClassName("m-0 border-t p-0 even:bg-muted")
        val th = ClassName("border px-4 py-2 text-left font-bold [&[align=center]]:text-center [&[align=right]]:text-right")
        val td = ClassName("border px-4 py-2 text-left [&[align=center]]:text-center [&[align=right]]:text-right")
        val h1 = ClassName("font-heading mt-2 scroll-m-20 text-4xl font-bold")
        val h2 = ClassName("font-heading mt-12 scroll-m-20 border-b pb-2 text-2xl font-semibold tracking-tight first:mt-0")
        val h3 = ClassName("font-heading mt-8 scroll-m-20 text-xl font-semibold tracking-tight")
        val h4 = ClassName("font-heading mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
        val h5 = ClassName("mt-8 scroll-m-20 text-lg font-semibold tracking-tight")
        val h6 = ClassName("mt-8 scroll-m-20 text-base font-semibold tracking-tight")
        val inline_code = ClassName("bg-muted py-[0.2rem] px-[0.3rem] rounded text-sm")
    }
}
