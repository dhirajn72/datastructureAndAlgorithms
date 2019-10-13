package leetcode;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class HeapSort {
    public static void main(String[] args) {

        int[] arr={8,7,4,5,6,3,4,2,4,5,6};
        HeapMin heap=new HeapMin(arr.length);
        for (int e:arr)
            heap.insert(e);
        int i=arr.length-1;
        while (i>=0){
            System.out.print(heap.remove()+", ");
            i--;
        }
    }
}
