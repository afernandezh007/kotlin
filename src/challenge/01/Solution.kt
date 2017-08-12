package challenge.`01`

import java.util.*

/**
 * Created by neome on 12/08/2017.
 */

fun main(args: Array<String>) {

    val random = Random().nextInt(50)

    when(random){
        in 1..10 -> println("random $random between 1 and 10")
        in 11..20 -> println("random $random between 11 and 20")
        in 21..30 -> println("random $random between 21 and 30")
        in 31..40 -> println("random $random between 31 and 40")
        else -> println("random $random between 41 and 50")
    }
}