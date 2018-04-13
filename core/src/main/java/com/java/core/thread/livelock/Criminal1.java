package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Criminal1 {
    private boolean hostageReleased=false;

    public void releaseHostage(Police1 police){
        while(!police.isMoneySent()){
            System.out.println("Criminal : waiting police to give ransom");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Criminal : Hostage released");
        this.hostageReleased=true;
    }
    public boolean isHostageReleased(){
        return hostageReleased;
    }
}
