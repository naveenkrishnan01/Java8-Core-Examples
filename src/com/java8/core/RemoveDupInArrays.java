package com.java8.core;
import java.util.Collection.*;

public class RemoveDupInArrays {

    public static void main(String[] args) {

        int[] s = {4, 3, 11, 7, 7, 7, 17, 1};
        // 4 > 3, temp = 3

        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] > s[i + 1]) {
                int temp = s[i + 1];
                s[i + 1] = s[i];
                s[i] = temp;
                System.out.println(temp);
            } else if (s[i] == s[i + 1]) {
                break;

            }


        }
    }
}
