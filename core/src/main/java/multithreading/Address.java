package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dhiraj
 * @date 24/12/19
 */
public class Address {
    Lock lock=new ReentrantLock();
    public  void getEmployeeAddress(){

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" enters getEmployeeAddress()");
        boolean flag=true;
        lock.lock();
        while (flag) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getState()+" in Address");
                System.out.println(Thread.currentThread().getName());
                System.out.println(lock.tryLock());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" exits");
    }
}
