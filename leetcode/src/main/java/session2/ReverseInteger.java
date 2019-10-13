package session2;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ReverseInteger {
    public static void main(String[] args) {
        //reverse(-123);
        reverseRecursive(-123);
    }

    public static int reverse(int n) {
        int reverse=0;
        int x=n;
        while (x>=1){
            reverse=reverse*10;
            reverse=reverse+x%10;
            x=x/10;
        }
        return reverse;
    }
    public static void reverseRecursive(int x) {
        if (x<10){
            System.out.println(x);
            return;
        }
        else {
            System.out.println(x%10);
            reverseRecursive(x/10);
        }
    }
}
