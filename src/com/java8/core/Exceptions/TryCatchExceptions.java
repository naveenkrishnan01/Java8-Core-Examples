package com.java8.core.Exceptions;

public class TryCatchExceptions {

    public static void main(String[] args) {

        try {
            dividemethod(10, 2);
            System.out.println("divide worked");
        } catch (ArithmeticException e){
          //  e.printStackTrace();
            System.out.println("Aritmentic error" + e.getMessage());

        }
    }

    public static int dividemethod(int a, int b){
        return a/b;
    }

}
