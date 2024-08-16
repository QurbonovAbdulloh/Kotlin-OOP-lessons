package Lesson.Inheritance1

open class Person(var name: String) {

    open fun talk() {
        println("$name is talking...")
    }

    fun walk() {
        println("$name is walking...")
    }

    fun eat() {
        println("$name is eating...")
    }
}