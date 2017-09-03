package oo

/**
 * Created by neome on c03/09/2017.
 */
abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotlin", 999.99), Learnable {
    override final fun learn() {
        super<Learnable>.learn()
        println("I'm one of the first people to learn Kotlin!")
    }
}


fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}