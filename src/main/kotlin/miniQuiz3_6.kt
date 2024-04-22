package org.example

//p167 예제

//1.
fun add(a: Int, b: Int): Int {
    return a + b
}


//2.
fun sum(a: Int): Int {
    var tot: Int=0
    for (i in 0..a) {
        tot += i
    }
    return tot
}

//3.
fun print(a: String) {
    println(a)
}


fun main() {
    println(add(3, 5))

    println(sum(10))

    print("바보")
}