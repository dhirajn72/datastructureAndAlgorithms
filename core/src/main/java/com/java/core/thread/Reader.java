package com.java.core.thread;

import java.util.Random;

/**
 * @author Dhiraj
 * @date 03/05/19
 */
public class Reader extends Thread {
    private ReadWriteList<Integer> sharedList;

    public Reader(ReadWriteList<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    public void run() {
        Random random = new Random();
        int index = random.nextInt(sharedList.size());
        Integer number = sharedList.get(index);

        System.out.println(getName() + " -> get: " + number);

        try {
            Thread.sleep(100);
        } catch (InterruptedException ie ) { ie.printStackTrace(); }

    }
}
