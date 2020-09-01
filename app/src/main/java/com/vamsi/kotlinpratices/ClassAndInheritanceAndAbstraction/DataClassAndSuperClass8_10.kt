package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/*
* Data class and super class "Any"
*
*       "Any" class contains functions such
*           -> equals() -> return Boolean
*           -> hashCode() -> return int
*           -> toString() -> String
*
*       ### Kotlin creates a copy() too it.
*
*   Data class simple provides toString() of data. if we dn't use data as a prefix then it address or location of memory.
*
* */


fun main(args: Array<String>) {

    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1.toString())

    if (user1 == user2) {                     // it just check references to same object or not
        println("Equal")
    } else {
        println("Not Equal")
    }


    val newUser = user1.copy(name = "ram gopal", i = 12) // by using copy object we can create new object or modify it.

}

data class User(var name: String, var i: Int ){           // if we use data as prefix it simple check data
                                                          // while using data keyword primary constructor should have properties(either var / val ) only but not parameters.

}
