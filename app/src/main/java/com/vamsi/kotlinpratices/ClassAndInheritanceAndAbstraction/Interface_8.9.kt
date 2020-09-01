package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/* Interfaces : interface not a class it is listener (like button click, some services)
*               -> example : onclick in android some action to be perform
*
*       1. Interface can have both NORMAL METHODS AND ABSTRACT METHODS
*       2. But they contains only ABSTRACT PROPERTY
*       3. Interface are not class.
*       4. you can't create instance of an interface similar to an abstract class.
*
*
* */



fun main(args : Array<String>){

    val button =  Button()
    button.onTouch()
    button.onClick()
    button.name = "Ram"

}


interface Person{   // we can't create instance of interface

    var name : String                               // what we declared in interface by default in abstract in nature

    abstract fun onTouch()                          // abstract method


    fun onClick(){                                 // Normal methods are public and open by default  NOT FINAL
        println("Interface : Button was touch")
    }
}

interface Person2{   // we can't create instance of interface


    fun onTouch(){                                  // Normal methods are public and open by default  NOT FINAL
        println("Interface2 : Button was touch")
    }


    fun onClick(){                                 // Normal methods are public and open by default  NOT FINAL
        println("Interface2 : Button was touch")
    }
}



class Button : Person, Person2 {
    override var name: String ="Vamsi"

    override fun onTouch() {
      println("Button was touch")
    }

    override fun onClick(){                              // When class implements two interface having same method name then it should also inherit that method as well.
        super<Person>.onClick()
        super<Person2>.onClick()
        println("Button was click")
    }

}