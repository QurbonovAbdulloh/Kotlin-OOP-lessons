package Lesson

import Lesson.Inheritance1.MathTeacher

fun main() {

    val mathTeacher = MathTeacher("Abdulloh")
//    mathTeacher.talk()

    open class Person1() {
        open var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
    }

    class Girl: Person1() {
        override var age: Int = 0
            get() = field
            set(value) {
                field = value - 5
            }
    }

    val girl = Girl()
    girl.age = 31
    println("My fake age is ${girl.age}.")
}

open class Father{

}

class Child : Father() {

}