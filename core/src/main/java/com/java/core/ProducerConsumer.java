package com.java.core;

/**
 * @author Dhiraj
 * @date 03/06/19
 */
public class ProducerConsumer {

    private int data;
    private boolean flag;

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer_2 producer = new Producer_2(producerConsumer);
        Consumer_2 consumer = new Consumer_2(producerConsumer);

        new Thread(producer).start();
        new Thread(consumer).start();
    }

    public synchronized void produce(int data) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced: " + data);
        this.data = data;
        flag = true;
        notify();
    }

    public synchronized void consume() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data--);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
        notify();
    }
}

class Producer_2 implements Runnable {
    private ProducerConsumer producerConsumer;

    public Producer_2(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            producerConsumer.produce(i);
    }
}

class Consumer_2 implements Runnable {
    private ProducerConsumer producerConsumer;

    public Consumer_2(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            producerConsumer.consume();
    }
}


