package oo

import functions.getCurrentDate
import oo.Color.BLUE
import java.math.BigInteger
import java.util.*

/**
 * Created by neome on 26/08/2017.
 */

abstract class Person(open val name: String, open var age: Int) {

    init {
        println("Object was created")
        val bigInt = BigInteger("3")
        val currentDate = getCurrentDate()
        val blue = BLUE
        val date = Date()
    }

    abstract fun speak()

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

    override fun speak() {
        println("Hi there, I'm a student")
    }
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {

    fun receivePayment() {
        println("Received payment.")
    }

    override fun speak() {
        println("Hi there, I'm a employee")
    }
}

fun main(args: Array<String>) {

    val student = Student("John", 25)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()
    employee.receivePayment()
    employee.speak()
}