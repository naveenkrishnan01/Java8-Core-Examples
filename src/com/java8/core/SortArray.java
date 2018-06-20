package com.java8.core;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int [] num = {4, 2, 15, 1};

		Arrays.sort(num);
		
		for (int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(Arrays.toString(num));
	

	  String [] str = {"5", "400", "9"};
	  
	  for (int i =0; i < str.length; i++) {
		  System.out.println(str[i]);   // output = 5 , 400, 9.  It does not srrt as expected because
		  // for string it is sorted in alphabetical order
	  }
	}		  
}
