package com.java.executors;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class TestClass {
    public static void main(String[] args) {
        ProducerConsumerDemo producerConsumerDemo= new ProducerConsumerDemo();
        new Thread(new Producer(producerConsumerDemo)).start();
        new Thread(new Consumer(producerConsumerDemo)).start();
    }
}
