package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Criminal2 {
    private boolean hostageReleased=false;

    public void hostageReleased(Police2 police){

        while (!police.isMoneySent()){
            System.out.println("Criminal: waiting for money from police");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Criminal: Hostage released");
        hostageReleased=true;
    }
    public boolean isHostageReleased() {
        return hostageReleased;
    }
}