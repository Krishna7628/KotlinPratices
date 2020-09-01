package com.vamsi.kotlinpratices.FiltersAndSorting

/*
*     Important Functions :
*           -> Filter -> Desired Results from a Collection
*           -> map -> Perform operations, modify elements
*
*     Predicates : Or a Condition that returns TRUE or FALSE
*       -> all : Do all elements satisfy condition?
*       -> any : do any element in list satisfy condition?
*       -> count : Total elements that satisfy condition
*       -> find : return the "FIRST" element that satisfy condition
*
*   More functions :
*        -> flatmap : filter elements from a collection of collection
*        -> distinct : returns unique results */


fun main(args: Array<String>) {

    val myNumbers = listOf<Int>(2, 3, 4, 5, 10, 12)


    // Filter -> that satisfied result only returned
    val mySmallNums  = myNumbers.filter { v -> v < 10 } // { it < 10 }
    for (num in mySmallNums){
        println(num)
    }

    // map -> operation applied on elements in list
    val myMapFunction = myNumbers.map { it * it } // {num -> num * num}
    for (num in myMapFunction){
        println(num)
    }


    // Applying both filter and map
    val myBothApplied = myNumbers.filter { v -> v < 10 }.map { it * it } // {num -> num * num}
    for (num in myBothApplied){
        println(num)
    } // out put :  4, 9, 16 25





}


class Person(var age :Int, var name : String){

}