package interview;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class TestAnagram {
    static char[] chars;
    static int size;
    public static void main(String[] args) {
        String str="ABC";
        chars=str.toCharArray();
        size=str.length();
        _doAnagram(str.length()-1);
    }

    private static void _doAnagram(int size) {
        if (size==1)
            return;
        for (int j=0;j<size;j++){
            _doAnagram(size-1);
            if (size==2)
                displayWord();
            rotate(size);
        }
    }
    private static void displayWord() {
        for (int i=0;i<chars.length;i++)
            System.out.print(chars[i]);
        System.out.println();
    }

    private static void rotate(int newsize) {
        int j;
        int position=size-newsize;
        char temp=chars[position];
        for (j=position+1;j<size;j++)
            chars[j-1]=chars[j];
        chars[j-1]=temp;
    }
}
