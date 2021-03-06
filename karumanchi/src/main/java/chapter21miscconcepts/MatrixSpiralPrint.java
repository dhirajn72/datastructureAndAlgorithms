
package chapter21miscconcepts;

public class MatrixSpiralPrint {
    public void Spiral(int[][]A, int m, int n) { 
        int rowStart=0, columnStart=0;      
        int rowEnd=m-1, columnEnd=n-1;  
        while(rowStart<=rowEnd && columnStart<=columnEnd) {
               int i=rowStart, j=columnStart;
               for(j=columnStart; j<=columnEnd; j++) System.out.print(" "+A[i][j]);
               for(i=rowStart+1, j--; i<=rowEnd; i++) System.out.print(" "+A[i][j]);
               for(j=columnEnd-1, i--; j>=columnStart; j--) System.out.print(" "+A[i][j]);
               for(i=rowEnd-1, j++; i>=rowStart+1; i--) System.out.print(" "+A[i][j]);
               rowStart++; columnStart++; rowEnd--; columnEnd--;
        }	
    }
}
