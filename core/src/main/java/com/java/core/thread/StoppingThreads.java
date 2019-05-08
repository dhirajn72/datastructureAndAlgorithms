package com.java.core.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dhiraj
 * @date 01/05/19
 */
public class StoppingThreads {
    public static void main(String[] args) throws InterruptedException {
        Server server = new Server();
        Thread t1 = new Thread(server, "t1");
        Thread t2 = new Thread(server, "t2");
        Thread t3 = new Thread(server, "t3");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

        Thread.sleep(20);


    }
}


class Server implements Runnable {
    private volatile boolean flag;
    private volatile AtomicInteger atomicInteger = new AtomicInteger();

    public void stop() {
        flag = true;
    }

    @Override
    public void run() {
        while (!flag) {
            try {
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " stops !");
    }
}