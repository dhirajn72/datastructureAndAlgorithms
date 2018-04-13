package com.java.core.thread.starvation;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class StarvationExample1 {
    public static void main(String[] args) {
        final Worker1 worker=new Worker1();

        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    worker.work();
                }
            }).start();
        }
    }
}
