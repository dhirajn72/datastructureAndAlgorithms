package session2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 08/09/19
 */
public class MiniumSizeSubArraySum {
    public static void main(String[] args) {
        //System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] arr) {
        if (arr==null)return 0;
        if (target>0 && arr.length==0)return 0;

        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length-1 ; i++) {
            List<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            int sum=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (sum<target){
                    sum+=arr[j];
                    list.add(arr[j]);
                }
                if (sum>target)break;
                if (sum==target){
                    System.out.println(list);
                    min=Math.min(min,list.size());
                    break;
                }
            }
        }
        return min;

        /*int res=Integer.MAX_VALUE,l=0,r=0,length=arr.length,temp=0;
        while(r<length){
            temp+=arr[r];
            while(l<=r&&temp>=target){
                temp-=arr[l];
                res=Math.min(r-l+1,res);
                l++;
            }
            r++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return res;
        }*/
    }
}
