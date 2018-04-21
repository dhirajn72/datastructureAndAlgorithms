package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 19/04/18
 */
public class Deadlock {

    private static final Object OB1= new Object();
    private static final Object OB2= new Object();



    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();

    }


    static class Thread1 implements Runnable{
        @Override
        public void run() {
            synchronized (OB1){
                System.out.println("Locked OB1, waiting for OB2");
                try {
                    Thread.sleep(500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (OB2){
                    System.out.println("Locked OB2, this will never execute");

                }
            }
        }
    }

    static class Thread2 implements  Runnable{
        @Override
        public void run() {
            synchronized (OB2){
                System.out.println("Locked OB2, waiting for OB1");
                synchronized (OB1){
                    System.out.println("Locked OB1, this will never execute");

                }
            }

        }
    }




}
