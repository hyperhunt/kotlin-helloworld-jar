# Hello World on Kotlin

## Main.kt
- In directory `src/main/kotlin` create new Package with name `dev.tony.helloworld`.
- Create new file `Main.kt`.
- Add `@file:JvmName("Main")` and `package dev.tony.helloworld` in `Main.kt`.

## Gradle
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

## Build
- RUN: Gradle Tasks -> application -> run (Shift + F10).
- JAR: Gradle Tasks -> build -> assemble (Build jar file in `/build/libs`).
- Run jar file in terminal: `java -jar helloworld.jar`.

Video guide on Russian [https://youtu.be/HCY4KXw7geM](https://youtu.be/HCY4KXw7geM)