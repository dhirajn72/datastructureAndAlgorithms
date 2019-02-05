package interview;

import com.java.utils.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 02/02/19
 */
public class QuickSort_1 {
    public static void sort(int[] arr,int low,int high){
        int i=low,j=high,temp;
        int pivot=arr[(low+high)/2];
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j)
            sort(arr,low,j);
        if (i>high)
            sort(arr,i,high);
    }

    public static void main(String[] args) {

        int[] arr= DataUtils.getArray();
        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
