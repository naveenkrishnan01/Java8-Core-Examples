package com.java8.core.Algorithm;


public class ReverseString {


    public static void main(String[] args) {

        //string = 'salty'
        // i = length-1, i =0, --i

        String s = "salty";
        char[] arrays = s.toCharArray();

        for (int j = s.length(); j>0 ; --j) {
            System.out.println(arrays[j-1]);

         //   }
        }
    }

}



