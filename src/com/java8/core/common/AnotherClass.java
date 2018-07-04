package com.java8.core.common;

public class AnotherClass {



    public static void main(String[] args) {
        CommonClass another = new CommonClass();
        another.publicaccess();
        another.protectedaccess();
        another.defaultaccess();
        // private modifier will not be seen in this case

        System.out.println(another.publicnumber);
        System.out.println(another.preotectednumber);
        System.out.println(another.defaultnumber);
        // private instance variable is not expose because it is nother package

    }
}
