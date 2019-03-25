package com.java.core.questions;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
class Task implements Runnable{

    @Override
    public void run() {

        for(int i=0; i<2; i++){
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: " + ThreadLocalTest.threadSafeFormat(new Date()) );
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}