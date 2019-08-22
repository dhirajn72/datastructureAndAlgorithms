package leetcode;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class FindKthLargestElement {
    public static void main(String[] args) {
        //int[] arr= {3,2,1,5,6,4};
        //System.out.println(findKthLargest(arr,2));
        int[] arr={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,100));

    }

    public static int findKthLargest(int[] arr, int k) {
        if(arr==null||arr.length==0)return 0;
        if (arr.length<k)return -1;
        Heap_delete1 heap= new Heap_delete1(arr.length);
        for (int i:arr)
            heap.insert(i);
        int res=0;
        while (k-->=1)
            res=heap.remove();
        return res;
    }
}
