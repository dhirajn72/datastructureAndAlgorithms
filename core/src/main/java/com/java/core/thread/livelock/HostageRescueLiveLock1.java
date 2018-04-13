package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class HostageRescueLiveLock1 {
    public static void main(String[] args) {
        final Police1 police= new Police1();
        final Criminal1 criminal= new Criminal1();


        new Thread(new Runnable() {
            @Override
            public void run() {
                police.giveRansome(criminal);

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                criminal.releaseHostage(police);
            }
        }).start();
    }
}
