package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class TestQuickSort {
    @Test
    public void testCase1(){
        int[] arr1=new int[]{9,8,7,5,6,6,3,4,5};
        int[] arr2=new int[]{9,8,7,5,6,6,3,4,5};
        QuickSort._sort(arr1);

        Arrays.sort(arr2);
        Assert.assertArrayEquals(arr1,arr2 );
    }
}
