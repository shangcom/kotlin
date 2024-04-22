package org.example.class만들기

fun main() {
    val p1 = Person("John")
    val p2 = Person("John", 30)
    val p3 = Person("John", 30, "New York")
    // init 블럭은 프라이머리 생성자의 본문으로 간주됨.
    // 따라서 secondary 생성자보다 먼저 실행됨.
    // 따라서 init 블럭에는 name만 나오고 secondary constructor에 의해 초기화되는 age와 city는 반영되지 않으며, 기본 초기화 값인 0과 ""(빈문자열)로 출력됨.

    println("p1 = ${p1.name}")
    println("p2 = ${p2.name}, ${p2.age}")
    println("p3 = ${p3.name}, ${p3.age}, ${p3.city}")
}
