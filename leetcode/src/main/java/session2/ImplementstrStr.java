package session2;

/**
 * @author Dhiraj
 * @date 16/09/19
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("mississippi","issip"));


    }

    public static int strStr(String haystack, String needle) {
        if (haystack==null||needle==null)return 0;
        if (needle.length()>haystack.length())return -1;
        if (needle.length()==0 && haystack.length()>0)return 0;
        if (haystack.equals(needle))return 0;
        int i=0;
        int j=haystack.length()-1;
        boolean flag=false;
        while (i<=j){
            if (haystack.charAt(i)!=needle.charAt(0)) {
                i++;
            }
            else{



            }
        }
        return flag?i:-1;
    }
}
