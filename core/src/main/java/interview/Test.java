package interview;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 12/12/18
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());


    }
}
