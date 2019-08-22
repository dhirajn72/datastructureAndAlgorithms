package interview;

/**
 * @author Dhiraj
 * @date 15/07/19
 */
public class Permute {
    public static void main(String[] args) {
       // _permute("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        _permute("ABCD");

        _permute(new int[]{1,2,3});
    }

    private static void _permute(int[] ints) {
    }

    private static void _permute(String str) {
        _permute("",str);
    }

    private static void _permute(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i=0;i<str.length();i++)
                _permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
    }
}
