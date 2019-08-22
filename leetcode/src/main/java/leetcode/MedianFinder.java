package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class MedianFinder {
    double[] arr ;
    int index;
    double sum;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        arr=new double[1000000];
        index=0;
        sum=0.0;
    }
    public void addNum(int num) {
        arr[index++]=num;
        sum+=num;
    }
    public double findMedian() {
        Arrays.sort(arr);
        if (index%2!=0){
            return arr[(index/2)];
        }

        System.out.println(sum/2);
        return sum/index;

    }
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1021);
        obj.addNum(9540);
        obj.addNum(7788);
        obj.addNum(9278);


        double param_2 = obj.findMedian(); // 7788.0
        System.out.println(param_2);
    }


}
