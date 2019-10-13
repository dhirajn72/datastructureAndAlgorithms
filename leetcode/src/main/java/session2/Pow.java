package session2;

/**
 * @author Dhiraj
 * @date 22/09/19
 */
public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.10000, 3));
    }

    public static double myPow(double x, int n) {
        double res=x;
        while (n-->0){
            res*=x;
        }
        return res;
    }
}
