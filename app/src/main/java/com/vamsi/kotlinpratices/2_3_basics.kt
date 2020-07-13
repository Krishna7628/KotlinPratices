package com.vamsi.kotlinpratices

import com.vamsi.kotlinpratices.Basic_Class.BaseClassDemo

fun main(args: Array<String>) {
    println("Hello World")

//--------------<Comments>
    //inline comment
    /*multiple comment */

//--------------<Variables>
    var a = 19  // mutable
    val b = 39   // immutable
//--------------<Data Types>
    val c = 1 // byte -- 1 byte
    val d = 128 // short --2 byte
    val e = 3443 //int - 4byte
    val f = 30L //Long - 8bytes
    val g = 3.4f // float - 4bytes
    val h = 32.30033// double

//--------------<functions>
    display(a)

    val name = Base()
    name.names = "yandrapragada"
    name.display("Vamsi", name.names)
    //--------------<functions, Constructors>
    //create object from another package
    val baseClass = BaseClassDemo("yandrapragada","vamsi")
    baseClass.lastName = "krishna"
    baseClass.display(baseClass.lastName)

}

class Base {
    var names = ""
    fun display(name: String, names: String) {
        println("first name : $names and Second Name : $name")
    }
}

fun display(a: Int) {
    println(a)
}
