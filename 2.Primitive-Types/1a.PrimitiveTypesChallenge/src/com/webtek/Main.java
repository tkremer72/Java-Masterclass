//package com.webtek;

public class Main {

public static void main(String[] args) {
//Challenge - Create some variables - byte set to any valid byte number
    //create a short variable set to any valid short number, create an int
    //variable set to any valid int number.  Lastly create a long and make
    //it equal to 50000 plus 10 times the sum of the byte plus the short plus
    //the integer values.
    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 50;

    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
    System.out.println("The long total for this challenge is = " + longTotal);

    short shortTotal = (short)(1000 + 10 *
            (byteValue + shortValue + intValue));
    
}
}
