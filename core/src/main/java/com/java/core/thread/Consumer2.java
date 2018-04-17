package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class Consumer2 implements  Runnable {
    private ProducerConsumer2 prducerConsumer2;

    public Consumer2(ProducerConsumer2 prducerConsumer2) {
        this.prducerConsumer2 = prducerConsumer2;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++)
            prducerConsumer2.consume();


    }
}
