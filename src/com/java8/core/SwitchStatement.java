package com.java8.core;

public class SwitchStatement {

	public static void main(String[] args) {
		
	//	my_loop:
	//		int [] myname = {1, 2, 3};   cannot intialize an array inside a label

		String [] animals1 = {"cat", "dog", "lizard", "elephant", "rabbit"};	 
		 my_continue:
			 for (String animal1 : animals1) {
				 if (animal1.equals("dog")){
					 continue my_continue;
				 }
				 System.out.println("example contine: " + animal1);
			 }							 
	          
	 

		my_label:
		{
		  int []  myArray = {1, 2, 3};	
		}
		 String [] animals = {"cat", "dog", "lizard"};
		 for (String animal : animals) {
			 System.out.println(animal);
		 }
		 MY_loop:{
			 for (String animal : animals) {
				 if (animal.equals("lizard")){
					break MY_loop; 
				 }
				 System.out.println("print MY_loop :" +  animal);
			 }
			 
			 
	}
}
}