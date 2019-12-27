package session3;

/**
 * @author Dhiraj
 * @date 30/11/19
 */
public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println();
        _reverseRecursive(123);
    }

    private static void  _reverseRecursive(int n) {
        if (n<10){
            System.out.println(n);
            return;
        }
        else {
            System.out.print(n%10);
            _reverseRecursive(n/10);
        }
    }

}
