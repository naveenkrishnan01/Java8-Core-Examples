package com.java8.core.designMethods;
import java.util.List;
import java.util.ArrayList;

public class StaticVariables {

    private static final int SIZE;
    private static int  COUNT;

    private static  final  int one;
    private static final  double two;
    private static int three = 3;

    private static final List <String> NAME = new ArrayList<>();

    // when prorogram s run form the main method the class will load the static variable firts before executing the methods.
    //  The static variables are loaded in sequence
    static {
        System.out.println("first static initalization");
        SIZE=10;
        one = 5;

    }

    static {
        System.out.println("second static initalization");
        two = 50.0;
        System.out.println(two);
    }

    public static void main(String[] args) {
        NAME.add("Jimmy");
        NAME.add("costa");

        System.out.println(NAME);
    }
}
