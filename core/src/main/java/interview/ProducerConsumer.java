package interview;

/**
 * @author Dhiraj
 * @date 10/01/19
 */
public class ProducerConsumer {

    private boolean flag=false;
    private int data;

    public synchronized void produce(int data){
        if (flag){
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.data=data;
        System.out.println("Produced: "+this.data);
        flag=true;
        notify();
    }

    public synchronized void consume(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumed: "+this.data);
        flag=false;
        notify();
    }
}