package com.java8.core.Exceptions;

public class CatchWithReturn {

    public static int calculate(){

        try {

            int result = 10 / 0;
            return result;
        }
        catch (ArithmeticException e){
            System.out.println("catch first");
          //  System.exit(0);      this will stop all executionat jvm level, finally will not be executed.
            return 1;
        }
        finally {
            System.out.println("finally catch them");
          //  return 0;      // the finally retun is execute first then the catch return
        }

    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
