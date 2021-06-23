# KMMLib

Just a simple showcase how to *publish a kotlin multiplatform mobile library* to github packages.multiplatform

## usage
to use the package inside your application, just add the github owner and repository to your repository list.multiplatform

> Add the credentials section if the repository isn't public

```kotlin
allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            name = "Github Packages"
            url = uri("https://maven.pkg.github.com/thebino/MySharedLib")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }
}
```

