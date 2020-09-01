package com.vamsi.kotlinpratices.HighFunctionAndLambdas

fun main(args : Array<String>){


    val test = Test()
    val myLamdba : (Int, Int) -> Int = {x :Int, y:Int -> x + y}
    test.addTwoNumbers(2, 88, myLamdba)
    //or we call simple form
    test.addTwoNumbers(2, 88, {x :Int, y:Int -> x + y})
    //or
    test.addTwoNumbers(2, 88) {x :Int, y:Int -> x + y}
}


class Test {

    fun addTwoNumbers(a : Int, b: Int, action : (Int, Int) -> Int){        // High level Function withLambda as a function
        val sum = action(a, b)
        println(sum)
    }
}