package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        /*System.out.println(canPartition(new int[]{1,2,5})); //f
        System.out.println(canPartition(new int[]{1, 5, 11, 5})); //t
        System.out.println(canPartition(new int[]{1, 2, 3, 5}));//f*/

        System.out.println(canPartition(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100}));
    }

    public static boolean canPartition(int[] arr) {
        if (arr==null||arr.length==0)return false;
        int sum=0;
        List<Integer> list=new ArrayList<>();
        for (int i:arr) {
            sum += i;
            list.add(i);
        }
        if (sum%2!=0)return false;
        int half=sum/2;
        boolean[] booleans= new boolean[1];
       // _partition(list,half,new ArrayList<Integer>(),booleans);
        _partition(list,half,new int[arr.length],booleans);

        return booleans[0];
    }

    private static void  _partition(List<Integer> numbers, int target,int[] partition,boolean[] booleans) {
        int sum=0;
        for (int i:partition)
            sum+=i;
        if (sum==target) {
            booleans[0]=true;
            return;
        }
        if (sum>target)
            return ;
        for (int i = 0; i <numbers.size() ; i++) {
            if (booleans[0])break;
            ArrayList<Integer> remaining= new ArrayList<>();
            int n=numbers.get(i);
            for (int j = i+1; j <numbers.size() ; j++) {
                remaining.add(numbers.get(j));
            }
            //ArrayList<Integer> partia_res= new ArrayList<>(partition);
            int[] partia_res= Arrays.copyOf(partition,partition.length+1);

            partia_res[partia_res.length-1]=n;
            _partition(remaining,target,partia_res,booleans);
        }
    }
}
