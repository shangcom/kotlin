package org.example.companionObject

class Pig {
    companion object{
        var name: String = "None"
        fun printName() {
            println("Pig의 이름은 ${name} 입니다.")
        }
    }
    fun walk() {
        println("pig가 걸어갑니다.")
    }
}