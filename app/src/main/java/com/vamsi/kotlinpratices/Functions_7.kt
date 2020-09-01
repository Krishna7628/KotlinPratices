@file:JvmName("KotlinFile")

package com.vamsi.kotlinpratices

import java.math.BigInteger


/* syntax of functions :
*
*   7.1 --->  fun display ( a : Int, b : Int ) : Int (return type Or If we use Unit is similar to void in java  not return type. it is not compulsory to declare unit(if nothing represented it treated as unit) )
*   7.2 ---> last value in condition will return in if as expressions
*   7.3, 7.4 ---> Interoperability : we can call java fun from kotlin and kotlin fun from java file  and we can have java and koltin files within the same project
*             Java code (.java file) ---Compiler--->  byte code (.class) ----JVM---> prog running
*              Kotlin code (.kt file) ---Kotlin Compiler--->  byte code (.class) ----JVM---> prog running
*   7.5 ----> Default function : default argument : function
*   7.6 ----> Named parameters --> it not possible in java. So, there is not possibility of interoperability
*   7.7 : Extension functions --> adds new functions to the class :
*           -> add functions to a class without declaring it
*           -> new functions added behaves like ""static""
*   7.8 ----> Infix function : func contains only one parameter and prefix " infix"
*               --> can be a member function or extension function
*               --> all infix func are extension func but all extension are not infix func
*         Use : we can call func as simple.
*   7.9 ----->  Tailrec function  : Recursion of same func (call same func repeatedly by prefix "Tailrec" )
*         Use : to overcome stack over flow Error problem (means  out of memory )*/


fun main(args: Array<String>) {


    // 7.1  fun syntax
    add()                               // fun with out return
    val a = addTwo(2, 3)    // fun with return
    println("Sum of two $a")


    // 7.2  fun as expressions or single line fun  --> if expressions, when expressions
    val largestValue = maxValue(4, 8)
    println("max value $largestValue")


    // 7.3, 7.4 ---> Interoperability
    val result = MyJavaFile.MaxOfTwoValues(89, 556)
    println("Max Of a Value : $result")


    // 7.5 ---> Default function
    val maxVolume = findVolume(45, 53)
    println("Max value : $maxVolume")

    findVolume(45, 53, 100)             // if we send third value it will override  the default parameter


    // 7.6 :  Named parameters --> it not possible in java. So, there is not possibility of interoperability
    areaSequare(length = 10, breadth = 20) // we can send in an form there will no problem with function. It can easy to identify based on names.
    areaSequare(breadth = 20, length = 10)


    // 7.7 : Extension functions
    val student = Student()
    student.hasPassed(78)  // function inside a class
    student.isSchrolar(90) // function outside of a class ---> className.functionName


    val str1 = "vamsi "
    val str2 = "krishna "
    val str3 = " yandrapragada"
    val Name = str3.add(str1, str2)
    println("Name : $Name")




    // 7.8 : Infix functions
    val a1 = 3
    val a3 = 8
    a3.greaterValue(a1)        // normal form calling
    a3 greaterValue a1         // using infix as prefix we can call simply


    // 7.9 : Tailrec functions
        println(getFibonacciNumber(5,BigInteger("1"), BigInteger("0")))

}




 infix fun Int.greaterValue(a1: Int) :Boolean {
    return this > a1
}

fun String.add(str1: String, str2: String): Any {
    return str1 + str2 + this
}


fun add() {
    val a = 2
    val b = 3
    val result = a + b
    println("sum is ${result}")
}

fun addTwo(i: Int, i1: Int): Int = i + i1



fun maxValue(i: Int, i1: Int): Any = if (i > i1) {
    println("first value greater")
    i
} else {
    println("Second value greater")
    i1
    890                                                     // """" the last value in condition will be return. 890 will be return but not i1
}

@JvmOverloads
fun findVolume(len: Int, width: Int, height: Int = 10): Any {
    return len * width * height
}


fun areaSequare(length: Int, breadth: Int) {
    println("Area : ${length * breadth}")
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 70
    }
}

fun Student.isSchrolar(marks: Int): Boolean {
    return marks > 80
}


tailrec fun getFibonacciNumber(i: Int, bigInteger: BigInteger, bigInteger1: BigInteger): BigInteger {
    if (i == 0)
        return bigInteger1
    else
      return  getFibonacciNumber(i - 1, bigInteger + bigInteger1, bigInteger)
}