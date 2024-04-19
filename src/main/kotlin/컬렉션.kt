package org.example

fun main() {

    var list1 = listOf(5, 3, 4)
    println(list1)
//    list1[0] = 1 수정 불가.
// mutableList는 수정 가능함.

    var list2 = mutableListOf("짜", "짬", "볶", 1, 2, 3)
    println(list2)

    println(list2[0])
    list2[0] = "짜장"

    var list3 = mutableListOf<String>("짜", "짬", "볶") //<String> 하면 String 타입만 넣을 수 있음


    var map= mutableMapOf<String, String>()
    map.put("키1", "값1")
    map.put("키2", "값2")
    map.put("키3", "값3")
    map.remove("키3")
    println("${map.get("키3")}")
}