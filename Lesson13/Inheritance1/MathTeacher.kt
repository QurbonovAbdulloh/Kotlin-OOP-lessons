package Lesson.Inheritance1

class MathTeacher(name: String) : Person(name) {

    override fun talk() {
//        super.talk()
        println("My name is: $name")
    }

    fun learn() {

    }
}