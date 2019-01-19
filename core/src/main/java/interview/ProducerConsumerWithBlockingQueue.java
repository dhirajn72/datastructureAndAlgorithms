package interview;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dhiraj
 * @date 17/01/19
 */
public class ProducerConsumerWithBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue sharedQ= new LinkedBlockingQueue();
        Producer_A producer= new Producer_A(sharedQ);
        Consumer_A consumer= new Consumer_A(sharedQ);
        //producer.start();
        //consumer.start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
class Producer_A implements Runnable {
    //class Producer_A extends Thread {

    private LinkedBlockingQueue sharedQ;
    public Producer_A(LinkedBlockingQueue linkedBlockingQueue) {
        this.sharedQ = linkedBlockingQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                sharedQ.put(i);
                System.out.println("Produced::" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer_A implements Runnable{
    //class Consumer_A extends Thread{

    private LinkedBlockingQueue sharedQ;
    public Consumer_A(LinkedBlockingQueue linkedBlockingQueue) {
        this.sharedQ = linkedBlockingQueue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Consumed::" + sharedQ.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
