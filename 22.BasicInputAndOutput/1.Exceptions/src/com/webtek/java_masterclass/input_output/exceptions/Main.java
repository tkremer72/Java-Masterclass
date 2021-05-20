package com.webtek.java_masterclass.input_output.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int x = 98;
//        int y = 0;
//
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEFAP(x, y));
//        //System.out.println(divide(x, y));

//        int x = getInt();

        int x = getIntEAFP();
        System.out.println("The user entered the number 2" + x);


    }

    //    private static int getInt() {//no validation
//        Scanner s = new Scanner(System.in);
//        return s.nextInt();
//    }
    //look before you leap with validation
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer: ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    //Easy to ask for permission with validation
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }


    //Look before you leap method below
    public static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    //Easy to ask for permission
    public static int divideEFAP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }


}
