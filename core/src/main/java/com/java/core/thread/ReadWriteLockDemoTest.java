package com.java.core.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * @author Dhiraj
 * @date 03/05/19
 */
public class ReadWriteLockDemoTest {

    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static String number = "0";

    public static void main(String[] args) throws InterruptedException {
        Thread read = new Thread(new Read(), "Read");
        Thread even = new Thread(new WriteEven(), "WriteEven");
        Thread odd = new Thread(new WriteOdd(), "WriteOdd");

        read.start();
        even.start();
        odd.start();


        /*even.join();
        odd.join();
        read.join();*/



    }

    static class Read implements Runnable {
        @Override
        public void run() {
            readWriteLock.readLock().lock();
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " is reading -> " + number);
                }
            } finally {
                readWriteLock.readLock().unlock();
            }
        }
    }

    static class WriteEven implements Runnable {
        @Override
        public void run() {
            try {
                readWriteLock.writeLock().lock();
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println(Thread.currentThread().getName() + " is writing -> " + number);
                    number += " " + i;
                }
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }
    }

    static class WriteOdd implements Runnable {
        @Override
        public void run() {
            try {
                readWriteLock.writeLock().lock();
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println(Thread.currentThread().getName() + " is writing -> " + number);
                    number += " " + i;
                    //System.out.println(Thread.currentThread().getName() + " is writing -> " + number);
                }
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }
    }
}

