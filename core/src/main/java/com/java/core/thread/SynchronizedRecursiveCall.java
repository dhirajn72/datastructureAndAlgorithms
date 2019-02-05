package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 19/01/19
 */
public class SynchronizedRecursiveCall {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        RecursiveTest test= new RecursiveTest();
        service.submit(()-> {
            try {
                test.doSomething();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        service.submit(()->test.doSomething());
        service.shutdown();


    }
}

class  RecursiveTest{
    public synchronized void doSomething(){
        System.out.println("doSomething!"+Thread.currentThread().getId());
        doSomething();
    }
}
