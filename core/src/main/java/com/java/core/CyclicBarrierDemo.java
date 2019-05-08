package com.java.core;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 06/05/19
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int workingThreads=10;
        TestClass t=new TestClass();
        CyclicBarrier barrier= new CyclicBarrier(workingThreads);
        ExecutorService service= Executors.newFixedThreadPool(workingThreads);
        while (workingThreads>0){
            service.submit(()->{t.performTask(barrier);});
            workingThreads--;
        }
        System.out.println("main terminated");
        service.shutdown();

    }
}


class TestClass {
    private void m1() {
        System.out.println("m1() ->"+Thread.currentThread());

    }

    private void m2() {
        System.out.println("m2() ->"+Thread.currentThread());

    }

    private void m3() {
        System.out.println("m3() ->"+Thread.currentThread());
    }

    private void m4() {
        System.out.println("m4() ->"+Thread.currentThread());
    }

    private void m5() {
        System.out.println("m5() ->"+Thread.currentThread());

    }

    public void performTask(CyclicBarrier barrier){
        try {
            m1();
            barrier.await();
            m2();
            barrier.await();
            m3();
            barrier.await();
            m4();
            barrier.await();
            m5();
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
