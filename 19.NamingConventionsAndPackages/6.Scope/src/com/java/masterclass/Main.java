package com.java.masterclass;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        //System.out.println("varThree is not accessable here " + innerClass.varThree);


//        System.out.println("scopeInstance varOne ScopeCheck getter is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        System.out.println("---------------------------------");
//
//        scopeInstance.timesTwo();
//        System.out.println("---------------------------------");
//        //Create an instance of the inner class
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
