package com.java8.core.designMethods;

import java.util.Arrays;

public class MethodArguments {

    public void test(int num) {

    }

    public int add2(int num1, int num2) {
        return num1 + num2;
    }

    public double plusminus(int num2, int num3, int num4) {

        return (double) (num2 + num3 - num4);  // cating to doube for return type will work
    }

    // varargs
    public void person(String... name) {

    }

    public static void main(String[] args) {
        calc(1);
        calc (2, 15);
        calc(3, 5,6,7,9);
        calc( 4, new int[] {4,6,7,8,9});
       // calc(5, null);    get a null-pointr exception because we are trying to get num.length on a null

    }

    public static void calc(int start, int... num){
        System.out.println("START OF " + start + "calc numbers " +  num.length);

        run();
        run(12, 33, 77, 99, 101, 79);
    }

    public static void run (int... numbers){

        for(int num : numbers){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(numbers));
    }

}