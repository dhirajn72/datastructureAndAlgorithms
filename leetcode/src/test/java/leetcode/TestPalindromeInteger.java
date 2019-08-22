package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class TestPalindromeInteger {
    @Test
    public  void testCase1(){
        boolean result=PlindromeInteger.isPalindrome(122);
        Assert.assertEquals(false,result);
    }
    @Test
    public  void testCase2(){
        boolean result=PlindromeInteger.isPalindrome(121);
        Assert.assertEquals(true,result);
    }
}
