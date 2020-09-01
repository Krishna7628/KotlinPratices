package com.vamsi.kotlinpratices

import com.vamsi.kotlinpratices.Test.PersonalData

/*
* -> Functions
* -> Comments
* -> variables
* -> constructors
* -> class
* ->  String Interpolation --> println("The result is $value  or $ {class.variableName})"
* */


fun main(args : Array<String>){


    // 1.Comments
    // single line comment --> //
    // multi line comment --> /* */



    // 2. Variables

    var a : Int                        //declaring a variable
        a  = 1                     // var is mutable (value can be change)
    val name :String = "vamsi"          // val is Immutable (can't be change)



    // 3. functions

    display(a, name)

    var person = Person()
    person.diplay(name)
    person.rollNo =10


    // 4. constructor
    var personalData = PersonalData("vamsi krishna Yandrapragada")

}

fun display(a: Int, name: String) {
    println("value is "+ a +" : "+ name)
}


class Person{
    var rollNo :Int = 0

    fun diplay(name :String){
        println(name)
    }
}