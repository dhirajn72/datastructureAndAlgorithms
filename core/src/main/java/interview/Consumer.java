package interview;

/**
 * @author Dhiraj
 * @date 10/01/19
 */
public class Consumer implements Runnable {
    private ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
    }
    @Override
    public void run() {
        for (int i=1;i<10;i++)
            producerConsumer.consume();
    }
}
