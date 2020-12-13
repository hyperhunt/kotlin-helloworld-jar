# Hello World on Kotlin

## Main.kt
- In directory `src/main/kotlin` create new Package with name `dev.tony.helloworld`.
- Create new file `Main.kt`.
- Add `@file:JvmName("Main")` and `package dev.tony.helloworld` in `Main.kt`.

## Gradle (build.gradle)
- Add in plugins `id 'application'`.
- Add mainClassName and jar.

```
mainClassName = 'dev.tony.helloworld.Main'

jar {
    manifest {
        attributes 'Main-Class': mainClassName
    }
}
```

## Build and Run
- RUN: Gradle Tasks -> application -> run (Shift + F10).
- JAR: Gradle Tasks -> build -> assemble (Build jar file in `/build/libs`).
- Run jar file in terminal: `java -jar helloworld.jar`.

Video guide on Russian [https://youtu.be/HCY4KXw7geM](https://youtu.be/HCY4KXw7geM)

## JUnit5 in Gradle
JUnit5 User Guide [see Gradle](https://junit.org/junit5/docs/current/user-guide/#running-tests-build-gradle)

Add dependencies:
```
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}
```
To enable it:
```
test {
    useJUnitPlatform()
}
```
Filtering by tags or engines is also supported:
```
test {
    useJUnitPlatform {
        includeTags 'fast', 'smoke & feature-a'
        // excludeTags 'slow', 'ci'
        includeEngines 'junit-jupiter'
        // excludeEngines 'junit-vintage'
    }
}
```