package oo

/**
 * Created by neome on 26/08/2017.
 */
class House(val height: Double, val color: String, val price: Int =50000) {

    fun print() {
        println("House(height=$height, color='$color', price=$price)")
    }

}

fun main(args: Array<String>) {
    val house = House(height = 4.5, color = "Blue", price = 15000)
    val redHouse = House(height = 4.5, price = 20000,color = "Red")
    val yellowHouse = House(height = 4.5,color = "Yellow")

    house.print()
    redHouse.print()
    yellowHouse.print()
}