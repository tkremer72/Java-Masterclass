package com.example.test;

import com.webtek.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        //nSum method call
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*******************************");//Break up the sections

        //factorial method call
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("******************************");
        //fibonacci method call
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}