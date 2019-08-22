package leetcode;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class UglyNumber_1 {
    public static void main(String[] args) {
        int n=10;
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x==0)
            System.out.print("It is an ugly number.");
        System.out.print("\n");
    }
}
