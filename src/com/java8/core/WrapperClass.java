package com.java8.core;

public class WrapperClass {

	public static void main(String[] args) {
		int MyInt = 20;
		Integer myInteger = new Integer(10);
		Integer myInteger2 = 20;
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;
        
		System.out.println("MyInteger " + myInteger);
		System.out.println("MyInteger2 " + myInteger2);
		System.out.println("MyInteger3 " + myInteger3);
		System.out.println("MyInteger4 " + myInteger4);
		System.out.println("MyInteger5 " + myInteger5);
	
		// converting wrapper to primitive -> unboxing
		int myint3 = myInteger3;
	//	int myint4 = myInteger5;
	//	System.out.println("Nullpointer :" + myint4); throws nullpointer 
		
		// boxing -> converting primitive to wrapper
		Integer myInteger6 = new Integer(10);
	}

}
