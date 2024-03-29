﻿# SimpleText

## This package lets you write a Text faster in Jetpack Compose.

1 - Install jitpack in your project in your (settings.gradle.kts)
```gradle
  dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io")  } //add me please
    }
}
```

2 - Add jetpack-compose-simple-text dependency in your build.gradle.app (module app)

```gradle
dependencies {
    implementation ("com.github.eliezerBrasilian:jetpack-compose-simple-text:v1.0.4") //add me  
    //...
}
```

## Example (displaying ellipsis)
```kotlin
//...
import com.simpletext.SimpleText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleTextTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleText( title = "LOrem lorem paulo pedro", maxLength = 10, fontSize = 30, fontWeight = "bold", marginLeft = 10)
                }
            }
        }
    }
}

```
![-2147483648_-210047](https://github.com/eliezerBrasilian/jetpack-compose-simple-text/assets/93846923/a83aabb4-ed69-43b4-8f58-8675b5d5ce8d)

## List of fontWeight argument:
- "100"
- "200"
- "300"
- "400"
- "500"
- "normal"
- "bold"
     

