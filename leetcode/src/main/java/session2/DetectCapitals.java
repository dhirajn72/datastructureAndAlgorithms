package session2;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class DetectCapitals {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("ggg"));
    }
    public static boolean detectCapitalUse(String word) {
        if (word==null)return false;
        if (word.isEmpty())return false;
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i)>=65 && word.charAt(i)<=90)){
                return false;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i)>=97 && word.charAt(i)<=122)){
                return false;
            }
        }
        return true;
    }
}
