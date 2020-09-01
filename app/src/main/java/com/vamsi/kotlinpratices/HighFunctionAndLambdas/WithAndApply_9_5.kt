package com.vamsi.kotlinpratices.HighFunctionAndLambdas

/* with : with(reference of a class){ variable :Name = "initialization"}

*  apply : referenceVariable.apply{variable :Name = "initialization"}.start()
            -> apply can also method but with can't do that.*/


fun main (args :Array<String>){

    var person = Person()

    with(person){
        name = "Vamsi"
        age = 17
    }

    person.apply {
        name = "Krihna"
        age = 18
    }.start()

    person.name  = "Vamsi"
    person.age = 19

    println(person.name)
    println(person.age)

}

class Person {

    var name : String = ""
    var age : Int = -1

    fun start(){
        println("Now I am ready to run")
    }

}