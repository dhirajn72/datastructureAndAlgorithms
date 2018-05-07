package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Police3 {

    private boolean ransomeGiven=false;

    public void giveRansome(Criminal3 criminal){
        while (!criminal.isHostageReleased()){
            System.out.println("Money not sent !!");
            try {
                Thread.sleep(500);

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("Money has been sent!!");
        ransomeGiven=true;
    }
    public boolean isRansomeGiven() {
        return ransomeGiven;
    }
}
