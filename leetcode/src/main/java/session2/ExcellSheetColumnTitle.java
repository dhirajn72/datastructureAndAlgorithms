package session2;

/**
 * @author Dhiraj
 * @date 03/09/19
 */
public class ExcellSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(500));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder columnName = new StringBuilder();
        while (columnNumber > 0) {
            int rem = columnNumber % 26;
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            } else {
                columnName.append((char) ((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
        return columnName.reverse().toString();
    }
}
