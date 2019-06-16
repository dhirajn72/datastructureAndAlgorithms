package com.java.executors;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class Consumer implements Runnable {
    private ProducerConsumerDemo producerConsumerDemo;

    public Consumer(ProducerConsumerDemo producerConsumerDemo){
        this.producerConsumerDemo=producerConsumerDemo;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            producerConsumerDemo.consumer();
    }
}
