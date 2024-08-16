package Lesson12

class Person1 {

//    private var name: String = ""

    var name: String = ""

   /* fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }*/
   /* get() = field
    set(value) {
        field = value
    }

    var age: Int? = null
    var userName: String? = null
    var password: String? = null*/


    constructor()

    /*constructor(name: String?, age: Int?, userName: String?, password: String?) {
        this.name = name
        this.age = age
        this.userName = userName
        this.password = password
    }
*/
}

fun main() {

   /* val personList = arrayOfNulls<Person1>(100)

    personList[0] = Person1("Abdulloh", 19, "Mister", "123")*/

    val person1 = Person1()
//    person1.name = "Muzaffarjon"
/*
    person1.setName("Muzaffarjon")
    println(person1.getName())*/

    person1.name = "Muzaffarjon"
    println(person1.name)
}