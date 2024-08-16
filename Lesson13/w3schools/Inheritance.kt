package Lesson.w3schools

//Superclass

open class MyParentsClass {
    val x = 5
}

//Subclass

class MyChildClass: MyParentsClass() {
    fun myFunction() {
        println(x) //
    }
}

fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
}