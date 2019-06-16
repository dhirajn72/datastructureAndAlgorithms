package com.java.core.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dhiraj
 * @date 03/06/19
 */
public class ProducerConsumerWithBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue sharedQ= new LinkedBlockingQueue();
        Producer_1 producer= new Producer_1(sharedQ);
        Consumer_1 consumer= new Consumer_1(sharedQ);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}


class Producer_1 implements Runnable{
    private LinkedBlockingQueue sharedQ;

    public Producer_1(LinkedBlockingQueue sharedQ) {
        this.sharedQ = sharedQ;
    }
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                sharedQ.put(i);
                System.out.println("Produced:"+i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer_1 implements Runnable{
    private LinkedBlockingQueue sharedQ;

    public Consumer_1(LinkedBlockingQueue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Consumed:"+sharedQ.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}