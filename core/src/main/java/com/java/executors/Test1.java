package com.java.executors;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 07/03/18
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        final ArrayList<String> strings= new ArrayList<String>();
        ExecutorService executorService= Executors.newFixedThreadPool(100000);
        System.out.println(Thread.currentThread().getId()+":"+Thread.currentThread().getName());
        executeSeparate(strings,executorService);
        executorService.shutdown();
    }

    private synchronized static void executeSeparate(final ArrayList strings,ExecutorService executorService) {

        //Thread.currentThread().wait(30);
        executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Before : "+new Date());
                for(int i=0;i<=20000000;i++){
                    strings.add("Object"+i);
                    //System.out.println(Thread.currentThread().getId()+":"+Thread.currentThread().getName());
                }
                System.out.println("Done !!!!!!!!!");
                System.out.println("After : "+new Date());
            }
        });
    }
}
