package session2;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class FirstUniqueCharInString {

    public int firstUniqChar(String s) {
        if (s==null)return -1;
        int[] arr=new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        int index=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[s.charAt(i)]==1){
                index=i;
                break;
            }
        }
        return index;
    }
}
