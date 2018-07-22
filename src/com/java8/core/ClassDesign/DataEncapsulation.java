package com.java8.core.ClassDesign;
import java.util.*;


// POJO class - Plain old JAVA objects.. Data hiding and implementation
public class DataEncapsulation {

    private String name;
    private List<String> employee = new ArrayList<>();


    public String getName() {
          return name;
    }

    public void setName(String name){
        this.name = name;
        if (name == null){
            System.out.println("Null not allowed");
        }

    }

    public void addEmployee(String name){
        employee.add(name);

    }
    public void printData(){
        System.out.println("Employee" + ' ' + employee);
    }

    public void printAddName(){
        if (name != null) {
            System.out.println("Add Name" + ' ' + name);
        }
    }
}