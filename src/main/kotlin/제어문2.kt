package org.example

fun main() {

    var score: Int = 90

    when (score) {
        in 91..100 -> {
            println("A")
        }

        in 81..90 -> {
            println("B")
        }

        in 71..80 -> {
            println("C")
        }

        else -> {
            println("F")
        }
    }


    var menu: String = "짜장" // 간짜장, 유린기 각각 넣어보기.
    when (menu) {
        "짜장", "간짜장" -> {
            println("1000원")
        }

        "짬뽕", "백짬뽕" -> {
            println("2000원")
        }

        else -> {
            println("3000원")
        }
    }
}