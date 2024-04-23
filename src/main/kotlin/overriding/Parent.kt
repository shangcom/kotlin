package org.example.overriding

open class Parent {
// open 붙여야 클래스 상송 가능하듯, 메서드와 프로퍼티를 오버라이드하려면 메서드에서도 open 붙여야함.

    open var name:String="부모"

    open fun sayHi() {
        println("부모 hi")
    }
}