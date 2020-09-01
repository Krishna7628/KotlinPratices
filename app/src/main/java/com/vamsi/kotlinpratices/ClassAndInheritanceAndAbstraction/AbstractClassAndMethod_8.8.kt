package com.vamsi.kotlinpratices.ClassAndInheritanceAndAbstraction

/*      Abstract Class,Methods, and properties
*           --> class can be abstract in nature
*           --> the Role of abstract class is to just provide set of methods and properties
*           ---> Abstract class are partially defined class
*           ---> Abstract methods have no body when declared
*           -->  Abstract property can't be initialized when declared
*           --> abstract class can have both abstract properties and normal properties, Similarly in the case methods also
*  Conclusion :
*       1.  you can't create instance/ objects of Abstract class
*       2. you need to override abstract methods, properties inside derived class / child class
 *       */



fun main(args : Array<String>){

   // var s = PersonData()  ---> we can create a instance  of  abstract class and  throws errors

}

abstract class PersonData{

    var name = "name"   // normal variable
    abstract var id : Int  //abstract variable can't be initialize

    abstract fun eat()            // abstract properties are 'open' by default and didn't contain body (so we have remove {} )
    open fun getHeight(){}      // A 'open' func ready to be overridden
    fun  goToSchool(){}         // A normal func is by default public and final in nature
}

class Indian : PersonData(){

    override var id: Int = 100                                  // Abstract variable should compulsory implemented in child or sub class

    override fun eat() {                                        // Abstract fun should compulsory implemented in child or sub class
        TODO("Not yet implemented")
    }
}