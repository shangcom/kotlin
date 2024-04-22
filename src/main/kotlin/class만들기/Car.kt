package org.example.class만들기


//constructor() : primary 생성자. 생성자에 접근제한자나 다른 옵션이 없으면 생략 가능.
class Car constructor(val value:String){
    // 필드
    var color: String = "white"
    var engine: Boolean = false
    var wheels: Int = 4


    // 클래스 생성자가 호출되면 init 블록의 코드가 실행되고, init 블록에서는 생성자를 통해 넘어온 파라미터에 접근할 수 있음.
    init {
        println("생성자로부터 넘어온 문자열 : ${value}")
    }

    // secondary 생성자


    //메서드
    fun start() {
        !engine
    }


}


