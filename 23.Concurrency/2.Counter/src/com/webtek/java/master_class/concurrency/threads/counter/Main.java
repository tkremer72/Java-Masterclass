package com.webtek.java.master_class.concurrency.threads.counter;

public class Main {

    public static void main(String[] args) {
        Countdown thread1Countdown = new Countdown();
        Countdown thread2Countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(thread1Countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(thread2Countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }

    static class Countdown {
        public int i;

        public void doCountdown() {
            String color;

            switch (Thread.currentThread().getName()) {
                case "Thread 1":
                    color = ThreadColor.ANSI_CYAN;
                    break;
                case "Thread 2":
                    color = ThreadColor.ANSI_PURPLE;
                    break;
                default:
                    color = ThreadColor.ANSI_GREEN;
            }
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }

    static class CountdownThread extends Thread {
        private final Countdown threadCountdown;

        public CountdownThread(Countdown countdown) {
            threadCountdown = countdown;
        }

        public void run() {
            threadCountdown.doCountdown();
        }
    }
}
