package com.webtek.java.master_class.concurrency.threads;

import java.io.IOException;

import static com.webtek.java.master_class.concurrency.threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the Main Thread!");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        //invoke the AnotherThread run method
        anotherThread.start();
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the Anonymous Class Thread!");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run!");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I am running again!");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted!");
                }
            }
        });
        myRunnableThread.start();
        //anotherThread.interrupt();
        System.out.println(ANSI_PURPLE + "Hello again, from the Main Thread.");

    }
}
