package com.java.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dhiraj
 * @date 20/06/19
 */
public class TestMultithreading {

    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(50);
        AtomicInteger count=new AtomicInteger();


        while (count.incrementAndGet()< 1000){
            service.execute(()-> {
                System.out.println(Thread.currentThread().getName());
            });
        }


        /*Stream.iterate(1, (x)->++x).limit(10000)
                .collect(Collectors.toList())
                .parallelStream()
                .forEach(System.out::println);*/

        service.shutdown();
        System.out.println(">>>>>>>>>>>>>>>.main ends");
        System.out.println(">>>>>>>>>>>>>>>.main ends");
    }

}
