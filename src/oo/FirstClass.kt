package oo

/**
 * Created by neome on 26/08/2017.
 */

open class Person(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("hello $name!")
    }

    /*fun getYearOfBirth(): Int {
        return 2017 - age;
    }*/

    fun getYearOfBirth() = 2016 - age

}

class Student(override val name: String, override var age: Int) : Person(name, age) {

    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {

    fun receivePayment() {
        println("Received payment.")
    }
}

fun main(args: Array<String>) {

    val student = Student("John", 25)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()
    employee.receivePayment()
}