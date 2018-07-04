package com.java8.core.designMethods;

public class Static {

    private String  name = "Mark";

    public static void one() {};
    public static void two() {};

    public static void three(){
        one();
        two();
    //    four();    // a static method cannot call a non-statci method
        Static myInstance = new Static();   // so to call static  method in non-static method we should instiantiate
        myInstance.four();    // the class to call the mon-static method

         new Static().four();   // this also works for instantiation.

    }

   public void four() {  // a non-static method can call a static method
        one();
        two();
        three();
        System.out.println(name);
   }
}
