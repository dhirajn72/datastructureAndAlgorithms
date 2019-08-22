package leetcode;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class PrintWithoutLoop {
    public static void main(String[] args) {
        _print(100);
    }

    private static void _print(int i) {
        if (i<1)return;
        _print(i-1);
        System.out.println(i);
    }
}
