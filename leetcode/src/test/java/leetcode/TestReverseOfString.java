package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class TestReverseOfString {
    @Test
    public void testCase1(){
        String result= ReverseWordsOfString.reverseWords("I am brilliant");
        Assert.assertEquals(result,"brilliant am I");
    }
    @Test
    public void testCase2(){
        String result= ReverseWordsOfString.reverseWordsWithStack("I am brilliant");
        Assert.assertEquals(result,"brilliant am I");
    }

}
