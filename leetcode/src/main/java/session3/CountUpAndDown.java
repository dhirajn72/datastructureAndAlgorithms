package session3;

/**
 * @author Dhiraj
 * @date 12/12/19
 */
public class CountUpAndDown {
    public static void main(String[] args) {
        countUpAndDown(0, 5);
    }

    static void countUpAndDown(int start, int end) {
        // All code exercise code should go here
        if (start <= end) {
            int next = start + 1;
            System.out.println(start);
            countUpAndDown(next, end);
            if (start != end)
                System.out.println(start);
        }
    }
}
