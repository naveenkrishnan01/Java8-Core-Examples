package com.java8.core.common;

public class CommonClass {


    public int publicnumber = 10;
    protected int preotectednumber = 20;
    int defaultnumber = 30;
    private int privatenumber = 40;


    public void publicaccess() {
          System.out.println("public access");
      }

      protected void protectedaccess() {
          System.out.println("protected access");
    }

       void defaultaccess() {
          System.out.println("default access");
       }

       private void privateaccess() {
          System.out.println("provate access");
       }

    public static void main(String[] args) {
        CommonClass common = new CommonClass();
        common.publicaccess();
        common.protectedaccess();
        common.defaultaccess();
        common.defaultaccess();

        System.out.println("publicnumber " +  common.publicnumber);
        System.out.println("protected number " + common.preotectednumber);
        System.out.println("default number " + common.defaultnumber);
        System.out.println("private number" + common.privatenumber);

    }
}
