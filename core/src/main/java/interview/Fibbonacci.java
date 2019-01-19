package interview;

/**
 * @author Dhiraj
 * @date 18/01/19
 */
public class Fibbonacci {
    public static void main(String[] args) {
        fibo(1);
    }

    private static void fibo(int n) {
        System.out.print("Fibo of "+n +" numbers are:" );
        int fnumber=0,snumber=1,i=1;
        while (i<=n){
            System.out.print(fnumber+" ");
            int sum=fnumber+snumber;
            fnumber=snumber;
            snumber=sum;
            i++;
        }
    }
}
