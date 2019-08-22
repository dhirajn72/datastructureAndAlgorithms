package dynamicprogramming.gfg;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class UglyNumber {

    /* Driver program to test above functions */
    public static void main(String args[]) {
        int n = 7;
        UglyNumber obj = new UglyNumber();
        System.out.println(obj.getNthUglyNo(0));
    }

    private int getNthUglyNo(int n) {
        if (n==0)return 1;
        int[] arr=new int[n];
        int i2=0,i3=0,i5=0;
        int m2=2,m3=3,m5=5;
        arr[0]=1;
        int uglyNumber=1;
        for (int i=1;i<n;i++){
            uglyNumber=Math.min(m2,Math.min(m3,m5));
            arr[i]=uglyNumber;
            if (uglyNumber==m2) {
                i2 = i2 + 1;
                m2=arr[i2]*2;
            }
            if (uglyNumber==m3){
                i3=i3+1;
                m3=arr[i3]*3;
            }
            if (uglyNumber==m5){
                i5=i5+1;
                m5=arr[i5]*5;
            }
        }
        return arr[n-1];
    }

    /*int getNthUglyNo(int n) {
        int ugly[] = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        int next_multiple_of_2 = 2;
        int next_multiple_of_3 = 3;
        int next_multiple_of_5 = 5;
        int next_ugly_no = 1;

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            next_ugly_no = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));

            ugly[i] = next_ugly_no;
            if (next_ugly_no == next_multiple_of_2) {
                i2 = i2 + 1;
                next_multiple_of_2 = ugly[i2] * 2;
            }
            if (next_ugly_no == next_multiple_of_3) {
                i3 = i3 + 1;
                next_multiple_of_3 = ugly[i3] * 3;
            }
            if (next_ugly_no == next_multiple_of_5) {
                i5 = i5 + 1;
                next_multiple_of_5 = ugly[i5] * 5;
            }
        } *//*End of for loop (i=1; i<n; i++) *//*
        return next_ugly_no;
    }*/

}
