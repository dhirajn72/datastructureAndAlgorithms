package interview;

/**
 * @author Dhiraj
 * @date 16/12/18
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number=54321;
        reverseMethod(number);
    }
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseMethod(number/10);
        }
    }
}
