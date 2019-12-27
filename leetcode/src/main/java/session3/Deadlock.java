package session3;

/**
 * @author Dhiraj
 * @date 18/12/19
 */
public class Deadlock {
    static Object ob1 = new Object();
    static Object ob2 = new Object();

    public static void main(String[] args) {
        System.out.println("main starts!!");
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        new Thread(a).start();
        new Thread(b).start();
        System.out.println("main ends !!");
    }

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            synchronized (ob1) {
                System.out.println("Locked ob1::");
                synchronized (ob2) {
                    System.out.println("This will never execute in m1()");

                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            synchronized (ob2) {
                System.out.println("Locked ob2");
                synchronized (ob1) {
                    System.out.println("This will never execute in m2()");
                }
            }
        }
    }
}
