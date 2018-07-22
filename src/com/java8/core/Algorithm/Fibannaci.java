package com.java8.core.Algorithm;

public class Fibannaci {


    public static void main(String[] args) {


        // Fibanacci series = 1,2,3,5,8,13,21,34,55
         int n1 =0;
         int n2=1;

       //  System.out.println(n1 + ' ' + n2);

        for(int i=0; i <= 10; ++i ){

            int  n3 = n1 + n2;  //  3
            System.out.println(n3);

            n1 = n2;
            n2 = n3;


        }


    }
}
