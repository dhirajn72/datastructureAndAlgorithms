package interview;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dhiraj
 * @date 12/01/19
 */

public class Join {

    public static void main(String args[]) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " is Started");

        Thread t1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is Started");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is Completed");
            } catch (InterruptedException ex) {
                Logger.getLogger(Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is Started");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is Completed");
            } catch (InterruptedException ex) {
                Logger.getLogger(Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is Started");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is Completed");
            } catch (InterruptedException ex) {
                Logger.getLogger(Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        t1.setName("Thread one ");
        t2.setName("Thread two");
        t3.setName("Thread three ");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        //t2.start();
        t2.join();
        //t3.start();
        t3.join();
        System.out.println(Thread.currentThread().getName() + " is Completed");
    }

}