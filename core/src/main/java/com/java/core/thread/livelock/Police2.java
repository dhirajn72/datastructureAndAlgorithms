package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Police2 {
    private boolean moneySent=false;

    public void giveRansome(Criminal2 criminal){
        while (!criminal.isHostageReleased()){
            System.out.println("Police: waiting criminal to release hostage");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Police: Money sent");
        moneySent=true;
    }
    public boolean isMoneySent() {
        return moneySent;
    }
}
