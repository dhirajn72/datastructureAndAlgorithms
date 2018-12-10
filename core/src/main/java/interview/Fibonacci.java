package interview;

/**
 * @author Dhiraj
 * @date 09/12/18
 */
public class Fibonacci {
    public static void main(String[] args) {

        int maxNumber = 2, previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
        //System.out.println(sum);
    }

    //0,1,1,2,3,5


}
