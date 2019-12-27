package session3;

/**
 * @author Dhiraj
 * @date 17/12/19
 */
public class FindMaxFromString {
    public static void main(String[] args) {
        String s = "87929399199919392959677";//99877765332211, 99999999999877765332211
        System.out.println(getMax(s));
    }

    private static String getMax(String s) {
        if (s == null) return null;
        char[] ch = s.toCharArray();

        String zero = "", one = "", two = "", three = "", four = "", five = "", six = "", seven = "", eight = "", nine = "";

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            switch (c) {
                case '0':
                    zero += "0";
                    break;
                case '1':
                    one += "1";
                    break;
                case '2':
                    two += "2";
                    break;
                case '3':
                    three += "3";
                    break;
                case '4':
                    four += "4";
                    break;
                case '5':
                    five += "5";
                    break;
                case '6':
                    six += "6";
                    break;
                case '7':
                    seven += "7";
                    break;
                case '8':
                    eight += "8";
                    break;
                case '9':
                    nine += "9";
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nine).append(eight).append(seven).append(six).append(five)
                .append(four).append(three).append(two).append(one).append(zero);

        return sb.toString();
    }
}
