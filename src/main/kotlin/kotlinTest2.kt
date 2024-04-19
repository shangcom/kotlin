package org.example


// 변수 선언 2. 값으로 초기화하지 않고 선언만 하고 사용하기
// 정적 타입핑. 변수의 타입을 정해두고 거기에 맞는 값으로 초기화.
fun main() {

    var b1: Byte // 변수 b1을 Byte 타입으로 선언.

    b1 = 127 // 변수 b1을 127으로 초기화.
    b1 = -128
    println(b1)


    var i1: Int

    i1 = 1000
    i1 = -1000
    println(i1)


    var l1: Long

    l1 = 1000000000000000000L
    l1 = -1000000000000000000L
    println(l1)



    var f1: Float

    f1 = 123.456f
    f1 = -123.456f


    var d1:Double

    d1 = 123.456
    d1 = -123.456
}