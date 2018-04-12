package com.java.core;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Deadlock {

    private static Object object1= new Object();
    private static Object object2= new Object();

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
    public static class Thread1 implements  Runnable{
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("Locked "+object1+" waiting for :"+object2);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2){
                    System.out.println("Locked "+object2); // This will never execute
                }
            }
        }
    }
    public static class Thread2 implements  Runnable{
        @Override
        public void run() {
            synchronized (object2){
                System.out.println("Locked "+object2+" waiting for :"+object1);
                synchronized (object1){
                    System.out.println("Locked "+object1); // This will never execute

                }
            }
        }
    }
}