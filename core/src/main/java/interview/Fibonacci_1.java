package interview;

/**
 * @author Dhiraj
 * @date 03/03/19
 */
public class Fibonacci_1 {
    public static void main(String[] args) {
        System.out.println();
        fibonacci(10);
    }
    private static void fibonacci(int n) {
        int first=0,second=1;
        int i=1;
        while (i<=n){
            System.out.print(first+" ");
            int sum=first+second;
            first=second;
            second=sum;
            i++;
        }
    }
}
