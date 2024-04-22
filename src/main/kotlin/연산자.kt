package org.example

fun main() {
    println(1 == 1)
    println(1 === 1) //두 객체의 참조가 같은 지 비교.

    var ch1: Char = 'a'
    var ch2: String = "a"
    var ch3: String = "a"
//    println(ch1 == ch2)
//    println(ch1 === ch2)
    println(ch1.equals(ch2))
    println(ch2.equals(ch3))

    println(5 xor 7) // 비트연산자. 다른 것만 출력. exclusive or
    println(5.inv()) // 비트 반전. not.

}