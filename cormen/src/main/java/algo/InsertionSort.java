package algo;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,1,3,6,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int key,i;
        for (int j=1;j<arr.length;j++){
            key=arr[j];
            i=j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
    }

    /*private static void sort(int[] arr) {
        int i,j,v;
        for (i=1;i<arr.length;i++){
            v=arr[i];
            j=i;
            while (j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;
        }
    }*/
}
