package com.java8.core;
import java.util.*;

public class IteratingList {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        // for loop is good to use when we need index
        for(int i = 0;  i < numbers.size(); i++) {
            System.out.println("for index in list " + i + "  the number is  " + numbers.get(i));
            //  numbers.remove(2);    indexout of bound exception
        }

        // for basic iteration for each loop is the best option
            for (Integer number : numbers)
                  {
              System.out.println("numbers" + number);
          //    numbers.remove(2);   concurrent modification exception is thrown when trying to modify  element thru for and foreach loop in a list
            }

            // Iterator has limited option like hasnext(), next() and remove()
            for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
            iterator.next();
            System.out.println(numbers);
            iterator.remove();
            }
             System.out.println(numbers);

        numbers.addAll(Arrays.asList(1,2,3,4,5,6));

        // List iterator has more options than iterator . If you want to move forward, backward
        // you can use listiterator. It has other option like set elements, remove elements etc.
        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();){
         System.out.println(listIterator.previous());
         listIterator.remove();;

        }
        System.out.println(numbers);
    }
}
