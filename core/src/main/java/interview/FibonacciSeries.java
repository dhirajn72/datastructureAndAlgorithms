package interview;

/**
 * @author Dhiraj
 * @date 10/12/18
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        fibo(10);
    }

    private static void fibo(int n) {
        System.out.print("Fibonacci of "+ n +" numbers are: ");
        int firstNumber=0,secondNumber=1;
        int i=1;
        while (i<=n){
            System.out.print(firstNumber+" ");
            int sum=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=sum;
            i++;
        }
    }
}
