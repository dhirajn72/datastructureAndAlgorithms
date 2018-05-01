package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class Task1 implements  Runnable{

    @Override
    public void run() {
        for (int i=0; i<5;i++){
            System.out.println(Thread.currentThread().getName()+">>>>"+ThreadSafeStringBuilder.getInstance().hashCode());
            StringBuilder builder=ThreadSafeStringBuilder.getInstance();
            builder.append(Thread.currentThread().getName()+"****"+i);
            System.out.println(builder);
        }
    }
}
