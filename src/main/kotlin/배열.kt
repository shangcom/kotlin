package org.example

fun main() {

    var intArr = IntArray(3)

    println(intArr) // 배열 주소 반환.

    println("${intArr[0]}, ${intArr[1]}, ${intArr[2]}") // 기본값으로 초기화 되어있음을 알 수 있음.

    intArr[0] = 1
    intArr[1] = 2
    intArr[2] = 3

    println("${intArr[0]}, ${intArr[1]}, ${intArr[2]}")


    // 배열 선언과 할당을 한번에
    var intArr2 = arrayOf(3, 4, 5)
    println("${intArr2[0]}, ${intArr2[1]}, ${intArr2[2]}")

    for (v in intArr2) {
        print(v)
        println(v is Int)
    }

    //배열 요소 타입 정한 후 선언과 할당을 한번에
    var intArr3 = intArrayOf(6, 7, 8)

    for (v in intArr3) {
        print(v)
        println(v is Int)
    }


    // step : 건너뛰기
    for (i in 1..10 step 2) {
        println(i)
    }


    for (i in 0..1000) {
        if (i > 999) {
            println(i)
        }
    }

    var result = 1
    while (result < 100) {
        result += result
    }
    println(result)


    // 배열 선언과 할당 동시에
    var strArr = arrayOf("가나", "다라", "마바")

    for (v in strArr) {
        println(v)
    }
}