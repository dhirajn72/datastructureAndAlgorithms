package com.java.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 29/09/19
 */
public class TestReEntranceLocks {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(5);
        TestReentrancy ob=new TestReentrancy();
        for (int i = 0; i < 10; i++) {
            service.execute(()->ob.method1());
        }
        service.shutdown();

    }


}

class Super{
    public synchronized void method1(){
        System.out.println("lock1");
        //method2();
        /*TestReentrace t=new TestReentrace();
        t.method1();*/
        System.out.println("lock1 ends");
    }

}


class TestReentrancy extends Super{

    @Override
    public synchronized void method1(){
        System.out.println("lock1");
        //method2();
        TestReentrace t=new TestReentrace();
        t.method1();
        super.method1();
        System.out.println("lock1 ends");
    }
    public synchronized void method2(){
        System.out.println("lock2");
        method3();
        System.out.println("lock2 ends");
    }
    public synchronized void method3(){
        System.out.println("lock3");
        System.out.println("lock3ends");
    }
}

class TestReentrace{
    public synchronized void method1(){
        System.out.println("lock1");
        method2();
        System.out.println("lock1 ends");
    }
    public synchronized void method2(){
        System.out.println("lock2");
        method3();
        System.out.println("lock2 ends");
    }
    public synchronized void method3(){
        System.out.println("lock3");
        System.out.println("lock3ends");
    }

}
