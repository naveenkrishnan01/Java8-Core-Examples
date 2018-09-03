package com.java8.core.Exceptions;



class Higherclass extends RuntimeException{

}

class Subclass extends Higherclass{

};

public class OrderOfException {

    public static void randomnumber(){

        boolean b = Math.random() < 0.5;

        if (b) {
            throw new Subclass();
        }
        throw new Higherclass();


    }

    public static void main(String[] args) {
        try {
            randomnumber();
        } catch(Subclass e){
            System.out.println("Catch subclass first");  // sub class should be first
        } catch(Higherclass ef) {
           System.out.println("Catch Superclass");  // super class should be after sub class
        }
    }
}
