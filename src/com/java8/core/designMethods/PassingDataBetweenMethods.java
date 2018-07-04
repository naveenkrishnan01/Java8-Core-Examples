package com.java8.core.designMethods;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {

        //java passes data between method as 'pass by value' which means it makes a copy and passes the value
        // In this case number is intialized as '5' and this gets passed around in the methods
        int number = 5;
        System.out.println("number1  " + number);
        getnumber(15);

        // prints 5, because the data in the methods is 'pass by value'
        System.out.println("number2  " + number);


        String name = "Jimmy";
        System.out.println("name " + name);
        getName("Roger");
        // pase by value, prints jimmy and not Roger
        System.out.println("name " + name);


        StringBuilder sf = new StringBuilder();
        sf.append("kapil");
        System.out.println("stringbuilder first " + sf);

        build(sf);
        System.out.println(sf);

    }

    public static void getnumber(int number) {

        // here it prints 10,because the number is within the scope of the method. It is not passed around
       number = 10;
        System.out.println(number);

    }

    public static void getName(String name){
        name = "john";
        //prints john and not Jimmy because it is variable within the method
        System.out.println("Inside String method " + name);

    }

    public static void build(StringBuilder s){
        s.append("max");

    }
}