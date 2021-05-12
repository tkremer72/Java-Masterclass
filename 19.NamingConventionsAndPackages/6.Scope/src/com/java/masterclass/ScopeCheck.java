package com.java.masterclass;

public class ScopeCheck {
    //Fields and variables declared here can be called using the this keyword later in the code.

    //Declare variables or fields
    public int publicVar = 0;
    private int varOne = 1;

    //Constructor, initialize variables or fields here
    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar from ScopeCheck Constructor = " + publicVar + ": varOne from ScopeCheck constructor = " + varOne);
    }
    //Getter to retrieve the privateVar
    public int getVarOne() {
        return varOne;
    }
    //Create a method that loops through numbers 1-10 and multiplies them by two.
    public void timesTwo() {//method to multiply numbers by 2
        int varTwo = 2;
        for(int i = 0; i < 10; i++) {
//If I wanted to use the original variable varTwo with a value of 1 and the new one below, I could reference it with
//the this keyword by calling it like so this.varTwo.
            System.out.println(i + " x " + varTwo + " = " + i * varTwo);
        }
        //System.out.println("Value of i is now " + i);//there is an error here because the scope of i is only in the for loop
        //therefore i can't be accessed outside of the for loop.
    }
    //method to check visibility of a class from inside another class
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    //Create an inner class
    public class InnerClass {
        //Declare fields or variables
        private int varThree = 3;
        //Constructor to initialize fields or variables.
        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }
        //Define a method within the inner class
        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " x " + varThree + " = " + i * varThree);//will default to this inner classes variable declaration
            //for the inner class you can no longer use just the this.privateVar call, you must use
            //ScopeCheck.this.privateVar
            }
        }
    }


}
