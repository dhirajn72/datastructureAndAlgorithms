package interview;

/**
 * @author Dhiraj
 * @date 03/03/19
 */
public class FibbonacciRecursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int n) {
        if (n==0)return 0;
        if (n==1)return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
