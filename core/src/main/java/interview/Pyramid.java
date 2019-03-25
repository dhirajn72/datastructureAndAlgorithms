package interview;

/**
 * @author Dhiraj
 * @date 08/12/18
 */
public class Pyramid {
    public static void main(String[] args) {
        int n = 10;
        printStars(n);

    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*public static void printStars(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

   /* public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
}
