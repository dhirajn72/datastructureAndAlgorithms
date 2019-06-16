package com.java.executors;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class Producer implements  Runnable {
    private ProducerConsumerDemo producerConsumerDemo;

    public Producer(ProducerConsumerDemo producerConsumerDemo) {
        this.producerConsumerDemo = producerConsumerDemo;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            producerConsumerDemo.producer(i);
    }
}
