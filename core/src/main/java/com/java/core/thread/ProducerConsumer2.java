package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class ProducerConsumer2 {

    private int data;
    private boolean flag=false;

    public synchronized void produce(int data){

        if (flag){
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced:::"+data);
        try {
            Thread.sleep(500);
        }catch ( InterruptedException e){
            e.printStackTrace();
        }
        flag=true;
        notify();
    }

    public synchronized void consume(){
        if (!flag){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed:::"+this.data--);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        flag=false;
        notify();
    }
}
