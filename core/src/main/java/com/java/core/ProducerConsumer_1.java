package com.java.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 29/09/19
 */
public class ProducerConsumer_1 {
    public static void main(String[] args) {
        //ExecutorService service=Executors.newFixedThreadPool(2);
        ProdAndCons prodAndCons=new ProdAndCons();
        Prod prod=new Prod(prodAndCons);
        Cons cons=new Cons(prodAndCons);
        new Thread(prod).start();
        new Thread(cons).start();
    }

}

class Prod implements Runnable{
    ProdAndCons prodAndCons;

    public Prod(ProdAndCons prodAndCons) {
        this.prodAndCons = prodAndCons;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            prodAndCons.produce(i);
        }

    }
}

class Cons implements Runnable{
    ProdAndCons prodAndCons;

    public Cons(ProdAndCons prodAndCons) {
        this.prodAndCons = prodAndCons;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            prodAndCons.consume();
        }
    }
}



class ProdAndCons{
    private int data;
    private boolean flag;

    public synchronized void produce(int data){
        if (flag){
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced::"+data);
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
        System.out.println("Consumed::"+data);
        flag=false;
        notify();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}