package session3;

/**
 * @author Dhiraj
 * @date 07/11/19
 */
public class ReverseStringRecursively {
    public static void main(String[] args) {
        String str="I am dhiraj kumar singh from aurangabad";
        String res=_reverse(str);
        System.out.println(res);
    }

    private static String _reverse(String str) {
        String[] strings=str.split(" ");
        return _reverse(strings);
    }

    private static String _reverse(String[] strings) {
        if (strings.length==1)
            return strings[0];
        else {
            String[] tempArr=new String[strings.length-1];
            for (int i = 1; i < strings.length; i++) {
                tempArr[i-1]=strings[i];
            }
            return _reverse(tempArr)+" "+strings[0];
        }
    }
}
