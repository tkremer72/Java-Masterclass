package com.webtek.java.master_class.concurrency.threads.producer_consumer;

public class Main {

    public static void main(String[] args) {

    }
}

class Message {
    private String message;
    private boolean empty = true;

    //Read method used by the consumer to read a message
    public synchronized String read() {
        while(empty) {

        }
        empty = true;
        return message;
    }
    //Write method used by the producer to write a message
    public synchronized void write(String message) {
        while(!empty) {

        }
        empty = false;
        this.message = message;
    }
}
