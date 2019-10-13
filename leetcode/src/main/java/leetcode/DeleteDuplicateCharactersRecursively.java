package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 09/09/19
 */
public class DeleteDuplicateCharactersRecursively {
    public static void main(String[] args) {

        System.out.println(removeDups("azxxzb".toCharArray()));

    }

    private static String removeDups(char[] chars) {

        if (chars.length==1)
            return "n";
        else {
            int j=0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i]==chars[j]) {
                    chars[j] = '\0';
                    j++;
                }
                else {
                    char[] remainings= Arrays.copyOfRange(chars,1,chars.length);
                    return removeDups(remainings);
                }
            }
        }
        return null;
    }
}
