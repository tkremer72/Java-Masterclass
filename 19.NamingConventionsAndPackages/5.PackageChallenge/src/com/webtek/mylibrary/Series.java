package com.webtek.mylibrary;

public class Series {

    //Create three methods as described in the challenge

    //Method 1, return the sum of all numbers from 0 to n
    public static long nSum(int n) {
        return (n *( n+1))/2;
    }

    //Method 2, return the product of all numbers from 1 to n
    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        long factor = 1;
        for(int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    //Method 3, returns the nth fibonacci number
    public static long fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;

        for(int i = 1; i < n; i++) {
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
