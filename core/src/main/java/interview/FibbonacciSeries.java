package interview;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

/**
 * @author Dhiraj
 * @date 02/03/19
 */
public class FibbonacciSeries {
    public static void main(String[] args) throws IOException {
        Instant start=Instant.now();
       // System.out.println(fibbonacci(50));
        fibbonacci(5000);
        Instant end=Instant.now();
        System.out.println();
        System.out.println("*****");
        System.out.println(Duration.between(start,end).toMillis());
    }

    private static void fibbonacci(int n) throws IOException {
        BigInteger first=new BigInteger("0");
        BigInteger second=new BigInteger("1");
        int i=1;
        System.out.println("Fibbonacci of "+n +" numbers are::");
        File file=new File("output.txt");
        FileWriter fileWriter= new FileWriter(file);
        while (i<=n){
            //fileWriter.write(String.valueOf(first));
            //fileWriter.write(" ");

            BigInteger sum=first.add(second);
            System.out.println(sum);
            first=second;
            second=sum;
            i++;
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
/*
5
0 1 1 2 3

 */