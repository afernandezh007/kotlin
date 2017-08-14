package loops

/**
 * Created by neome on 14/08/2017.
 */

fun main(args: Array<String>) {
    for(c in "Python"){
        if (c=='o'){
            break
        }
        print(c)
    }

    println()
    val list = listOf("Book", "Table", "Laptop")
    for(str in list){
        if(!str.contains('o')){
            continue
        }

        println(str)
    }
}