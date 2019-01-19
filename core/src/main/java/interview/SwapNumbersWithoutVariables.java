package interview;

/**
 * @author Dhiraj
 * @date 18/01/19
 */
public class SwapNumbersWithoutVariables {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+" "+b);
        /*a=a+b; //30
        b=a-b;//10
        a=a-b;//20*/

        a = a ^ b; // XOR operation
        b = a ^ b; // XOR operation
        a = a ^ b; // XOR operation
        System.out.println(a+" "+b);
    }
}
