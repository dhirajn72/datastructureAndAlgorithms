package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        /*

        //start second thread after waiting for 2 seconds or if it's dead
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        t1.join();

        t2.start();
        /*

        //start third thread only when first thread is dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        t2.join();
        t3.start();

        //let all threads finish execution before finishing main thread
        /*try {
            *//*t1.join();
            t2.join();
            t3.join();*//*

           *//* t3.join();
            t2.join();
            t1.join();*//*

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t3.join();

        System.out.println("All threads are dead, exiting main thread");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
            //Thread.currentThread().join(); // Fuck !! Don't do this, its like going no where !
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }

}