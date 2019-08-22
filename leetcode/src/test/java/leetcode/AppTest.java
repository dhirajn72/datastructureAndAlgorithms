package leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public static void main(String[] args) {
        Result result= JUnitCore.runClasses(TestSuit.class);
        result.getFailures()
                .stream()
                .forEach(x-> System.out.println(x));
        if (result.wasSuccessful())
            System.out.println("All test cases were successfull !");
    }
}
