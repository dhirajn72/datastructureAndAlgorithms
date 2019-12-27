package session3;

/**
 * @author Dhiraj
 * @date 12/12/19
 */
public class CountUp {

    public static void main(String[] args) {
        countUp(0,5);
    }

    static void countUp(int start, int end) {
        if (start<=end){
            System.out.println(start);
            countUp(++start,end);
        }
    }
}
