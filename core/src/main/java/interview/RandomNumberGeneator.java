package interview;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 25/03/19
 */
public class RandomNumberGeneator {
    public static void main(String[] args) {

        oneWay();
        secondWay();
        thirdWay();
    }

    private static void secondWay() {
        Stream.iterate(1,x->x).limit(1)
                .forEach(x->{
                    Random random= new Random();
                    //System.out.println(random.nextInt(100));
                    random.ints(50,100).boxed().limit(50)
                            .forEach(System.out::println);
                });
    }

    private static void thirdWay() {
         ThreadLocalRandom.current().ints(20,100)
                 .boxed().limit(50)
                 .forEach(integer -> System.out.println(integer));
    }

    private static void oneWay() {
        Stream.iterate(1,x->x).limit(50)
                .forEach(x->{
                    double y=Math.random()*50;
                    System.out.println((int)y);
                });
    }
}
