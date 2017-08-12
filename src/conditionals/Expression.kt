package conditionals

/**
 * Created by neome on 12/08/2017.
 */

fun main(args: Array<String>) {
    val x = 10

    when(x){
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "hey there".length -> println("x is the length of the string 'hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        !in 1..9 -> println("x is not between 1 and 9")
    }
}