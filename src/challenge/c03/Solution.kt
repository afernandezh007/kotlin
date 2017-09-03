package challenge.c03

/**
 * Created by neome on 14/08/2017.
 */

fun main(args: Array<String>) {

    var books = arrayListOf("ESDLA", "The Dark Tower", "2012", "Alice in Wonderland");

    for (b in books) {
        if (b.contains("e")) {
            for (c in b) {
                println(c)
            }
        }
        println()
    }


}