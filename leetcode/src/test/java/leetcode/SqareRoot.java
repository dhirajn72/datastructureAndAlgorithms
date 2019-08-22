package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class SqareRoot {

    @Test
    public void testCase1(){
        int result=SquareRoot.squareRoot(5);
        Assert.assertEquals(result,-1);
    }
    @Test
    public void testCase2(){
        int result=SquareRoot.squareRoot(4);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testCase3(){
        int result=SquareRoot.squareRoot(25);
        Assert.assertEquals(result,5);
    }


    @Test
    public void testCase4(){
        int result=SquareRoot.squareRoot(26);
        Assert.assertEquals(result,-1);
    }

    @Test
    public void testCase6(){
        int result=SquareRoot.squareRoot(0);
        Assert.assertEquals(result,-1);
    }
    @Test
    public void testCase7(){
        int result=SquareRoot.squareRoot(-1);
        Assert.assertEquals(result,-1);
    }
    @Test
    public void testCase8(){
        int result=SquareRoot.squareRoot(8100);
        Assert.assertEquals(result,90);
    }
}
