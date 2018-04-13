package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1= Thread.currentThread();
        //MyThread myThread= new MyThread(t1);
        MyThread myThread= new MyThread(new Thread("MYTHREAD"));

        myThread.start();
        for (char ch='A';ch<'L';ch++){
            System.out.println(myThread.getName()+"\t"+ch);
            try {
                if (ch=='F')myThread.join();
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread{
    Thread main;

    public MyThread(Thread main) {
        this.main = main;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(getName()+ "\t"+i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}