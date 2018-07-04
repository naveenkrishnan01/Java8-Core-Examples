package com.java8.core.Algorithm;

public class SelectionSort {

    // int a[] = { 15, 30, 16, 25, 11}
    // find the lowest element in a [0.. 4]
    // int a[] = { 11, 15, 30, 16, 25}

    // find  the lowest element in [1..4]
    // int a[] = {11, 15, 30, 16, 25]

    // find the lowest elemnt in (2..4)
    // int [] a = {11, 15, 16, 25, 30}

    // find the lowest slement in (3..4)
    // int [] a = {11, 15, 16, 25, 30}


    public static void main (String [] args){

        int [] array_sel = {15, 30, 37, 25, 11};


        for (int i=0; i < array_sel.length;  i ++){
            // find the lowest element
            int lowest = i;
          for (int j=i+1; j < array_sel.length; j++ )  {

              // check if the element is less than lowest
                 if (array_sel[j] < array_sel[lowest])   {
                     lowest = j;   // if true assign current element to the lowwet

                     // now move the lowest to the first element
                     int temp = array_sel[lowest];
                     array_sel[lowest] = array_sel[i];
                     array_sel[i] = temp;
                 }

          }
            System.out.println(array_sel[i]);
        }


    }
}
