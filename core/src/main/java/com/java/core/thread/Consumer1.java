package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class Consumer1 implements  Runnable {
    private ProducerConsumer1 producerConsumer1;

    public Consumer1(ProducerConsumer1 producerConsumer1) {
        this.producerConsumer1 = producerConsumer1;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            producerConsumer1.consume();
        }
    }

    public ProducerConsumer1 getProducerConsumer1() {
        return producerConsumer1;
    }

    public void setProducerConsumer1(ProducerConsumer1 producerConsumer1) {
        this.producerConsumer1 = producerConsumer1;
    }
}
