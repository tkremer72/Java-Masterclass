package com.webtek.java.master_class.basic_input_output.concurrency;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from AnotherThread!");
    }
}
