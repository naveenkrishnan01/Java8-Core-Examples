package com.java8.core.designMethods;

public class ReturningDataFromMethods {


    public static void main(String[] args) {

        int number = 4;
        String word = "abc";

        System.out.println(number);  // 4, in this case it return the copy, pass by value
        System.out.println(word);   //  abc, in this case return the copy, pass by value

        number = number(number);
        word = word(word);

        System.out.println(number);  // 5, here this case it get re-assigned, so the increment value is pronted
        System.out.println(word);  // abcx, the case is re-assigned, so the appended value os printed.
    }

    public static int number(int number){
        number ++;
        return number;

    }

    public static String word(String word){

        word += "x";
        return word;
    }
}
