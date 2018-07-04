package com.java8.core.designMethods;

import com.java8.core.common.CommonClass;

public class UsngAccessModifier {


    public static void main(String[] args) {
        CommonClass commonclass = new CommonClass();
        commonclass.publicaccess();

        // Since it another package the only access is publc and not to protected/default/private.

       System.out.println(commonclass.publicnumber);

       // only publicnumber is exposed because it is anotehr package.
    }

}
