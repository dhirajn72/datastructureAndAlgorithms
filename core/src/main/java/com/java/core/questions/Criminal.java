package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class Criminal {

    private boolean isHostageReleased=false;

    public synchronized void releaseHostage( Police police){
        while (!police.isMoneySent()){
            try {
                Thread.sleep(500);
                System.out.println("Hostage has not been released !");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Hostage release");
        isHostageReleased=true;
    }

    public boolean isHostageReleased(){
        return isHostageReleased;
    }


}
