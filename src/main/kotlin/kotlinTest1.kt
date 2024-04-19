package org.example

// 변수 선언 1. 번수 선언과 동시에 값 넣기
//동적 타입핑. 값 넣으면 알아서 타입 정함.


const val num3 = 3.141592 // 상수.

fun main(){

    println("hi")

    var num1=1

    println(num1)

    num1=5
    println(num1)

    //    num1 = "hello" // num1에 숫자를 넣어 이미 데이터 타입이 정해졌음. 문자열 넣을 수 없음.



    val num2 = 10 //value : 읽기 전용 변수. 변경 불가.
    println(num2)
    //    num2=100 // 이렇게 변경 안됨.





}