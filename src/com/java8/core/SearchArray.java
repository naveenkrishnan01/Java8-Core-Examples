package com.java8.core;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {
	
		int [] num = {1, 4, 5, 7, 9 };

		System.out.println(Arrays.binarySearch(num, 2));
		System.out.println(Arrays.binarySearch(num, 4));
		System.out.println(Arrays.binarySearch(num, 3));
		System.out.println(Arrays.binarySearch(num, 5));
		System.out.println(Arrays.binarySearch(num, 7));
		System.out.println(Arrays.binarySearch(num, 8));
		System.out.println(Arrays.binarySearch(num, 9));
		
		
		int [] notsorted = {6, 5, 1, 10};
		
		// if not sorted you get unpredictable result
		System.out.println(Arrays.binarySearch(notsorted, 5));
		System.out.println(Arrays.binarySearch(notsorted, 6));
		
	}

}
