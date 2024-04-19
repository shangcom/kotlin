package org.example

fun main() {

    if (true) {
        println("안녕")

    }

    if (false) {
        println("안녕#")
    }

    if (true) {
        println("1")
    } else if (true) {
        println("2")
    } else if (false) {
        println("3")
    }


// in
    println(0 in 0..10) // 0이 범위 안에 있냐?
    println(0 in 1..10)


    //반복
    for (i in 1..10) {
        println(i)
    }
}