package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 07/03/18
 */
public class Producer implements Runnable{
    private ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    public void run() {
        for(int i=1;i<=10;i++){
            producerConsumer.produce(i);
        }
    }
}
