package interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 22/12/18
 */
public class BrokenSingleton {
    private static Object object = null;

    public static Object getObject() {
        if (object == null)
            synchronized (BrokenSingleton.class) {
               if (object == null) {
                    object = new Object();
                    System.out.println(object);
                }
            }
        return object;
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(50);
        int n = 50;
        while (n != 0) {
            service.submit(() -> System.out.println(Thread.currentThread().getId() + " " + BrokenSingleton.getObject()));
            n--;
        }
        service.shutdown();


    }
}
