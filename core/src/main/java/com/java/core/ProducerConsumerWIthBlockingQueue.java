package com.java.core;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class ProducerConsumerWIthBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> sharedQ= new LinkedBlockingQueue<>();
        new Thread(new Producer_1(sharedQ)).start();
        new Thread(new Consumer_1(sharedQ)).start();


    }
}
class Producer_1 implements Runnable {
    private final LinkedBlockingQueue<Integer> sharedQ;

    public Producer_1(LinkedBlockingQueue<Integer> integers) {
        this.sharedQ = integers;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Produced::" + i);
                sharedQ.put(i);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class Consumer_1 implements Runnable {
    private final LinkedBlockingQueue<Integer> sharedQ;

    public Consumer_1(LinkedBlockingQueue<Integer> integers) {
        this.sharedQ = integers;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Consumed::"+sharedQ.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
