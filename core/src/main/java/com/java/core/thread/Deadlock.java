package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 06/03/18
 */
public class Deadlock  extends Thread{
    public static  Object OBJECT1= new Object();
    public static  Object OBJECT2= new Object();

    public static void main(String[] args) {

        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }

    public static class Thread1 implements Runnable{
        public void run() {
            synchronized (OBJECT1){
                System.out.println("Locked Object1 waiting for object2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (OBJECT2){
                    System.out.println("Got Object 2");
                }
            }
        }
    }
    public static class Thread2 implements  Runnable{
        public void run() {
            synchronized (OBJECT2){
                System.out.println("Locked Object2 waiting for object1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (OBJECT1){
                    System.out.println("Got Object 1");
                }
            }
        }
    }
}
