package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/* Class declaration : class ClassName{ }
*  Constructor :  class ClassName( VariableName : DataType){ } ---> ex: class Student ( rollNo : Int, studentName : String)        ---> it is primary constructor
*  how to initialize properties :
*   class Student( name : String){
*               init{
*                           // your class initializer Code  or body
*             }
*         }
*
*
*  ----> 8.1 Concepts : Primary constructors
*                           - > init block
*                           - > primary constr with property
*                           - > primary constr with just parameters
*  ----> 8.2 Secondary Constr :
*                           - > secondary constr can't have property
*                           - > secondary constr have parameters
*
*  ----> 8.3, 8.4 Inheritance : In Inheritance is a mechanism in which one object acquires all properties from its Parent class Object.
*               Advan : 1. Code Reusability
*                       2 . Method Overriding
*
*                   By Default  Classes are
*                           1. public in nature
*                           2. final in nature
*           Types : 1. Single Inheritance              B --> A               ----> Super Class for A: Any
*                   2. MultiLevel Inheritance          C --> B --> A         ----> Super Class for A: Any
*                   3. Hierarchial Inheritance         C---> A < --- B       ----> Super Class for A: Any      Any Class Contains : Functions such as :  1. equals() : Boolean return
*                                                                                                                                                        2. hashCode(): Int return
*                                                                                                                                                        3. toString() : String return
*
*
*   -----> 8.5 Method Overriding : If subclass (child class) has the same method as declared in the parent class, it is known as method overriding
*   -----> 8.6 Inheritance With Primary and Secondary constructor
* */



fun main(args: Array<String>) {

    // primary and Secondary constructor
    val classStudent = ClassStudent("Vamsi", 10)
    println("Name : ${classStudent.name}")


    // inheritance
    val dog = Dog()
    dog.breed = "pitbull"
    dog.color = "BLackAndWhite"
    dog.bark()
    dog.eat()


    val cat = Cat()
    cat.age = 5
    cat.color = "grey"
    cat.meow()
    dog.eat()


    // -----> 8.6 Inheritance With Primary and Secondary constructor
    val vamsi = Vamsi("vamsi krishna", 26)


}


class ClassStudent1(name: String) {                   //primary constr with just parameters
}

class ClassStudent(var name: String) {                   //primary constr with property

    var rollNo = 0

    init {                                              //init block
        println("Name 1: $name")
    }

    // 8.2 Secondary Constru : secondary constructor have its own body but primary constr dnt have init take places
    // it can't have properties like ( var rollNo : Int)
    // it can have parameters
    constructor(name: String, rollNo: Int) : this(name) {
        //body
        this.rollNo = rollNo
        println(" Secondary Constructor ----> Name 1: $name And Roll No : $rollNo")
    }

}


// 8.3  inheritance

open class Animal {
    open var color = " "
    open fun eat() {
        println("Eats")
    }
}

class Dog : Animal() {
    var breed = ""                                   //overriding variable

    override var color = "BlackAndWhite"

    fun bark() {
        println("Barks")
    }


    override fun eat() {                                 // Method overriding
        super<Animal>.eat()                                     // first it call the super call method and then it execute other things
        println(" dog is eating")
    }
}

class Cat : Animal() {
    var age = 0

    override var color = "grey"                         //overriding variable

    fun meow() {
        println("Moew")
    }

    override fun eat() {                                 // Method overriding
        println(" Cat is eating")
    }
}


// -----> 8.6 Inheritance With Primary and Secondary constructor

open class Yandrapragada(var age: Int) {

}

class Vamsi(var name: String, age: Int) : Yandrapragada(age) {         // primary constructor

    init {
        println("Name : $name And Age : $age")
    }

}


//secondary const With Inheritance
open class Yandrapragada1 {
    var age = 0
    constructor(age: Int) {
        println(age)
    }
}

class Krishna : Yandrapragada1 {

    val name = ""

    constructor(name: String, age: Int) : super(age) {
        println("Name : $name And Age : $age")
    }

}

