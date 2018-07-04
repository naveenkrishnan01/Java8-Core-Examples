package com.java8.core.Algorithm;

public class BubbleSort {

    // Bubble sort you compatre the first element to next element
    // if the first element is greater than next element, then next element is moved to temp variable
    //  the temp variable is noved to first element and the bigger element is moved to the next element
    // This iteration contines until the array.length -index

    public static void main(String[] args) {

        int [] array1 = {3, 15, 7, 9, 20, 16};
        // Bubble sort
        for (int i=0; i < array1.length; i++ ){    // array1.length = 6
            for (int j=1; j < array1.length-i;  j++){    //array1.length-i = 6 - 1 =  5  for i =1
                                                         //  6-2 = 4    for  i =2...  6-5 for i = 5
                if (array1[j-1]> array1[j]){
                    int temp = array1[j-1];
                    array1[j-1] =  array1[j];
                    array1[j] = temp;
                }

            }
            System.out.println(array1[i]);
        }
    }
}


