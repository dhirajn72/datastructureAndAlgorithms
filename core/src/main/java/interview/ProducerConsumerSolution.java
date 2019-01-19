package interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dhiraj
 * @date 16/01/19
 */


public class ProducerConsumerSolution {
    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<>();
        Producer1 p = new Producer1(sharedQ);
        Consumer1 c = new Consumer1(sharedQ);
        p.start();
        c.start();

    }
}

class Producer1 extends Thread {
    private BlockingQueue<Integer> sharedQueue;

    public Producer1(BlockingQueue<Integer> aQueue) {
        super("PRODUCER");
        this.sharedQueue = aQueue;
    }

    @Override
    public void run() { // no synchronization needed
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(getName() + " produced " + i);
                sharedQueue.put(i);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 extends Thread {
    private BlockingQueue<Integer> sharedQueue;

    public Consumer1(BlockingQueue<Integer> aQueue) {
        super("CONSUMER");
        this.sharedQueue = aQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = sharedQueue.take();
                System.out.println(getName() + " consumed " + item);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

