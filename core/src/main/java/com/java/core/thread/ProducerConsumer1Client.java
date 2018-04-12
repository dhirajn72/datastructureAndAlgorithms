package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class ProducerConsumer1Client {
    public static void main(String[] args) {
        ProducerConsumer1 producerConsumer1= new ProducerConsumer1();
        new Thread(new Producer1(producerConsumer1)).start();
        new Thread(new Consumer1(producerConsumer1)).start();
    }
}
