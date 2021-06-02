package com.webtek.java.master_class.concurrency.threads.producer_consumer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Create and run methods
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    //Read method used by the consumer to read a message
    public synchronized String read() {

        while (empty) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    //Write method used by the producer to write a message
    public synchronized void write(String message) {

        while (!empty) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty Sat On A Wall!",
                "Humpty Dumpty Had A Great Fall!",
                "All The Kings Horses And All The Kings Men,",
                "Couldn't Put Humpty Together Again!"
        };
        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ie) {

            }
        }
        message.write("Finished!");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished!");
             latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ie) {

            }
        }
    }
}