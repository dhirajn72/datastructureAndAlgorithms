package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 11/02/20
 */
public class ProducerConsumerTest1 {
    public static void main(String[] args) {
        System.out.println("main starts");
        ProducerAndConsumer producerAndConsumer=new ProducerAndConsumer();
        Producer_1 producer=new Producer_1(producerAndConsumer);
        Consumer_1 consumer=new Consumer_1(producerAndConsumer);
        /*new Thread(producer).start();
        new Thread(consumer).start();*/
        System.out.println("main ends");
    }
}

class ProducerAndConsumer{
    private int data;
    private boolean flag;

    public synchronized void produce(int data){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced :: "+data);
        flag=true;
        notify();
    }
    public synchronized void consume(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumed :: "+data);
        flag=false;
        notify();
    }
}


class Producer_1 implements Runnable{
    private ProducerAndConsumer producerAndConsumer;

    public Producer_1(ProducerAndConsumer producerAndConsumer) {
        this.producerAndConsumer = producerAndConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            producerAndConsumer.produce(i);
        }
    }
}


class Consumer_1 implements Runnable{
    private ProducerAndConsumer producerAndConsumer;

    public Consumer_1(ProducerAndConsumer producerAndConsumer) {
        this.producerAndConsumer = producerAndConsumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            producerAndConsumer.consume();
        }
    }
}


