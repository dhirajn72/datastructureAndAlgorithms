package com.java.core;

/**
 * @author Dhiraj
 * @date 06/05/19
 */
public class ProducerConsumerTest {

    public static void main(String[] args) {
        DoStuff doStuff= new DoStuff();
        Producer producer= new Producer(doStuff);
        Consumer consumer= new Consumer(doStuff);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}


class Producer implements Runnable{
    private DoStuff doStuff;

    public Producer(DoStuff doStuff) {
        this.doStuff = doStuff;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            doStuff.produce(i);

    }
}
class Consumer implements Runnable{
    private DoStuff doStuff;

    public Consumer(DoStuff doStuff) {
        this.doStuff = doStuff;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            doStuff.consume();


    }
}

class DoStuff{
    private int data;
    private boolean flag=false;

    public synchronized void produce(int data){
        if (flag){
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced:: "+data);
        flag=true;
        notify();
    }
    public synchronized void consume(){
        if (!flag){
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed ::"+data--);
        flag=false;
        notify();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}