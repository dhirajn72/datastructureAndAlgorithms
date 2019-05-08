package interview;

import java.util.Collection;

/**
 * @author Dhiraj
 * @date 31/03/19
 */
public abstract class Stream implements Collection {
    public static void main(String[] args) {


    }
    public void doStuff(){
        Collection.super.stream().forEach(System.out::println);

    }
}
