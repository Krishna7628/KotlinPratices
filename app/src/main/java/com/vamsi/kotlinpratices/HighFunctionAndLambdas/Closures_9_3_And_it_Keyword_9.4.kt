package com.vamsi.kotlinpratices.HighFunctionAndLambdas

/*Closures :
*       1. In java 8, you cannot mutate (change) values of outside variable inside lambdas
*       2. But in kotlin you can change the values.
*
* 9.4 It Keyword : if we are working single parameter. it can be applicable
* */

fun main (args : Array<String>){
    var result : Int
    val test =Test1()
     test.addOfTwoValues(2, 8 ,{x: Int, y : Int -> result =  x+y})  // closures


    //9.4 It keyword
    test.reverseAndDisplay("hello",{s : String -> s.reversed()})
    // using it keyword
    test.reverseAndDisplay("hello",{it.reversed()})
}

class Test1 {

    fun addOfTwoValues(a : Int, b: Int, action: (Int, Int) -> Unit){
        action(a, b)

    }

    fun reverseAndDisplay(s: String, function: (String) -> String) {
        var result = function(s)  // s.reversed() --> "hello".reversed() ==> "olleh"
        println(s)                       // it keyword --> it.reversed() --> s.reversed() --> "hello".reversed() ==> "olleh"
    }
}