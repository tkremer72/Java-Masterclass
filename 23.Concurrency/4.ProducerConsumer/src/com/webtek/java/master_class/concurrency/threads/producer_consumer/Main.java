package com.webtek.java.master_class.concurrency.threads.producer_consumer;

//import java.util.ArrayList;
//import java.util.List;

import java.util.Random;
import java.util.concurrent.*;
//import java.util.concurrent.locks.ReentrantLock;

import static com.webtek.java.master_class.concurrency.threads.producer_consumer.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        //List<String> buffer = new ArrayList<>();
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);

        //ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_WHITE + "I'm being printed from the callable class!");
                return "This is the callable result!";
            }
        });
        try {
            System.out.println(future.get());
        } catch (ExecutionException ee) {
            System.out.println("Something went wrong!");
        } catch (InterruptedException ie) {
            System.out.println("The thread running the task was interrupted!");
        }
        executorService.shutdown();


    }
}

class MyProducer implements Runnable {
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    //private final ReentrantLock bufferLock;

    //public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
        // this.bufferLock = bufferLock;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
                //bufferLock.lock();
//                try {
//                    buffer.add(num);
//                } finally {
//                    //bufferLock.unlock();
//                }

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException ie) {
                System.out.println("Producer was interrupted!");
            }
        }
        System.out.println(color + "Adding EOF and exiting...");
        // bufferLock.lock();
        try {
            //buffer.add("EOF");
            buffer.put("EOF");
        } catch (InterruptedException ie) {
            //finally {
        }
        //  bufferLock.unlock();
        //}
    }
}

class MyConsumer implements Runnable {
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    //private final ReentrantLock bufferLock;

    //public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
        //this.bufferLock = bufferLock;
    }

    public void run() {
        // int counter = 0;
        while (true) {
            synchronized (buffer) {
                // if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
//                    System.out.println(color + "The counter = " + counter);
//                    counter = 0;
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting...");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }
                } catch (InterruptedException ie) {

                }
                //finally {
                //bufferLock.unlock();
                //}
//            } else {
//                counter++;
//            }
            }
        }
    }
}