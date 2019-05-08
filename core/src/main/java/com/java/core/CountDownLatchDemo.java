package com.java.core;

import java.util.concurrent.CountDownLatch;

/**
 * @author Dhiraj
 * @date 06/05/19
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {
        //CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl = new CountDownLatch(4);

        // Initializing three threads to read 3 different files.
        Thread t1 = new Thread(new FileReader("thread-1", "file-1", cdl));
        Thread t2 = new Thread(new FileReader("thread-2", "file-2", cdl));
        Thread t3 = new Thread(new FileReader("thread-3", "file-3", cdl));

        t1.start();
        /*t2.start();
        t3.start();
        new Thread(new FileReader("thread-3", "file-3", cdl)).start();*/
        try {
            // main thread waiting till all the files are read
            cdl.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Files are read ... Start further processing");
    }

}

class FileReader implements Runnable {
    private String threadName;
    private String fileName;
    private CountDownLatch cdl;

    FileReader(String threadName, String fileName, CountDownLatch cdl) {
        this.threadName = threadName;
        this.fileName = fileName;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        //System.out.println("Reading file " + fileName + " thread " + threadName);
        // do countdown here
        //cdl.countDown();

        //For SIngle threaded make sure countdown call should be equal to the created latch number
        for (int i=0;i<3;i++) {
            System.out.println("Reading file " + fileName + " thread " + threadName);
            cdl.countDown();
        }

    }
}
