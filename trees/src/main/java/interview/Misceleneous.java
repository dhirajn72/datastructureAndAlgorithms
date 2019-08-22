package interview;

/**
 * @author Dhiraj
 * @date 25/07/19
 */
public class Misceleneous {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        _power(2,3);

    }
    private static void _power(int n, int times) {
        int sum=n;
        for (int i=2;i<=times;i++){
            sum*= n;
        }
        System.out.println(sum);

    }
}
