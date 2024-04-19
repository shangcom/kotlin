package org.example


//Char, String, Boolean
fun main() {

    var c1: Char

    c1 = 'a'
    println(c1)


    var s1:String

    s1="abcd"
    println(s1)


    var bool1:Boolean

    bool1=true;
    println(bool1)


    var bb:Int? // Int일 수도, null일 수도 있다는 뜻. 여기서 ? 지우면 아래 에러뜸.
    bb=null
    println(bb)


    var str1:String
    str1="hi"+5
    println(str1)

    var age:Int
    age=25

    var name:String
    name="홍길동"
    println(" 제 나이는 ${age}살이고 이름은 ${name} 입니다.")

}