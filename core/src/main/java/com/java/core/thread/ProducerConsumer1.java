package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class ProducerConsumer1 {

    private int data;
    private boolean flag=false;

    public synchronized  void produce(int data){
        if (flag){
            try {
                wait(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced: "+data);
        flag=true;
        notify();
    }
    public synchronized void consume(){

        if (!flag){
            try {
                wait(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: "+this.data);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        flag=false;
        notify();
    }
}
