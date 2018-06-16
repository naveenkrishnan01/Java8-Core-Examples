package com.java8.core;

// Remember the order as PIC  - Package /Import / Class
// public class AnotherClass {}  - You can have only one public class in a java file
class AnotherClass {}      // You can have as many classes as you need which is not public
public class VariableScope {

	static int globalvariable = 10;
	
	public static void main(String[] args) {
	   
		 final int localvariable = 5;
		 
		 {
			 final int inside_variable = 15;
			 System.out.println("Inside variabble " +  + inside_variable );
			 System.out.println("local variable " + " " + localvariable);
		 }
		 int inside_variable = 15;
		  System.out.println("otherVairbale " + " " + inside_variable);
		  System.out.println("Global Variable " + " " + globalvariable);

	}

}
