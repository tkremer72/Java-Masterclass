package com.webtek.java.master_class._final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "thomas";//called last
        System.out.println("SIBTest static initialization block called!");//called second
    }
    public SIBTest() {
        System.out.println("SIB constructor called!");//called fourth
    }
    static {
        System.out.println("Second initialization block called!");//called third
    }

    public void someMethod() {
        System.out.println("someMethod called!");//called fifth
    }

}
