package loops

/**
 * Created by neome on 14/08/2017.
 */

fun main(args: Array<String>) {

    outer@ for(i in 1..10){
        for(j in 1..10){
            if(i - j == 5){
                break@outer
            }
            println("$i - $j")
        }
    }
}