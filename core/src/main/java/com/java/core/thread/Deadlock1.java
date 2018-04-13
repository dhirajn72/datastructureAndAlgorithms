package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Deadlock1 {
    private final static Object ob1= new Object();
    private final static Object ob2=new Object();

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
    static class Thread1 implements  Runnable{
        @Override
        public void run() {
            synchronized (ob1){
                System.out.println("Locked Object1 waiting for object2");
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (ob2){
                 System.out.println("Locked object2");
                }
            }
        }
    }
    static class Thread2 implements  Runnable{
        @Override
        public void run() {
            synchronized (ob2){
                System.out.println("Locked Object2 waiting for object1");
                synchronized (ob1){
                    System.out.println("Locked Object1");
                }
            }
        }
    }
}
