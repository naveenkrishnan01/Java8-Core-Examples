package com.java8.core.Exceptions;

public class HandleException {

    public static void main(String[] args) {

     //   mymethods();    since this is an exception method it fails to compile
         anothermethod();  // this method may or maynot be handled for exception because it is runtime
    }

    public static void mymethods() throws Exception{   //  we are expecting an exception
          throw new Exception("loading the method exception");   // this is a new exception thrown
    }

    public static void anothermethod() throws RuntimeException{   // run time exception
        throw new RuntimeException("throws parameter exception");
    }
}
