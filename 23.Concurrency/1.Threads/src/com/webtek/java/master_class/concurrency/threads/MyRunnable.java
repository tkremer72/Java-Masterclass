package com.webtek.java.master_class.concurrency.threads;

import static com.webtek.java.master_class.concurrency.threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run!");
    }
}
