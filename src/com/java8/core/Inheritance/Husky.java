package com.java8.core.Inheritance;

public class Husky extends Dog {

    public Husky(int age, String name, int weight){
        super(age, name, weight);  // Behind the scene a super constructor is called. In this case it is Dog

        System.out.println("Husky");
    }
}
