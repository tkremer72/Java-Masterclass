package com.webtek.java.master_class._final;

public class Main {

    public static void main(String[] args) {

//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9733);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);

        System.out.println("Main method called!");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
