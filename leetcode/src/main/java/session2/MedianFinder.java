package session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/09/19
 */
public class MedianFinder {

    public static void main(String[] args) {
        MedianFinder obj=new MedianFinder();
        obj.addNum(6);
        obj.addNum(10);
        obj.addNum(2);
        obj.addNum(6);
        obj.addNum(5);
        System.out.println(obj.findMedian());

        /*


Input
["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
[[],[6],[],[10],[],[2],[],[6],[],[5],[],[0],[],[6],[],[3],[],[1],[],[0],[],[0],[]]
Output
[null,null,6.0,null,8.0,null,10.0,null,6.0,null,2.0,null,4.0,null,6.0,null,5.5,null,5.0,null,2.5,null,0.0]
Expected
[null,null,6.0,null,8.0,null,6.0,null,6.0,null,6.0,null,5.5,null,6.0,null,5.5,null,5.0,null,4.0,null,3.0]


         */


        System.out.println(obj.findMedian());
    }

    List<Integer> integers=new ArrayList<>();
    /**
     * initialize your data structure here.
     */
    public MedianFinder() {

    }

    public void addNum(int num) {
        integers.add(num);

    }
    public double findMedian() {
        int mid=integers.size();
        if (mid==2)return (((double)(integers.get(0)+integers.get(1)))/2);
        Collections.sort(integers);
        if (mid%2==0){
            int index=(mid/2)-1;
            int first=integers.get(index);
            return ((double) (first+integers.get(index+1)))/2;
        }
        else {
            return integers.get(mid/2);
        }
    }
}
