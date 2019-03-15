package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 03/03/19
 */
public class FibonacciWithArray {
    public static void main(String[] args) {
        fibonacci(2);
    }

    private static void fibonacci(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int[] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.println(Arrays.toString(fibArray));
    }
}