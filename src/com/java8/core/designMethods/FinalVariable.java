package com.java8.core.designMethods;

import java.util.*;

public class FinalVariable {

    private static final int SIZE = 10;   // final are CONSTANTS , cannot be changed
    private final  static double COUNT = 5.0;
    public final int MAX = 15;

    private static final List<String>  VALUES = new ArrayList<>();

    public static void main(String[] args) {

        int [] myArray = new  int[SIZE];

        for (int i=0; i < SIZE; i++){
            System.out.println(myArray[i]);
        }
     //   COUNT = COUNT + 1;  cannot assign a value to final
          VALUES.add("changed");  // so you can add a method of final variable
          VALUES.remove(0);  // you can use remove method to finalv variable

    }

}
