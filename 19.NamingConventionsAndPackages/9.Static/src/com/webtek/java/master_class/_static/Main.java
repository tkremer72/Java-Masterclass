package com.webtek.java.master_class._static;

public class Main {
    //Create a field in this class
    public static int multiplier = 7;

    public static void main(String[] args) {

//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is Instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");//below uses the classname to access the method
//        System.out.println(secondInstance.getName() + " is Instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is Instance number " + StaticTest.getNumInstances());

        // java com.company._static.Main if we were running the code from the command line.
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }
    public static int multiply(int number) {
        return number * multiplier;
    }
}
