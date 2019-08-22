package dynamicprogramming.karumanchi;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class FactorialMemoized {
    static int n = 5;
    static int[] facto = new int[n  +1];
    public static void main(String[] args) {
        System.out.println(_factorial(n));
    }
    private static int _factorial(int n) {
        if (n == 1)
            return 1;
        else if (n == 0)
            return 1;
        else if (facto[n] != 0)
            return facto[n];
        else
            return facto[n] = n * _factorial(n - 1);
    }
}
