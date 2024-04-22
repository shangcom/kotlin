package org.example.class만들기
class Person constructor(val name: String) {
    var age: Int = 0
    var city: String = ""

    // init 블럭은 프라이머리 생성자의 본문으로 간주됨.
    // 따라서 secondary 생성자보다 먼저 실행됨.
    // 따라서 init 블럭에는 name만 나오고 age와 city는 출력되지 않음.
    init {
        println("init 메서드 실행 : ${name}, ${age}, ${city}")
    }

    // 세컨더리 생성자

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, city: String) : this(name, age) {
        this.city = city
    }
}


