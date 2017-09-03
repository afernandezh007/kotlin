package oo

/**
 * Created by neome on c03/09/2017.
 */

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String) : Driveable, Buildable {
    override val timeRequired: Int = 120

    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Build a sinhy car")
    }
}

class MotorCycle(val color: String) : Driveable {

    override fun drive() {
        println("Driving motorcycle...")
    }
}


fun main(args: Array<String>) {

    val car: Driveable = Car("blue")
    car.drive()
    val motorCycle: Driveable = MotorCycle("red")
    motorCycle.drive()
}