package com.java8.core.designMethods;

public class DesignMethod {

    public void junp() {}    // this is good

   // void public jump1() {}   This will not compille because the order of return type should be just before method name

    public static void jump2() {}   // the specifier static/final etc can come anywhere befoe the return type

    void jumo3() {}  // this wull compile the access modifire is default

    // public string void jump4() {}   // the return type cannot be string and void. you can have only one return type

    final static public void jump5() {} // theis is good becuse the optional specifier like final/static can be before
    // access modifier

   // String int public void jump6()  {}   This will noot compile because you are having multiple return type like
    // String/int/void
}
