package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 17/04/18
 */
public class Thread1 implements  Runnable {
    @Override
    public void run() {
            synchronized (this) {
                for(int i=1;i<50;i++) {
                System.out.println(Thread.currentThread().getName() + "::::" + i);
                /*if (i==30)
                    Thread.yield();*/
                //System.out.println(Thread.holdsLock(this));
            }
        }


    }
}
