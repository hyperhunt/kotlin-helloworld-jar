@file:JvmName("Main")

package dev.tony.helloworld

private fun String.print() {
    println(this)
}

fun main() {
    "Hello Kotlin!".print()
}