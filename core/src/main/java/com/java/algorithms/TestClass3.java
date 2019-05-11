package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class TestClass3 {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}


class Producer implements Runnable {
    private ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            producerConsumer.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            producerConsumer.consume();
        }
    }
}

class ProducerConsumer {
    private boolean flag = false;
    private int data;

    public synchronized void produce(int data) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("Produced::" + data);
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
        System.out.println("Consumed::" + this.data--);
        flag = false;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}