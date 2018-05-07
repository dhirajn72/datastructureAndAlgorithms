package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class HostageRescueLiveLock3 {
    public static void main(String[] args) {
        Police3 police= new Police3();
        Criminal3 criminal= new Criminal3();

        new Thread(new Runnable() {
            @Override
            public void run() {
                police.giveRansome(criminal);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                criminal.hostageReleased(police);
            }
        }).start();
    }
}
