package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dhiraj
 * @date 24/12/19
 */
public class Employee {
    Lock lock=new ReentrantLock();

    public  void getEmployee(Address address){

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" enters getEmployee()");
        boolean flag=true;
        lock.lock();
        while (flag) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getState()+" in Employee");

                address.getEmployeeAddress();
                System.out.println(Thread.currentThread().getState()+" in Employee");
                System.out.println(Thread.currentThread().getName());
                System.out.println(lock.tryLock()+" in employee");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" exits");
    }
}
