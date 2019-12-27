package session3;

/**
 * @author Dhiraj
 * @date 30/11/19
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(7));

    }

    public static String countAndSay(int n) {
        if (n==1)return "1";
        if (n==2)return "11";
        if (n==3)return "21";
        int i=4;

        int count=1;
        String result="";
        StringBuilder sb=new StringBuilder("21"); // 5-111221 6-312211 7-13112221
        while (i<=n){
            StringBuilder sb2=new StringBuilder();
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j-1)==sb.charAt(j)) {
                    count++;
                }
                else {
                    sb2.append(count).append(sb.charAt(j-1));// 1112
                    count=1;
                }
            }
            sb2.append(count).append(sb.charAt(sb.length()-1));
            sb=sb2;
            result=sb2.toString();
            count=1;
            i++;
        }
        return result;
    }

}
