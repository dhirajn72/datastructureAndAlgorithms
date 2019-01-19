package com.java.core;

import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 04/10/18
 */
public class ScheduledTaskDemo {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        /*service.scheduleWithFixedDelay(() -> {
            System.out.println("done::" + Thread.currentThread().getName() + "::" + Instant.now());
        }, 1, 1, TimeUnit.SECONDS);*/
        service.scheduleAtFixedRate(() -> {
            System.out.println("done::" + Thread.currentThread().getName() + "::" + Instant.now());
        }, 1, 1, TimeUnit.SECONDS);
    }
}
