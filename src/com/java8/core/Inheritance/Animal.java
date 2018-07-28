package com.java8.core.Inheritance;

public class Animal {

    private int age;
    private String name;
    private int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        System.out.println("Animal");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printDetals(){
        System.out.println("Animal age " + ' ' + age + "name " + ' ' + name + "weight " + ' ' + weight);
    }

    public int averageWeight(){

        return weight/2;
    }

}

