package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 07/03/18
 */
public class ProducerConsumer {

    private boolean flag=false;
    int value;

    public synchronized void produce(int data){
        if(flag){
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value=data++;
        System.out.println("Produced : "+value);
        flag=true;
        notify();
    }

    public synchronized void consume(){
        if(!flag){
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed : "+value--);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=false;
        notify();
    }
}
