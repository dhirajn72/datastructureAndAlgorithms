package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Police1 {
    private boolean moneySent=false;

    public void giveRansome(Criminal1 criminal){

        while(!criminal.isHostageReleased()){
            System.out.println("Police : waiting criminal to release hostage");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Police: Money Sent");
        this.moneySent=true;
    }

    public  boolean isMoneySent(){
        return moneySent;
    }
}
