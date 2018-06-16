package com.java8.core;

import java.util.Arrays;

public class WorkingWithArrays1 {

	public static void main(String[] args) {
		int [] test = new int[3];  // Array not initialized
		int [] test1 = new int[] {10, 15, 16};  // array that is initialized
		
		//double [] x = new double[2.5];  //size of array should be int
		
		double [] y = new double[10/2];   //this is fine
		double [] z = new double [7/3]; 
		
		int[] three = {5,7,15};  //anonymous array
		int[] four = {};  //initialize anonymous array

	    int [] id, type;  // will create two arrays
	    int id2 [], type2;   // bad practice, will create one array and one variable   
	    
	    String [] Mypets = {"cat", "dog", "rabbit"};
	    String [] Newpets = Mypets;
	    String [] AnotherPet = {"cat", "dog", "rabbit"};
	    
	    System.out.println(Mypets.equals(Newpets)); // true, same reference
	    System.out.println(Mypets == Newpets);  // true
	    System.out.println(Arrays.equals(Mypets, Newpets));  //true
	    
	    System.out.println(Mypets.equals(AnotherPet));  //false
	    System.out.println(Mypets == AnotherPet); // false
	    System.out.println(Arrays.equals(Mypets, AnotherPet)); // true because each element is checked against array 

	    System.out.println(Newpets);
	    System.out.println(Newpets.toString());
	    System.out.println(Arrays.toString(Newpets));
	    
	    String [] pets = {"cat", "dog", "parrot"};
	    System.out.println(pets[0]);
	    System.out.println(pets[2]);
	    
	    for (int i=0; i<pets.length; i++) {
	    	System.out.println(pets[i]);
	    	
	     Integer[] num =  new Integer[3];
	     for (int z1=0; z1 < num.length; z1++) {
	    	 System.out.println(num[z1]);
	    	 
	      Integer[] num1 =  new Integer[3];
	 	  for (Integer z2=0; z2 < num.length; z2++) {
	 		  System.out.println(num1[z2]);
	 	  }
	 	    	
	     }
	     
	    }
	}
		

	}


