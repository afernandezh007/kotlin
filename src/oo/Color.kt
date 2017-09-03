package oo

enum class Color(val rgb:Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

    fun containsRed():Boolean{
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {

    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())

    //bitwise operators

    println(0b1101 or 0b1000) //13

    println(0b1101 xor 0b1000) //5

    println(0b10011.inv() and 0x00001F)

}