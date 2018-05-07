package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Producer3 implements  Runnable{
    private ProducerConsumer3  producerConsumer3;


    public Producer3(ProducerConsumer3 producerConsumer3) {
        this.producerConsumer3 = producerConsumer3;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            producerConsumer3.produce(i);
        }
    }
}
