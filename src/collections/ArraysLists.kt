package collections

/**
 * Created by neome on 12/08/2017.
 */

fun main(args: Array<String>) {

//    val array = arrayOf("Texas", "Iowa", "California")
//    val mixed = arrayOf("Kotlin",17,3.0,false)
//    val numbers = intArrayOf(1,2,3,4,5)
//
//    println(mixed[0])
//    mixed[2] = 3.141592
//    println(mixed[2])
//
//    //string like an array
//    val str = "Udemy"
//    println(str[0])
//
//    val states = arrayOf("Nevada", "Florida")
//
//    val allStates = array + states
//
//    println(allStates.size)
//
//    val empty : Boolean = numbers.isEmpty()
//
//    if(states.contains("Kentucky")){
//        println("It contains Kentucky")
//    }else{
//        println("It does not contain Kentucky")
//    }
//

//    val list = listOf("Orange", "Apple", "Bananas")

    val arraylist = arrayListOf("Patrick", "Michael", "Sarah")
    val list = arrayListOf("Peter")
    println(arraylist[0])
    println(arraylist+list)
    println(arraylist.size)
    println(arraylist.isEmpty())
    println(arraylist.contains("Sarah"))

    arraylist.add("Josh")
    val changed = arraylist.add(1,"Jack")
    println(arraylist)

    val removed = arraylist.remove("Michael")
    val removed2 = arraylist.remove("no existe")
    println(arraylist)
    println(changed)
    println(removed)
    println(removed2)

    val subList = arraylist.subList(1, 4)

    println(subList)

}