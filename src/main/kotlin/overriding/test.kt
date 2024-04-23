package org.example.overriding

fun main() {

    var parent: Parent = Parent();
    var child: Child = Child();

    parent.sayHi()
    child.sayHi()

    println(parent.name)
    println(child.name)

}