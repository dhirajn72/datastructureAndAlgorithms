package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class Police {
    private boolean isMoneySent=false;

    public void giveRansome(Criminal criminal){
        while (!criminal.isHostageReleased()){
            try {
                Thread.sleep(500);
                System.out.println("Money has not been sent !");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(" Money sent!");
        isMoneySent=true;
    }
    public boolean isMoneySent(){
        return isMoneySent;
    }


}
