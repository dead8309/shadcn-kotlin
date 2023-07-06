plugins {
    `maven-publish`
    signing
}

publishing {
    afterEvaluate {
        publications {
            withType<MavenPublication> {
                pom {
                    url.set("https://github.com/dead8309/shadcn-kotlin")
                    licenses {
                        license {
                            name.set("MIT License")
                            url.set("https://opensource.org/license/mit/")
                        }
                    }
                    developers {
                        developer {
                            id.set("dead8309")
                            name.set("Vaibhav Raj")
                            email.set("deadyt8309@gmail.com")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/dead8309/shadcn-kotlin.git")
                        developerConnection.set("scm:git:ssh://github.com:dead8309/shadcn-kotlin.git")
                        url.set("https://github.com/dead8309/shadcn-kotlin/tree/main")
                    }
                }
            }

        }
    }
    repositories {
        maven {
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}