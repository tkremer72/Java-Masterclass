package com.webtek.java.master_class.basic_input_output.concurrency;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the Main Thread!");
        Thread anotherThread = new AnotherThread();

        //invoke the AnotherThread run method
        anotherThread.start();

        System.out.println("Hello again, from the Main Thread.");


    }
}
