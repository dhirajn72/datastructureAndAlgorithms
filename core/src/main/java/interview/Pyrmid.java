package interview;

/**
 * @author Dhiraj
 * @date 17/12/18
 */
public class Pyrmid {
    public static void main(String[] args) {
        int n = 10;
        pringtPyramid(n);
    }

    private static void pringtPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j=n-i;j>1;j--)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
