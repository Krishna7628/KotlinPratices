@file:JvmName("TestDefault")

package com.vamsi.kotlinpratices

import android.view.ViewParent
import com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction.Cat
import com.vamsi.kotlinpratices.HighFunctionAndLambdas.Program
import java.math.BigInteger


fun main(args: Array<String>) {

    //7.1
    addTwoNumber(19, 20)
    println(addTwoNumberReturnResult(90, 12.6))

    //7.2 if as expression
    println("Greatest Values ${greaterValue(199, 762)}")

    // 7.3, 7.4 - interoperability
    println("JAVA file result :" + JavaTest.addOfTwoNumbers(901, 61))

    // 7.5 - default functions
    println("Default function : " + defaultFunctionAreaOfSquare(b = 10, l = 2199))
    // 7.6 - Named parameters functions
    println("Named function : " + AreaOfSquare(breadth = 10, length = 2199))

    // 7.7 - Extension functions
    val test = Test2();
    test.addTwoNumber(8, 89)

    val a = "vamsi"
    val b = " Krishna"
    val c = "y "
    c.concated(a, b)

    //7.8 infix function
    val a1 = 92
    val a2 = 84
    a1 add a2

    //7.9 tailrec
    println(getFibonacciNumber(7, BigInteger.valueOf(1), BigInteger("0")))


    //////////////////////////////////
    //8.1 classes and primary constructor
    var hello = Hello("Vamsi ", "Krishna") // primary constructor with parameters
    var hello1 = Hello1("Vamsi ", "Krishna") // primary constructor with properties

    //8.2 classes and primary constructor
    var hello2 = Hello2("Vamsi ", "Krishna", 26) // secondary constructor

    //8.3,8.4 --> inheritance
    //8.5 --> method overriding
    val animal = Animal()
    animal.color = "blue"
    println(animal.color)

    val dog = Dog1()
    println("Dog Bread : " +dog.bread)
    println("Dog Color : " + dog.color)
    dog.area()
    dog.eats()

    val cat = Cat1()
    println("Age : ${cat.bread}")
    println("Cat Color : " + cat.color)
    cat.eats()
    cat.area()


    // 8.6 --> inheritance with primary and secondary constructor

    val child1 = Child1("parent", "child")  // only primary constructor

    val child2 = Child2("parent2", "child2")  // only secondary constructor

    // 8.7 Visible modifiers
    // 8.8 abstract class -- > can
    // 8.9 Interface







    /////////////////////////////

    // 9.1 high level functions

    val program = Program1()
    program.sumOfTwoNumber(18,99, object : MyInterface1{
        override fun execute(sum: Int) {
       println(sum)
        }

    });





}

class Program1 {
    fun sumOfTwoNumber(i: Int, i1: Int, action : MyInterface1) {
        val res = i +i1
        action.execute(res)
    }

}

interface MyInterface1 {
fun execute(sum :Int)
}


private infix fun Int.add(a2: Int) {
    println("Infix : ${this + a2}")
}

private fun String.concated(a: String, b: String) {
    println(this + a + b)
}


private fun Test2.addTwoNumber(i: Int, i1: Int) {
    println(i + i1)
}

fun AreaOfSquare(length: Int, breadth: Int): Any? {
    return length * breadth
}

@JvmOverloads
fun defaultFunctionAreaOfSquare(l: Int, b: Int, h: Int = 10): Any {
    return l * b * h;
}

fun greaterValue(i: Int, i1: Int): Any = if (i > i1) i else i1

fun addTwoNumberReturnResult(i: Int, d: Double): Any {
    return i + d
}

fun addTwoNumber(i: Int, i1: Int) {
    println(i + i1)
}

class Test2 {

    fun hello() {
        println("Hello!")
    }
}


class Hello(s: String, s1: String) {// primary constructor with parameters
init {
    println("Name : " + s + s1)
}
}

class Hello1(var s: String, var s1: String) {// primary constructor with properties
init {
    println("Name : " + s + s1)
}
}

class Hello2(var s: String, var s1: String) {
    var i = 0

    init {
        println("result : $s : $s1 : $i")
    }

    constructor(s: String, s1: String, i: Int) : this(s, s1) {
        this.i = i;
        println("result : $s : $s1 : $i")
    }
}


open class Animal{

    open var color =""

    open fun eats(){
        println("Eating")
    }
}


class Dog1: Animal() {

    val bread ="lab dog"

    override var color ="black"

    fun area(){
        println("west")
    }

    override fun eats(){
        println("dog eating")
    }
}

class Cat1: Animal() {

    val bread ="street cat"

    override var color ="blackAndWhite"

    fun area(){
        println("North")
    }

    override fun eats(){
        println("cat eating")
    }

}

open class Parent1(var parent: String)

class Child1(var s: String,var s1: String):Parent1(s) {
    init {
        println("Inheritance with Primary Constructor : $s And $s1")
    }
}

open class Parent2{
    val parent = ""
    constructor(parent: String){

    }
}

class Child2:Parent2 {
    constructor(parent: String,child2: String):super(parent){
        println("Secondary constructor : $parent and $child2")
    }
}