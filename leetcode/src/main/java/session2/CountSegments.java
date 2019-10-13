package session2;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class CountSegments {

    public int countSegments(String s) {
        if (s==null)return -1;
        String[] arr=s.split(" ");
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>max)
                max=arr[i].length();
        }
        return max;
    }
}
