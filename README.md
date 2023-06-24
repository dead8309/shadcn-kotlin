# Kobweb + React + TailwindCSS

This repository serves as a playground for experimenting with React libraries, Tailwind CSS in a Kotlin JS project
using [Kobweb](https://kobweb.varabyte.com/)

## Description

This project created to explore the integration of Kobweb with popular web technologies and libraries. It provides a
platform for testing and experimenting with React Libraries and Tailwind CSS

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Integration with Tailwind CSS](#integration-with-tailwind-css)
- [Integration with React Libraries](#integration-with-react-libraries)
- [Acknowledgement](#acknowledgments)

## Installation

To install and set up the project locally, follow these steps:

> **Warning**
> Kobweb is essential for this project to work. Follow
> this [guide](https://github.com/varabyte/kobweb#install-the-kobweb-binary) if you don't have kobweb setup

1. Clone the repository:

   ```bash
   git clone https://github.com/dead8309/kobweb-react-tailwind.git
   ```

2. Navigate to the project directory:

   ```bash
   cd kobweb-react-tailwind/site
   ```

## Usage

To run the application, execute the following command:

```bash
kobweb run
```

This will build the project and start a local development server. You can access it in your web browser
at `http://localhost:8080`.

## Features

The Repository showcases the following features:

- Integration of Kotlin JS with React components: Explore how Kotlin interacts with React by creating and using React
  components in Kotlin code.
- Tailwind CSS integration: Utilize the power of Tailwind CSS for styling your Kotlin JS components and UI.
- TSX UI libraries in Kotlin: Experiment with popular TSX UI libraries (e.g., [shadcn/ui](https://ui.shadcn.com/))
  within Kotlin JS projects.

## Integration with Tailwind CSS

To integrate Tailwind CSS with Kobweb, the following steps were followed:

1. Add this to `site/build.gradle.kts`:

   ```kotlin
   kotlin {
        sourceSets {
            val jsMain by getting {
                  dependencies {
                     // this library required as it imports our css file in our kotlin file
                     implementation("org.jetbrains.kotlin-wrappers:kotlin-extensions:1.0.1-pre.256-kotlin-1.5.31")
         
                     implementation(devNpm("tailwindcss", "3.3.2")) 
                     implementation(devNpm("postcss", "8.4.8"))
                     implementation(devNpm("autoprefixer", "10.4.2"))
                     implementation(npm("style-loader", "2.0.0"))
                     implementation(npm("css-loader", "5.2.7"))
                     implementation(devNpm("postcss-loader", "4.3.0"))
         
                     // This is a tailwind plugin to be used when configuring shadcn 
                     implementation(npm("tailwindcss-animate","1.0.5"))
                  }
            }
        }
   }

    val jsWorkspace = "${rootProject.buildDir}/js"
    val jsProjectDir = "$jsWorkspace/packages/${rootProject.name}"
    
    val kotlinNodeJsSetup by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask::class)
    val kotlinNpmInstall by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask::class)
    
    val jsProductionExecutableCompileSync by tasks.getting(Task::class)
    
    
    
    val configureTailwind by tasks.registering(Copy::class) {
    description = "Copies the Tailwind configuration file to the build directory"
    
        from("./tailwind.config.js")
        into(jsProjectDir)
    
        dependsOn(kotlinNpmInstall)
    }
    
    val configurePostcss by tasks.registering(Copy::class) {
    description = "Copies the PostCSS configuration file to the build directory"
    
        from("./postcss.config.js")
        into(jsProjectDir)
    
        dependsOn(kotlinNpmInstall)
    }
    
    val jsDevelopmentExecutableCompileSync: Task by tasks.getting {
    dependsOn(
        configureTailwind,
        configurePostcss,
        )
    }
    
    val production by tasks.registering(Exec::class) {
    description = "Compiles the production web demo"
    
        workingDir = file(jsProjectDir)
    
        dependsOn(
            kotlinNodeJsSetup,
            kotlinNpmInstall,
            configureTailwind,
            configurePostcss,
            jsProductionExecutableCompileSync
        )
    }
    
    tasks.getByName("kobwebStart").dependsOn(configureTailwind,configurePostcss)
    tasks.getByName("kobwebExport").dependsOn(configureTailwind,configurePostcss)
    
    tasks.withType(KotlinWebpack::class.java).forEach { t ->
    t.inputs.files(fileTree("src/jsMain/resources"))
   }


   ```

2. Create a Tailwind CSS configuration file inside `site` directory:
   ```javascript
   // site/tailwind.config.js
   
   module.exports = {
    purge: [],
    darkMode: false, // or 'media' or 'class'
    content: ["**/*.{html,js}"] // Most Important 
    theme: {
        extend: {},
    },
    variants: {
        extend: {},
    },
    plugins: [],
   }
   ```

3. Create a Post CSS configuration file inside `site` directory:
   ```javascript
   // site/postcss.config.js
   
   module.exports = {
   plugins: {
      tailwindcss: {},
      autoprefixer: {},
   }
   ```

#### Configure Webpack Loader for PostCSS

* create a directory called `webpack.config.d` inside `site` directory.
* put `postcss-loader.config.js` file inside that folder
   ```javascript
  // postcss-loader.config.js
  
  (() => {
    const cssRule = config.module.rules.find(r => "test.css".match(r.test));
    if (!cssRule) {
        throw new Error("Could not resolve webpack rule matching .css files, did you forget to enable css support?");
    }
    cssRule.use.push({
        loader: "postcss-loader",
        options: {}
    });
  })();
   ```

4. Create a file `globals.css` inside `site/src/jsMain/resources/globals.css`
5. Add this to `globals.css`:
   ```css
   @tailwind base;
   @tailwind components;
   @tailwind utilities;
   ``` 
6. Add this line in our `Page`
   ```kotlin
   @Page
   @Composable
   fun IndexPage() {
        kotlinext.js.require("./globals.css")
        Div({classes("bg-red-700")}){    
            Text("Hello")
        }
   }
   ```
7. All Done👍
 
![img.png](metadata/tailwind_tutorial.png)

## Integration with React Libraries

TODO

## Acknowledgments

Special thanks to excellent people, tools and
resources that make this project possible:

* [Jetbrains](https://github.com/JetBrains) for [Kotlin JS Wrappers](https://github.com/JetBrains/kotlin-wrappers), 
* [facebook](https://github.com/facebook) for [ReactJS](https://github.com/facebook/react)
* [Tailwind Labs](https://github.com/tailwindlabs) for [Tailwind CSS](https://github.com/tailwindlabs/tailwindcss)
* [@verabyte](https://github.com/varabyte/kobweb) for [kobweb](https://github.com/varabyte/kobweb)
* [@nanodeath](https://github.com/nanodeath) for earlier implementation of [tailwind css with KotlinJS](https://github.com/nanodeath/kotlinjs-tailwindcss)
* [@clovis-ai](https://gitlab.com/clovis-ai) for [Updated Gradle Configurations](https://gitlab.com/opensavvy/decouple/-/blob/16bb282309daba3a9b364a53518bc4a6e5f74128/demos/demo-web/build.gradle.kts)
* [@shadcn](https://github.com/shadcn) for [ui](https://github.com/shadcn/ui) components
* [@lukeshay](https://github.com/lukeshay) for [published version](https://github.com/lukeshay/ui) of shadcn library