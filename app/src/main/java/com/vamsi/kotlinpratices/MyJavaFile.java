package com.vamsi.kotlinpratices;

public class MyJavaFile {
    public static void main(String[] args) {

     //   int maxValue = (int) Functions_7Kt.maxValue(89, 8467);    original name or customize file name
        int maxValue = (int) KotlinFile.maxValue(89, 8467);
        System.out.println("Max value : " + maxValue);


        //Default function --> in java default are not allow  -- > @JvmOverloads annotation can be used and it works. and if we send third value it will override  the default parameter
        KotlinFile.findVolume(10,888 ,90);

    }

    public static int MaxOfTwoValues(int i, int i1) {
        if(i > i1){
            return i;
        }else {
            return  i1;
        }
    }
}
