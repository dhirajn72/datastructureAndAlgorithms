package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class HostageRescueLiveLock2 {
    static final Police2 police= new Police2();
    static final Criminal2 criminal= new Criminal2();
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                police.giveRansome(criminal);
            }
        });
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                criminal.hostageReleased(police);
            }
        });
        t2.start();
    }
}
