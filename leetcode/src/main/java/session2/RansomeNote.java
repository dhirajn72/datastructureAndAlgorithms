package session2;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class RansomeNote {
    public static void main(String[] args) {
        /*

        canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
         */
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null && magazine == null) return false;
        if (ransomNote.length() > magazine.length()) return false;
        int[] chars = new int[128];
        for (int i = 0; i < magazine.length(); i++) {
            chars[magazine.charAt(i)] = chars[magazine.charAt(i)] + 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            chars[ransomNote.charAt(i)]=chars[ransomNote.charAt(i)] - 1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]<0)
                return false;
        }
        return true;
    }
}