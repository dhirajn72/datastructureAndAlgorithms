package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 01/05/19
 */
public class JoiningThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Starts");
        Thread t1 = new Thread(() -> {

            try {
                System.out.println("Thread-1");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {

            try {
                System.out.println("Thread-2");
                Thread.sleep(2000);
                throw new InterruptedException();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        });
        Thread t3 = new Thread(() -> {
            try {
                System.out.println("Thread-3");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println(Thread.currentThread().getName() + " Terminates");
    }
}
/*
main starts
Thread-1
Thread-2
Thread-3
main terminates


 */