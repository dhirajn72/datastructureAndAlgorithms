package leetcode;

import java.util.HashMap;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class RemoveAlternateChars {

    public static void main(String[] args) {
        /*

        Input: “you got beautiful eyes”
        Output: ”you gtbeaiful es”
         */

        String str = "you got beautiful eyes";
        _removeDupsChars(str);


    }

    private static void _removeDupsChars(String str) {

        HashMap<Character, Character> map = new HashMap<>();
        String res = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (!map.containsKey(str.charAt(i))) {
                res+=str.charAt(i);
                map.put(str.charAt(i),str.charAt(i));
            }
        }
        System.out.println(str);
        System.out.println(res);
    }
}
