package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class ProducerConsumerClient2 {
    public static void main(String[] args) {
        ProducerConsumer2 prducerConsumer2= new ProducerConsumer2();
        new Thread(new Producer2(prducerConsumer2)).start();
        new Thread(new Consumer2(prducerConsumer2)).start();
    }
}
