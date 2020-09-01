package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/* Modifiers :
*             Kotlin Support :
*                   1. public ---> All func, class by default in public and final in nature  ( For class and Methods)
*                   2. protected -- > not applicable for top level func and  class also     ( For class and Methods)
*                   3. interanl  --> applicable for same model                              ( For class and Methods)
*                   4. private   ---> applicable only for particular file                  ( For class and Methods)    */


///For variables
open class StudentDetails{

    private var a = 10
    protected var b = 1
    internal var c =90
    public final var d = 88
}


class StudentOne : StudentDetails(){

    // a is not visible
    // b,c,d visible
}


class Hello{

    //a,b not visible
    // c,d visible


    fun Test(){
        val studentDetails = StudentDetails()
        println(studentDetails.c)
    }
}