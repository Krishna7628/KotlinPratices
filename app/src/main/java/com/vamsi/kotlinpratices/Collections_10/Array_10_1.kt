package com.vamsi.kotlinpratices.Collections_10

/*
*   Array : Mutable but has fixed size.
*
*   Collections :
*      -> Immutable Collections : Ready Only Operations
*               1. listOf
*               2. mapOf
*               3. setOf
*
*      -> Mutable Collections : Read and Write Both
*               1. List : ArrayList, arrayListOf, mutableListOF
*               2. Map : HashMap, hashMapOf, mutableMapOf
*               3. Set : mutableSetOf, hashSetOf
*   */



fun main(args: Array<String>) {

    //10 .1 Arrays
    // Elements : {0}  -> 0 0 0 0 0 0
    //or Elements : {-1} -> -1 -1 -1 -1 -1 and size is 5
    // Index   : (5 size) 0 1 2 3  4


    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 32
    myArray[3] = 45
    myArray[1] = 8

    for (elements in myArray) {
        println("Elements: " + elements)
    }


    for (index in 0..myArray.size - 1) {
        println("Elements: " + index)
    }

    for ((index, value) in myArray.withIndex()) {
        println("Elements -> Index:  $index and  Value : $value")
    }


    /* --------------------------------------------------------------------------------------------------------------------------------*/

    //10 .2 ListOf(immutable) and ArrayList(Mutable)

    val immutableList = listOf<String>(
        "yandrapragada",
        "vamsi",
        "krishna"
    )   // immutable, fixed size, read only operation possible

    for (element in immutableList) {
        println(element)
    }

    for (index in 0..immutableList.size - 1) {
        println(index)
    }


    /* to add or remove item in list operations : we should use mutable list like: ArrayList, arrayListOf, mutableListOf
     Mutable benefits : add and remove of items  */

    val mutableList = mutableListOf<String>(
        "yandrapragada",
        "vamsi",
        "krishna"
    )                             // mutableListOf
    //  val mutableArrayList = ArrayList<String>()                                                                                 // ArrayList
    //  mutableArrayList.add("yandrapragada")
    //  mutableArrayList.add("vamsi")
    //   mutableArrayList.add("Krishna")

    // val mutableArrayListOf = arrayListOf<String>("Vamsi","Krishna")                                            // arrayListOf

    mutableList.add((mutableList.size - 1) + 1, "samba")
    mutableList.add((mutableList.size - 1) + 1, "laxmi")
    mutableList.add((mutableList.size - 1) + 1, "Janaki Ram")

    for (element in mutableList) {
        println("arrayListOf Element : " + element)
    }

    /* --------------------------------------------------------------------------------------------------------------------------------*/

    //10.3 mapOf ( Immutable ) and mutableMapOf ( mutable )

    val myImmutableMap = mapOf<Int, String>(
        1 to "vamsi",
        2 to "krishna",
        3 to "yandrapragada"
    )    // Immutable, fixed size, Read only operations

    for (key in myImmutableMap.keys) {
        println("Key : $key And Value ${myImmutableMap[key]}")  // or we can use myImmutable.get(key)

    }

// Mutable Map
    val myMutableHashMap = HashMap<Int, String>()  // mutable, add, remove operation are allowed.
    val myMutableMapOf = mutableMapOf<Int, String>() // returns linked HashMap
    val myMutableHashMapOf = hashMapOf<Int, String>()

    myMutableHashMap.put(1, "a")
    myMutableHashMap.put(2, "b")
    myMutableHashMap.put(3, "c")


    /* --------------------------------------------------------------------------------------------------------------------------------*/

    //10 .4 set ( Immutable ) and mutableSet ( mutable )
    // "Set" contains unique elements --> order is preserved
    // "HashSet" also contains unique elements but sequence is not guaranteed in output(order is not preserved)


        val myImmutableSet = setOf<Int>(2, 54, 3, 1, 0, 9, 9, 9, 8) // immutable, read only

        for (element in myImmutableSet){
            println("Set Elements : $element ")
        }

    //mutable set
    val mutableHashSet = hashSetOf<Int>(2, 65,76,882,8,8,8,8,8,90)  //order is not preserved
    val mutableSetOf = mutableSetOf<Int>(2, 65,76,882,8,8,8,8,8,90)  // order is preserved)
    for (element in mutableHashSet){
        println("Mutable Hash Set Elements : $element ")
    }


}


