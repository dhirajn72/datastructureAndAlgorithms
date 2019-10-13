package session2;

/**
 * @author Dhiraj
 * @date 20/09/19
 */
public class AddBinary {
    /*

    Input: a = "11", b = "1"
Output: "100"
     */

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));

    }
    public static String addBinary(String a, String b) {

        StringBuilder sb=new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while (i>=0 && j>=0){
            if (a.charAt(i)=='1' && b.charAt(j)=='1'){
                sb.insert(0,a.charAt(i)-b.charAt(j));
                carry=1;
            }
            else if (a.charAt(i)=='1' && b.charAt(j)=='0'){

                System.out.println();
            }

            i--;
            j--;

        }
        if (carry>0)
            sb.insert(0,carry);
        System.out.println(sb);
        return null;
    }
}
