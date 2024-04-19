package org.example

fun main() {

    var a = 5
    var b = 8

    var bigger = if (a > b) {
        println("hi")
        a
    } else {
        println("hi#")
        b
    }

    println(bigger)


    var bigger2 = if (a > b) a else b
    println(bigger2)

}