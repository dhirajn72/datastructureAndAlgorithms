package com.java.core.clients;

import com.java.core.thread.Thread1;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        Thread1 thread1=new Thread1();

        Thread t1=new Thread(thread1,"T1");
        Thread t2= new Thread(thread1,"T2");
        Thread t3= new Thread(thread1,"T3");

        t1.start();
        t2.start();
        t3.start();

        t2.join();
        t3.join();
        //t1.join();

        System.out.println(Thread.holdsLock(t2));
        System.out.println("main ends");
    }
}