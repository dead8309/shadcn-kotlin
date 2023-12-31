# radix-kotlin

![Maven Central](https://img.shields.io/maven-central/v/io.github.dead8309/radix-kotlin?style=flat-square&color=5b5ef7)

Kotlin wrapper for [Radix Ui](https://www.radix-ui.com/).

### Internals

Declarations in [src/jsMain/kotlin/radix_ui.components](./src/jsMain/kotlin/radix_ui/components) are generated by me using custom fork based on [mui-kotlin](https://github.com/karakum-team/mui-kotlin). Manual changes are prohibited.</br>



## Installation

1\. Add the `mavenCentral()` to your top-level

`build.gradle`:

```groovy
repositories {
    mavenCentral()
}
```

2\. Apply the plugin to your project.

![Maven Central](https://img.shields.io/maven-central/v/io.github.dead8309/radix-kotlin?style=flat-square&color=5b5ef7)

```groovy
// build.gradle.kts
dependencies {
    implementation("io.github.dead8309:radix-kotlin:$latest_version")
}
```