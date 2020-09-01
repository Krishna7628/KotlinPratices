package com.vamsi.kotlinpratices.HighFunctionAndLambdas

/*  High level functions
*       -> can accept functions as parameters
*       -> can return a function
*       -> Or can do both
*
*   Lambdas :
*       it is just a function with no name.
*       example : val myLambda : (Int) -> Unit = { s: Int //parameters// -> print(s) // method body //  }
*                   1. val myLambda1 : (Int, Int) //Parameters type //  -> Int // return type// = {x, y -> x+y}
*
*   What is High Function :
*       1. Passing lambda to high level function as parameter or return lambda as function.
*       2.
*
* */


fun main (args : Array<String>){

    val program = Program()
    program.addTwoNumbers(2,100)

    program.addTwoNumbers(56,8899, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })


    //Lambdas :
    val myLambdas :(Int) -> Unit = {s : Int -> println(s)} // after -> is the method body     // lambdas expression [Function]
        program.addTwoNumbers(78,88, myLambdas)
    //calling function using lambdas as function with a single line
    program.addTwoNumbers(77,8899,{s : Int-> println(s)}) // single line call
}

class Program {

    fun addTwoNumbers(a : Int, b : Int){     // add two numbers
        val sum = a + b
        println(sum)
    }

    fun addTwoNumbers(a : Int, b : Int, action: MyInterface){     // add two numbers using interface
        val sum = a + b
        action.execute(sum)
//        println(sum)
    }

    fun addTwoNumbers(a : Int, b : Int, action: (Int) -> Unit){     // high level function with lambdas as function
        val sum = a + b
        action(sum)
//        println(sum)
    }


}


interface MyInterface{
    fun execute(sum :Int)
}