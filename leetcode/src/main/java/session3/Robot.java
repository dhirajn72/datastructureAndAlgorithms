package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 14/12/19
 */
public class Robot {
    private int x;
    private int y;
    private int position;

    public static void main(String[] args) {
        Robot robot = new Robot();
        //robot.destination("FF");
        //robot.destination("LRRFFFRL");
        //robot.destination("LFFFRFFFRRFFF");
        robot.destination("FFFFFFFFF");
        System.out.println(Arrays.toString(robot.position()));
    }

    public void destination(String directions) {
        char[] moves = directions.toCharArray();
        for (char ch : moves) {
            if (ch == 'R')
                position = position + 1;
            if (ch == 'L')
                position = position - 1;
            if (ch == 'F') {
                if (position == 0) {
                    y = y + 1;
                }
                if (position == 1) {
                    x = x + 1;
                }
                if (position == 2) {
                    y = y - 1;
                }
                if (position == 3) {
                    x = x - 1;
                }
            }
        }
    }

    public int[] position() {
        return new int[]{x, y};
    }
}
