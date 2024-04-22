package org.example.dataClass

fun main(args: Array<String>) {
    var userData = UserData("Michael", 21)
    println("userData = ${userData}")

//  userData.name = "Sindy" // 변수 선언할 때 val로 해둬서 수정 불가능. 읽기 전용.
    userData.age = 30 // 얘는 var로 해둬서 수정 가능함.

    println("userData = ${userData}")
}
