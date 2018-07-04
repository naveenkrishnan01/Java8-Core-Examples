package com.java8.core.designMethods;


// Rules of overloaded method - This is the sequence in wich overlaoded methods rules is applied
// 1) Exact match by type        public void jump(int a, int b) {}
//  2) Larger primitive type     public void jumpp (long a, long b) {}
//  3) Autoboxed type            public void jump (Integer a, Integer b) {}
//  4) Varargs                   public void jump (int... number) {}
public class OverLoadedMethods {

    // The types in the arument should be different with the same method name
      public void walk (int miles){}

      public void walk(short feet0) {}

      // return type for overloaded method can be diferent
      public boolean walk() {
          return false;
      }

      public void  walk(float miles) {}
   //   public void walk (float km) {}  will not compile because float type already declared above

    public void walk(int[] length){}
 //   public void walk (int... length){}   will not compile because varargs are arrayks and is defined above


    public static void main(String[] args) {

    }
}
