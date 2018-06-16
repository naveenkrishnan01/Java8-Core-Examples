package com.java8.core;

/**
 * 
 * @author Naveen Krishnan
 *  Java doc comment which is gnerated with slash and two asterix
 */
public class MainClass {

	/*
	 * There can only be one main method in a file which should have 
	 * correct sequence of void main. 
	 */
	public static void main(String[] args) {
		System.out.println("The args size" + args.length);

		
		// double scientific_number = 100.2545782E003;  // Scientific number has 'E' for ti to complle.
	       
	       double scientific1 = 5.00034E02;
	       double scientific2 = 5.00034E2;	
	       double scientific3 = 5.0015;
	       
	       double hexPI = 0x1.91eb839232fp1;  // p indicates hexadecimal flaoting point number
	       
	       System.out.println(scientific1 + " " + scientific2 + " " + scientific3);
		
	       System.out.println(hexPI);
		
	       char ch = 'a';
	       char ch1 = '\u0A97';  // unicode character 
	       char ch2 = '\u261c';
	       
	       System.out.println(ch + " " + ch1 + " " + ch2);
	    //   char ch1 = 'ab';  // char can only have one character
	       
	       
	}
	/**
	 *  java doc comment for methods
	 * @param a
	 * @param b
	 * @return
	 */
       public int sum (int a, int b) {
    	   return  a + b;
       }
       
       /* Decimal number compilation */
       
       float example = 12.55F;  /* default is double */
       
      // double before = 10_.25; // will not complie because underscore before decimal //
      //   double after = 10._30;   // no underscore after decimal
      //   double  first = _12.35     // no underscore in the begining
      //   double last = 12.45_ ;      // no underscore in the end
       
      
}

