package interview;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class TestClass {
    public static void main(String[] args) {
        int x1=1;
        //Stream.generate(()->x).limit(100).forEach(System.out::println);
        Stream.iterate(1,(x)->++x).limit(100).forEach(System.out::println);



    }
}
