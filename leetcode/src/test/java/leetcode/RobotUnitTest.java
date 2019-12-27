package leetcode;

import org.junit.Assert;
import org.junit.Test;
import session3.Robot;


/**
 * @author Dhiraj
 * @date 14/12/19
 */

public class RobotUnitTest {
    @Test
    public void case1(){
        Robot robot=new Robot();
        robot.destination("FF");
        Assert.assertArrayEquals(new int[]{0,2},robot.position());
    }
    @Test
    public void case2(){
        Robot robot=new Robot();
        robot.destination("FFFFFFFFF");
        Assert.assertArrayEquals(new int[]{0,9},robot.position());
    }
    @Test
    public void case3(){
        Robot robot=new Robot();
        robot.destination("RRFFLLFFF");
        Assert.assertArrayEquals(new int[]{0,1},robot.position());
    }
}
