package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
class Resource {
    public static Map<Integer, String> bookList = new HashMap<>();

    static {
        bookList.put(1, "Operating System");
        bookList.put(2, "Discrete maths");
        bookList.put(3, "ADA");
        bookList.put(4, "System Engineering");
        bookList.put(5, "C");
        bookList.put(6, "Java");

    }
}
