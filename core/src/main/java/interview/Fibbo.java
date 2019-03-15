package interview;

/**
 * @author Dhiraj
 * @date 06/03/19
 */
public class Fibbo {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int n) {

        if (n==0) return 0;
        if (n==1) return 1;
        int first=0,second=1;
        int i=1;
        while (i<=n){
            System.out.print(first+ ", ");
            int sum= first+second;
            first=second;
            second=sum;
            i++;
        }
        System.out.println();
        System.out.println("*******");
        return first;
    }
}
