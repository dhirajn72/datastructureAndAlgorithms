package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class ProducerConsumer3 {

    private boolean flag=false;
    private int data;

    public synchronized void produce(int data){
        if (flag){
            try {
                wait(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced ::"+data);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        flag=true;
        notify();
    }

    public synchronized  void consume(){
        if (!flag){
            try {
                wait(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed::"+data--);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        flag=false;
        notify();
    }
}
