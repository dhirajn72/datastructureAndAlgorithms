package com.java.core;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class ProdCons {
    private int data;
    private boolean flag=false;

    public synchronized void produce(int data){
        if (!flag){
            this.data=data;
            System.out.println("Produced::"+data);
        }
        flag=true;
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();

    }
    public synchronized void consume(){
        if (flag){
            System.out.println("Consumed::"+data);
        }
        flag=false;
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Main starts");
        ProdCons prodCons=new ProdCons();
        Thread prod=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                prodCons.produce(i);
            }
        });
        prod.start();
        Thread cons=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                prodCons.consume();
            }
        });
        cons.start();
        System.out.println("main ends");
    }
}
