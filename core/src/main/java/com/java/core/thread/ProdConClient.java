package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 07/03/18
 */
public class ProdConClient {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer= new ProducerConsumer();
        new Thread(new Producer(producerConsumer)).start();
        new Thread(new Consumer(producerConsumer)).start();
    }
}
