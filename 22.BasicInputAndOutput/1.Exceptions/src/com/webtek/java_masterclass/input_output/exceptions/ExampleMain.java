package com.webtek.java_masterclass.input_output.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExampleMain {

    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        } catch(ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to preform division, autopilot shutting down.");
        }
    }

    private static int divide() {
        int x, y;

     //   try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x +" y is " + y);
            return x / y;
//        } catch(NoSuchElementException e) {
//            throw new NoSuchElementException("No suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by zero!");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                //Go around again.  Read past the end of line in the input first.
                s.nextLine();
                System.out.println("Please enter an integer 0-9");
            }
        }
    }

}
