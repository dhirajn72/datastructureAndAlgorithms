package session3;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-1563847412));
    }
    public static int reverse(int x) {
        if (x==Integer.MIN_VALUE)return 0;
        long result=0;
        while (x!=0){
            result=result*10;
            result=result+(x%10);
            x=x/10;
        }
        if (result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)return 0;
        return (int) result;
    }
}
