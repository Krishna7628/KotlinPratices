@file:JvmName("FunctionKotlin")

package com.vamsi.kotlinpratices

import java.math.BigInteger

/*Functions basic and syntax
*  1. basic and syntax
*  2. functions as expression
*  3. interoperability means calling another lang code to another code. Example : calling java method from kotlin main method or calling kotlin functions from java class. " 'Which is a same project' "
*  4. interoperability with eg and custom kotlin file name using @field : JvmName(" File name")
*  5. Default function and interoperability using default function
*  6. Named parameters
*  7. extension Functions : add a function to a class with out declaring it inside a class and it behaves like static functions
*  8 .Infix Functions : it is members functions or extension functions
*                     - > it is single parameterized function
*                     -> All infix functions are extension function but all infix are not extension function
*  9 . TAIL REC  functions : Recursion */


fun main(args: Array<String>) {

    //1.basic
    add(2, 6) // unit similar to void in case of java
    println("add1 result : " + add1(3, 10))  //having a return value

    //2 . functions as expression
    println("function as a expression : " + graterValue(200, 3))

    //3.Interoperability  --> taking below as a example
    println("Sum of Two values : " + Interoperability.addTwoValues(89, 1992))

    //4. custom kotlin file name  @file:JvmName("FunctionKotlin") -------> Starting

    // 5. Default functions
    defaultFunction(27, 389)
    /*Interoperability using Default functions*/

    //6. Name Parameter functions
    areaOfSquare(breadth = 122, length = 10)

    //7.Extension Functions
    //eg: 1
    val student = Student()
    println("Student Passed Or Not --> Student Pass : ${student.hasPassed(70)}")
    println("Student Scholarship Status : ${student.gotsholarship(79)}")

    //eg: 2 using predefined Object
    val a = "Yandrapragada"
    val b = "vamsi"
    val c = "krishna"
    println("Extension Functions ---> My Full Name : ${a.addValues(b, c)}")

    //8. Infix Functions --> it having only one parameter
    val w = 12
    val q = 67
    w.greaterValues(q) // or x greaterValues y ---> also we call but it will not work for extension function . infix function improve readability

    // 9 . Tail Rec functions : Fibonacci series
    println("Fibonacci Series: ${getFibonacciSeries(5, BigInteger("1"), BigInteger("0"))}")

}

tailrec fun getFibonacciSeries(i: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (i == 0) {
        return b
    } else {
        return getFibonacciSeries(i - 1, a + b, a)
    }
}


infix fun Int.greaterValues(q: Int): Int = if (this > q) {
    this
} else {
    q
}

fun String.addValues(a: String, b: String): String {
    return this + " " + a + " " + b
}

fun Student.gotsholarship(i: Int): Boolean {
    if (i > 85) {
        return true
    } else {
        return false
    }
}


class Student {
    fun hasPassed(marks: Int): Boolean {
        if (marks > 50) {
            return true
        } else {
            return false
        }
    }


}

fun areaOfSquare(length: Int, breadth: Int) {
    println("Name Parameter were Length :$length and Breadth : $breadth and Area : ${length * breadth}")
}

@JvmOverloads
fun defaultFunction(i: Int, i1: Int, i2: Int = 122) {
    println("Default function : " + (i + i1 + i2))
}

fun graterValue(i: Int, i1: Int): Int = if (i > i1) i else i1


fun add1(i: Int, i1: Int): Int {
    return i + i1
}


fun add(a: Int, b: Int) {
    println("sum of two numbers : ${a + b}")
}