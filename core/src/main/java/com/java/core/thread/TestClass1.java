package com.java.core.thread;

/**
 * @author Dhiraj
 * @date 03/06/19
 */
public class TestClass1 {
    public static void main(String[] args) {
        TestClass1 t=new TestClass1();
        t.threadTest();
    }

    public  void threadTest() {
        try {
            //wait();
            Thread.sleep(500);
            Class obj=  Class.forName("com.java.core.thread.TestClass1");
            System.out.println(obj.newInstance());
            System.out.println(obj.newInstance());
            System.out.println(obj.newInstance());

        } catch (InterruptedException |ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}


