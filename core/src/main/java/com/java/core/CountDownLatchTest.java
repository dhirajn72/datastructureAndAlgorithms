package com.java.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 06/05/19
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        int threadCount = 10;
        CountDownLatch latch = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(threadCount);

        try {
            //for (int i=0;i<5;i++){
                service.execute(()->{new TestClass_1().performTask(latch);});
          //  }
            latch.await();
            System.out.println("main is waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main terminates");
        service.shutdown();
    }
}


class TestClass_1 {
    private void m1() {
        System.out.println("m1() ->" + Thread.currentThread());

    }

    private void m2() {
        System.out.println("m2() ->" + Thread.currentThread());

    }

    private void m3() {
        System.out.println("m3() ->" + Thread.currentThread());
    }

    private void m4() {
        System.out.println("m4() ->" + Thread.currentThread());
    }

    private void m5() {
        System.out.println("m5() ->" + Thread.currentThread());

    }

    public void performTask(CountDownLatch latch) {

        try {
            m1();
            latch.countDown();
            Thread.sleep(500);
            m2();
            latch.countDown();
            Thread.sleep(500);
            m3();
            latch.countDown();
            Thread.sleep(500);
            m4();
            latch.countDown();
            Thread.sleep(500);
            m5();
            latch.countDown();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

