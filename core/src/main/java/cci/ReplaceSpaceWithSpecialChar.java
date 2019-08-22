package cci;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class ReplaceSpaceWithSpecialChar {
    public static void main(String[] args) {
        String s= "Mr Smith Holmes   ";
        _replaceSpaceWithSpecialChar(s);
        _replaceSpaceWithSpecialCharAnotherWay(s);

    }

    private static void _replaceSpaceWithSpecialCharAnotherWay(String s) {
        char[] chars= s.trim().toCharArray();
        StringBuilder builder= new StringBuilder();
        for (char c:chars){
            if (c==' ')
                builder.append("%20");
            else builder.append(c);
        }
        System.out.println(builder);
    }

    private static void _replaceSpaceWithSpecialChar(String s) {
        s=s.trim();
        s=s.replace(" ","%20");
        System.out.println(s);
    }
}
