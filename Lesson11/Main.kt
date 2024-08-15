fun main(args: Array<String>) {

    /*OOP -> Object - Oriented Programming, "Obyektga yo'naltirilgan dasturlash
    * Obyektga yo'naltirilgan dasturlash:
    * Data encapsulation.
    * Inheritance.
    * Polymorphism*/

    class Car {
        var name = ""
        var color = ""
        fun drive() {
            println("$color $name yurmoqda")
        }
    }

    //Yuqoridagi class dan obyekt olish
    val car = Car()
    car.name = "Matiz"
    car.color = "Sariq"
    car.drive()

    val car1 = Car()
    car1.name = "Spark"
    car1.drive()
}