package cci;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class StringWithUniqueChars {
    public static void main(String[] args) {
        String s1="abceafg";
        _findDups(s1);
        _findDupsAnotherWay(s1);


    }

    private static void _findDupsAnotherWay(String s1) {
        char[] chars= s1.toCharArray();
        boolean[] booleans= new boolean[128];
        for (char c:chars){
            if (booleans[c]){
                System.out.println("Found dups>>"+c);
                break;
            }
            else {
                booleans[c]=true;
            }
        }
    }

    public static void _findDups(String s1) {
        char[] chars= s1.toCharArray();
        int[] ints= new int[128];
        for (char c:chars)
            ints[c]++;
        for (char c:chars){
            if (ints[c]>1){
                System.out.println("Found dups::"+c);break;
            }
        }
    }
}
