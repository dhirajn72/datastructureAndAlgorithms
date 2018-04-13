package com.java.core.thread.starvation;

/**
 * @author Dhiraj
 * @date 13/04/18
 */

/**
 * StarvationExample.java
 * This class is used to demonstrate starvation situation.
 * @author www.codejava.net
 */
public class StarvationExample {

    public static void main(String[] args) {
        final Worker worker = new Worker();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    worker.work();
                }
            }).start();
        }
    }
}