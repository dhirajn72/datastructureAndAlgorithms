package com.java.executors;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue linkedBlockingQueue= new LinkedBlockingQueue();
        Producer_1 producer= new Producer_1(linkedBlockingQueue);
        Consumer_1 consumer= new Consumer_1(linkedBlockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}


class Producer_1 implements Runnable{
    private LinkedBlockingQueue linkedBlockingQueue;
    public Producer_1( LinkedBlockingQueue linkedBlockingQueue){
        this.linkedBlockingQueue=linkedBlockingQueue;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            linkedBlockingQueue.add(i);
            System.out.println("Produced::"+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }
}


class Consumer_1 implements Runnable{

    private LinkedBlockingQueue linkedBlockingQueue;
    private boolean flag=true;

    public Consumer_1(LinkedBlockingQueue linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (flag){
            try {
                System.out.println("Consumed::"+linkedBlockingQueue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}