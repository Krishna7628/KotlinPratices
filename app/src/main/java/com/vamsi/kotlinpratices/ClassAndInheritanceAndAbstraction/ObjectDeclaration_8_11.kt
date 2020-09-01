package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/* Object Declarations and Companion Objects
*       What is Singleton ?
*       when we have just ONE INSTANCE of a class in the whole application
*           example : if Class STUDENT is declared singleton then we cannot create objects for this class
*                      -> there exists only one object for this class by default
*                      -> and we cannot create objects like student1, student2 etc
*
*       In Java, we define SINGLETON, by using keyword "static" variables and methods
*
*       In Kotlin we cannot declare "static" variables and methods
*       So, we have alternative to that
*           -> declare "Object"
*           -> This creates a singleton object when program runs
*               example : object Customer {
*                   var id : Int = -1                   // behaving as Static variable
*                   fun registerCustomer(){ // code }   // behaving as static methods
*
* Properties :
*           1. kotlin internally, creates a class and an object/ instance this object
*           2 . can have properties, methods and initializer
*           3. cannot have constructors
*                   -> as we cannot create object / instance manually
*           4. object can also have super class.
*                                              */


fun main(args : Array<String>){

    CustomersData.count = 10
    println(CustomersData.count)

    CustomersData.count = 121
    println(CustomersData.count)


    CustomersData.count = 1022
    println(CustomersData.count)
}

object CustomersData  : Animal() {

    var count  = -1

    override var color = "blankAndWhite"

    fun typeOfCustomers():String{
        return "Indian"
    }



}