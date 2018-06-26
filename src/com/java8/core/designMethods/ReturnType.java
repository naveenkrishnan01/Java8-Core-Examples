package com.java8.core.designMethods;

public class ReturnType {


    public void person() {}

    public void person1() {
        return ;     // redudant return statement for void
    }

    String person3() {
        return "";       // returns empty string
    }

    String person6(int b){

        if (b==5){
            return "";  // this return may or maynot execute based on the condition.
        }
        return "";   // This return is mandatory
    }

    int person9() {
        return 10;
    }

    int person10() {
      //  return 9L;  not compile because long cannot be retuned to int
        return (int)10L;  //int can be casted to long and returned
    }

    boolean person11(){
        return (10 > 5);  // an expression which results in true or false can be =rturned.
    }
}
