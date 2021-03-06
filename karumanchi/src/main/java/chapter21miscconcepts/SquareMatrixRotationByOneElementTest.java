

package chapter21miscconcepts;
public class SquareMatrixRotationByOneElementTest {
	public static void main(String[] args) {
		SquareMatrixRotationByOneElement testIntance = new SquareMatrixRotationByOneElement();
		final int[][] input = new int[3][3];
	    input[0] = new int[]{1,2,3};
	    input[1] = new int[]{4,5,6};
	    input[2] = new int[]{7,8,9};
	    int n = input.length;
	    final int[][] result = testIntance.rotateByOneElementClockwise(input);
	    System.out.println("Input:");
	    for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
            	System.out.print(input[i][j] + "  ");
            	
            }
            System.out.println("  ");
	    }
	    System.out.println("Output:");
	    for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
            	System.out.print(result[i][j] + "  ");
            	
            }
            System.out.println("  ");
	    }
	}
}