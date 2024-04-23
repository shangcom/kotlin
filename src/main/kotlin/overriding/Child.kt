package org.example.overriding

class Child: Parent(){

    override var name:String="자식"
//    var name:String="자식" // 이렇게 하면 오버라이드 붙이라고 에러뜸.

    override fun sayHi() {
        println("자식 hi")
    }
}