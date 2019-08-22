package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dhiraj
 * @date 07/08/19
 */


public class TestBinaryPositive {
    int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int key = 5;

    @Test
    public void testBinarySearchIterative() {
        boolean result = BinarySearch._binarySearch(arr, key);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testbinarySearchRecursive() {
        boolean result = BinarySearch._binarySearchRecursive(arr, key);
        Assert.assertEquals(true, result);
    }
}
