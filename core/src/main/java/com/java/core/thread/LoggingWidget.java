package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 19/01/19
 */
public class LoggingWidget extends Widget  {

    @Override
    public synchronized void doSomething() {
        System.out.println("LoggingWidget-doSomething()"+Thread.currentThread().getId());
        super.doSomething();
        //super.doSomethingMore();
    }

    public static void main(String[] args) {
        LoggingWidget widget= new LoggingWidget();
        ExecutorService service= Executors.newFixedThreadPool(4);
        service.submit(()->{widget.doSomething();});
        service.submit(()->widget.doSomethingMore());
        service.submit(()->widget.doSomething());
        service.submit(()->widget.doSomething());

        service.shutdown();
    }
}
