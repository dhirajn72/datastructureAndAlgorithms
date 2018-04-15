package com.java.core.LTI.questions;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Questions {
    public static void main(String[] args) throws Exception {
        A a = new A();
        Thread t= new Thread(a,"A");
        Thread t1= new Thread(a,"B");
        t.start();
        t.join();
        t1.start();

    }
}
class  A implements  Runnable{

    @Override
    public void run() {
        try {
            for (int i=0;i<4;i++){
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }

        }catch (InterruptedException e){

        }
    }
}