package interview;

/**
 * @author Dhiraj
 * @date 04/03/19
 */
public class Pyramid_1 {
    public static void main(String[] args) {
        printPyramid(5);
    }

    private static void printPyramid(int n) {

        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--)
                System.out.print(" ");
            for (int j=1;j<=i+1;j++)
                //System.out.print("*");
                System.out.print(j+i);

            System.out.println();
        }


    }
}
