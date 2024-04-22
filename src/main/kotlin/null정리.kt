package org.example

//fun main() {
//    var num1=null
//    println("num1 = ${num1}")
//    println(num1 is Int)
//
////    var num2:Int=null
//}

fun main(args: Array<String>): Unit {
    var num1 = null
    println("num1 = ${num1}")
    println(num1 is Int)
    println(num1 is Unit)

    var num2: Int? = null
    println("num2 = ${num2}")
    println(num2 is Int)


    var arr1 = ArrayList<Int>(2)
    arr1.add(0)
    arr1.add(1)
    arr1!!.add(100) // !! : 들어가는 값이 null 아니어야 하는 경우.
//    arr1!!.add()
//    arr1!!.add(null)


    println(arr1.get(0))
    println(arr1.get(1))
}