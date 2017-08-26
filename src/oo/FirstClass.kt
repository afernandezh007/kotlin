package oo

/**
 * Created by neome on 26/08/2017.
 */

class Person(val name: String, var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2017 - age;
    }

    fun getYearOfBirth2() = 2016 - age

}

fun main(args: Array<String>) {
    val person = Person("Jack", 17)


    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)

}