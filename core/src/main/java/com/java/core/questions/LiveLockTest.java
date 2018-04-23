package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class LiveLockTest {
    public static void main(String[] args) {
        final Police police= new Police();
        final Criminal criminal= new Criminal();

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                police.giveRansome(criminal);
            }
        });
        t1.start();
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                criminal.releaseHostage(police);
            }
        });
        t2.start();
    }
}
