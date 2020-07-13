package com.vamsi.kotlinpratices;

public class Interoperability {

    public static void main(String[] args) {

     //   int result = FunctionsKt.graterValue(8, 920);  --->By file name
         int result = FunctionKotlin.graterValue(9,282);   //  using custom file name by Declaring @file:JvmName(" Name of a file")
        System.out.println(result);



        //Default functions --> java dnt have default function, so we use @JvmOverLoads
        FunctionKotlin.defaultFunction(9900,299);
    }


    public static int addTwoValues(int i, int i1) {
        return i + i1;
    }
}
