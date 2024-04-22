package org.example.상속

class Child : Parent("바보") {
    fun myHello() {
        hello = "Hello!"
        sayHello()
    }
}

fun main() {
    val child=Child()
    child.myHello()
}