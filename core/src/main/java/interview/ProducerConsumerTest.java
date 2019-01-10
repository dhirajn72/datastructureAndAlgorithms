package interview;

/**
 * @author Dhiraj
 * @date 10/01/19
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer=new ProducerConsumer();
        new Thread(new Producer(producerConsumer)).start();
        new Thread(new Consumer(producerConsumer)).start();
    }
}
