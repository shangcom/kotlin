package org.example.상속

open class Parent constructor(val name:String) {
    var hello: String = "안녕하세요"
    var adress:String=""
    var age: Int = 0


    init {
        println("${name}")
    }
   constructor(name:String, adress:String):this(name) {
       println("init 메서드 실행 : ${name}, ${adress}")
   }
   constructor(name:String, adress:String, age:Int):this(name,adress) {
       println("init 메서드 실행 : ${name}, ${age}, ${adress}")
   }

    fun sayHello() {
        println("${hello}")
    }
}