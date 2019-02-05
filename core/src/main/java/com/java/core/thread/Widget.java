package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 19/01/19
 */
public class Widget {
    public synchronized  void doSomething(){
        System.out.println("Widget-doSomething()"+Thread.currentThread().getId());
    }

    public synchronized  void doSomethingMore(){
        System.out.println("Widget-doSomethingMore()"+Thread.currentThread().getId());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wokeup !");
    }
}
