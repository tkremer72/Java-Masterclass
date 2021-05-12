package com.java.masterclass;

import java.util.Scanner;

public class X {//create a class called X
    //create a field called x
    private int x;
    //initialize x with the constructor
    public X(Scanner x) {//Accept the scanner as a parameter
        System.out.println("Please enter a number: "); //What to ask the user to get input
        this.x = x.nextInt(); //x = whatever the user enters.
    }

    //Function for times table
    public void x() {
        for(int x = 1; x < 13; x++) {
            System.out.println(x + " x " + this.x + " = " + (x * this.x));
        }
    }


}
