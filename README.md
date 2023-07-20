<p align="center">
 <img align="center" src="./metadata/kotlin1.svg" height="96" />
 <h1 align="center">
  shadcn-kotlin
 </h1>
</p>

[shadcn-kotlin](https://shadcn-kotlin.vercel.app) is an unofficial port of [shadcn/ui](https://ui.shadcn.com/) made using [Kobweb](https://kobweb.varabyte.com/)

> **Note** <br> **This project is not affiliated with shadcn, but inspired by him** <br> This project is created in need for ui library for the KotlinJs community.

Accessible and customizable components' library. Free. Open Source.

![cover](./metadata/cover.png)

## Documentation

Visit https://shadcn-kotlin.vercel.app/docs to view the documentation.

## Run Locally

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

3. To run the application, execute the following command:

```bash
kobweb run
```

This will build the project and start a local development server. You can access it in your web browser
at `http://localhost:8080`.


## Integration with Tailwind CSS
Using [tailwind-kt](https://github.con/dead8309/tailwind-kt) gradle plugin which does everything.

You can read the manual configuration [here](./tailwind-integration.md) which has been used before.


## License

Licensed under the [MIT license](./LICENSE).


## Acknowledgments

Special thanks to excellent people, tools and resources that make this project possible:

* [Jetbrains](https://github.com/JetBrains) for [Kotlin JS Wrappers](https://github.com/JetBrains/kotlin-wrappers), 
* [facebook](https://github.com/facebook) for [ReactJS](https://github.com/facebook/react)
* [Tailwind Labs](https://github.com/tailwindlabs) for [Tailwind CSS](https://github.com/tailwindlabs/tailwindcss)
* [@verabyte](https://github.com/varabyte/kobweb) for [kobweb](https://github.com/varabyte/kobweb)
* [@nanodeath](https://github.com/nanodeath) for earlier implementation of [tailwind css with KotlinJS](https://github.com/nanodeath/kotlinjs-tailwindcss)
* [@clovis-ai](https://gitlab.com/clovis-ai) for [Updated Gradle Configurations](https://gitlab.com/opensavvy/decouple/-/blob/16bb282309daba3a9b364a53518bc4a6e5f74128/demos/demo-web/build.gradle.kts)
* [@shadcn](https://github.com/shadcn) for [ui](https://github.com/shadcn/ui) components
* [@lukeshay](https://github.com/lukeshay) for [published version](https://github.com/lukeshay/ui) of shadcn library