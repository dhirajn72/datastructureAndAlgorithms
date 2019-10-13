package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 23/09/19
 */
public class ReverseStringRecursive {
    public static void main(String[] args) {
        String s="I am";
        System.out.println(_reverse(s));;
    }

    private static String _reverse(String s) {
        String[] arr=s.split(" ");
        return _reverse(arr,s.length());
    }

    private static String _reverse(String[] arr, int length) {
        if (arr.length==1)
            return arr[0];
        else {
            String[] remaining=new String[arr.length-1];
            for (int j = 1; j < arr.length; j++) {
                remaining[j-1]=arr[j];
            }
            return _reverse(remaining,remaining.length) +" "+arr[0];
        }
    }
}
