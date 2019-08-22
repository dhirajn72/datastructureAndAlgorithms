package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 26/07/19
 */
public class Pow {
    public static void main(String[] args) {
        System.out.println(_pow(2,8));
    }

    private static float _pow(float n, int power) {

        float number=n;
        for (int i=2;i<=power;i++)
            number*=n;
        return power<0 ? -number:number;
    }
}
