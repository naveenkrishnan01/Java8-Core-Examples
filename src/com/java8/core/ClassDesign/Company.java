package com.java8.core.ClassDesign;

public class Company {


    public static void main(String[] args) {

        DataEncapsulation data = new DataEncapsulation();
        data.addEmployee("John");
        data.addEmployee("Robert");

        data.printData();

        data.setName("Roger");
        data.printAddName();

        data.setName(null);
        data.setName("Kats");

        data.getName();
        data.printAddName();
    }

}
