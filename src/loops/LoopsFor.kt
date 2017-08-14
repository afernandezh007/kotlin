package loops

/**
 * Created by neome on 14/08/2017.
 */

fun main(args: Array<String>) {

    var sum = 0
    for(i in 1..100){
        sum = sum + i
    }

    val list = listOf("Java","Kotlin","Python")
    for(element in list){
        println(element)
    }

    for((index,value) in list.withIndex()){
        println("element at $index is $value")
    }
}
