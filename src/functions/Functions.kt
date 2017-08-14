package functions

import java.util.*

/**
 * Created by neome on 14/08/2017.
 */

//no parameters, no return value
fun helloWorld(){
    println("Hello world!")
}

// 1 parameter, no return value
fun printWithSpaces(text:String){
    for(char in text){
        print(char + " ")
    }
    println()
}

//No parameters, returs Date
fun getCurrentDate(): Date{
    return Date()
}

//2 parameters, returns Int
fun max(a: Int, b:Int):Int{
    if(a>=b) {
        return a
    }else{
        return b
    }
}

fun main(args: Array<String>) {

    helloWorld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(17,42))
}