package org.example

fun add(a:Int, b:Int, c:Int):Int {

    var result:Int = a + b + c
    return result
}

fun add2(a:Int, b:Int, c:Int) = a + b + c // 단일표현식 함수


fun main() {
    var res:Int = add(1,2,3)
    println("res = ${res}")

    var res2: Int = add2(4, 5, 6)
    println("res2 = ${res2}")
}