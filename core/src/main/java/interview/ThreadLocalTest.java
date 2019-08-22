package interview;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 25/03/19
 */
public class ThreadLocalTest {
    private static final Random RANDOM= new Random();
    private static final ThreadLocal<Integer> INTEGER_THREAD_LOCAL= new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            System.out.println("Randoms::::::"+Math.random());
            return (int)Math.random();
        }
    };
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(40);
        Stream.iterate(1,(seed)->seed)
                .limit(50)
                .forEach(seed->
                service.execute(()->{
                    getIds(RANDOM.nextInt(50)+1);
                    int num=INTEGER_THREAD_LOCAL.get();
                    System.out.println(Thread.currentThread().getId() +":"+Thread.currentThread().getName()+">> "+num);

                }));
        service.shutdown();
    }

    private static void  getIds(int num) {
        System.out.println(Thread.currentThread().getId()+">>>>set>"+num);
        INTEGER_THREAD_LOCAL.set(num);
    }
}
