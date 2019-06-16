package com.java.executors;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class ProducerConsumerDemo {

    private int data;
    private boolean flag;
    public synchronized void producer(int data) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("Produced::" + this.data);
        flag = true;
        notify();
    }
    public synchronized void consumer() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        this.data = data;
        System.out.println("Consumed::" + this.data--);
        flag = false;
        notify();
    }
}
