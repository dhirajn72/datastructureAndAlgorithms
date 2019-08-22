package interview;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class MultiplyStrings {

    public static void main(String[] args) {
        System.out.println(multiply("4","9"));

    }

    public static String multiply(String num1, String num2) {
        return String.valueOf(Integer.valueOf(num1)*Integer.valueOf(num2));

    }
}
