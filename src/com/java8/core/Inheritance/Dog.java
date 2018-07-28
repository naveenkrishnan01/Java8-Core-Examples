package com.java8.core.Inheritance;

public class Dog extends Animal {

    public Dog(int age, String name, int weight) {

        super(age, name, weight);  // In this case a  Animal super constructor is called behind the scene.
        System.out.println("Dog");
    }

    public static void main(String[] args) {

        Dog dog = new Dog(10, "Jerry", 50);
        dog.printDetals();
        dog.averageWeight();

    }
        @Override
        public int averageWeight () {
            System.out.println("average weight" + super.averageWeight());
            return super.averageWeight();

        }
    }
