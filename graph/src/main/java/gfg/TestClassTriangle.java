package gfg;

/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class TestClassTriangle {
    public static void main(String[] args) {
        printTriangle(10);
    }

    private static void printTriangle(int n) {
        for (int i=0;i<n;i++){
            for (int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
