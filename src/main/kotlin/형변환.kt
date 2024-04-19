package org.example

fun main() {

    var num: Int = 123

    var str1: String = num.toString()
    println(str1)

    // 타입 체크하는 연산자 is
    println(str1 is String) // str1이 String이면 true, 아니면 false 반환.
    println(str1 !is String) // str1이 String이 아니면 true, 맞으면 false를 반환.


    // 문자열을 숫자로
    var str2: String = "77"
    var str3: String = "abcd"


    try {
        println(str2.toInt())
    } catch (e: Exception) {
        println("안됨")
    }

    try {
        println(str3.toInt())
    } catch (e: Exception) {
        println("안됨")
    }
}