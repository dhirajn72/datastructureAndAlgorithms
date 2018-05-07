package com.java.core.thread.livelock;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Criminal3 {
    private boolean hostageReleased=false;

    public void hostageReleased(Police3 police){
        while (!police.isRansomeGiven()){
            System.out.println("Hostage not released !!");
            try {
                Thread.sleep(500);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Hostage has been released !!");
        hostageReleased=true;
    }

    public boolean isHostageReleased() {
        return hostageReleased;
    }
}
