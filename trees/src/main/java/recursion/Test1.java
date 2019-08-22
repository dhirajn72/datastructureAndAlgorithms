package recursion;

/**
 * @author Dhiraj
 * @date 15/07/19
 */
public class Test1 {
    public static void main(String[] args) {
        // 1,3,6,10,15,21. . .  keep on adding next number
        _triangle(500000000);
    }

    private static int _triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            int temp = n + (_triangle(n - 1));
            System.out.println("Returning::" + temp);
            return temp;
        }
    }

}
