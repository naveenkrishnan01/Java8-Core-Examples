package com.java8.core;
import java.util.*;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		List<String> pets = new ArrayList <>();
		
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		
		if (pets.isEmpty()) {
		System.out.println("empty");
		}
		
		if (pets.size()==0) {
		System.out.println("is zero");
		
		}	
		pets.add("dog");
		System.out.println(pets.isEmpty());   // false
		System.out.println(pets.size());  // 1
		
		// clears the element in the list
		pets.clear();
		System.out.println(pets.isEmpty());   // true
		System.out.println(pets.size());  // 0
		pets.add("Dog");
		
	    List<String> newpets = new ArrayList<>();
	    newpets.add("Dog");
	    System.out.println(pets.equals(newpets));  // the first element are the same in both
	    pets.add(0, "cat");
	    newpets.add(1, "cat");
	    System.out.println(pets);
		System.out.println(newpets);
		
		// the sequence of the element should be in the same order.
		System.out.println(pets.equals(newpets)); // false
}
	
}