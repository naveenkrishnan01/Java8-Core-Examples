package com.java8.core.ClassDesign;
import java.util.*;


class  Dog {

    private String Color;

    public Dog(String Color) {
        this.Color = Color;
        System.out.println("Constructor" + "Dog Color" + " " + Color);

    }

    public void Cat(String Color){
        System.out.println("Cat Color" + " " + Color);

    }


}



public class ClassConstruct {


    public static void main(String[] args) {

        Dog dog = new Dog("Grey");
        dog.Cat("Black");

    }
}
