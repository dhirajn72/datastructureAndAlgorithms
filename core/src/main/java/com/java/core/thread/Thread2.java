package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"::::"+i);
                System.out.println(Thread.holdsLock(this));
            }
        }


    }
}
