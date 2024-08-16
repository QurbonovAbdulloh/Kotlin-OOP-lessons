package Lesson12

import java.util.Scanner

class Person(var name: String = "S") {

    fun show(age: Int = 0) {
        println(name)
    }

    init {
        name = "Otabek"
    }
}

fun main() {

    val scanner = Scanner(System.`in`)
//    scanner.next()
    val person = Person("Abdulloh")
//    println(person.name)
    person.show()
}