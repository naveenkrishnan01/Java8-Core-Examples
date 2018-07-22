package com.java8.core.ClassDesign;


//this() and this are only used in construct
class Person{

    private String firstname;
    private String  lastname;

    public Person(String firstname){
        this("Roger", "tommy");  // chaining cosntruct  . First statement in a construct
       // this.firstname = firstname;

    }

    public Person(String firstname, String last){
       this.firstname = firstname;
       lastname = last;
    }

    public void printname(){
        System.out.println("firstname " + firstname + "last name" + lastname);
    }
}

public class ConstructorThis {

    public static void main(String[] args) {
        Person person1 = new Person("Tommy");
        person1.printname();

        Person person2 = new Person("Jessy", "Roger");
        person2.printname();

    }
}
