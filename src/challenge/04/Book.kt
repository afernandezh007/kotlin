package challenge.`04`

/**
 * Created by neome on 26/08/2017.
 */

class Book(val title:String, val author:String,
           val publicationYear:Int,var borrowed:Boolean){

    fun borrow() {
        if(borrowed){
            println("error book borrowed")
        }else {
            borrowed = true
        }
    }
    fun returned() {

        if(borrowed){
            borrowed = false
        }else {
            println("Error, you have already the book")
        }
    }


    fun print(){
        println("Book(title='$title', author='$author', publicationYear=$publicationYear)")
    }
}

fun main(args: Array<String>) {
    var b:Book= Book("ESDLA","Tolkien",1960,false)

    b.print()
    b.borrow()
    b.borrow()
    println(b.borrowed)
    b.returned()
    b.returned()
    println(b.borrowed)



}