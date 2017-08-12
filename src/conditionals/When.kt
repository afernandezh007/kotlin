package conditionals

fun main(args: Array<String>) {
    val mode:Int =2

    when(mode){
        1 -> println("1 case")
        2 -> {
            println("mode 2")
            println("mode busy")
        }
        3 -> println("on case")
        else -> println("default case")
    }

    val result = when(mode){
        1 -> "1 case"
        2 -> {
            println("mode 2")
            "mode busy"
        }
        3 -> "on case"
        else -> "default case"
    }

    println(result)

    val x = if(mode<2){
        "mode is less than 2"
    }else{
        "mode > 2"
    }
    println(x)
}