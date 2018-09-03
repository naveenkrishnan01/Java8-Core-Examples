package com.java8.core.AbstractClass;

 public abstract class Reptiles {


      protected void scales() {    // protected access
         System.out.println("REPtiles can have scales");
     }

     public int reptileWeight(int weight){
         return weight;
     }

     double length(){   // default access
          return 20.0;
     }

     private void color(){    // private access

     }
}
