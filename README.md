# KMMLib

Just a simple showcase how to *publish a kotlin multiplatform mobile library* to github packages.multiplatform

## usage
To use the package inside your application, just add the github repository to your repository list.

> Add the credentials section if the repository isn't public

```kotlin
allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            name = "Github Packages"
            url = uri("https://maven.pkg.github.com/thebino/KMMLib")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }
}

dependencies {
    implementation("com.example.mysharedlib:shared:0.1.1")
}
```
