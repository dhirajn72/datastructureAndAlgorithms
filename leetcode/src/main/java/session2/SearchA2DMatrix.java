package session2;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] ints={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(ints,50));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result=false;
        for (int[] ints:matrix){
            result= _search(ints,target);
            if (result)return result;
            else continue;
        }
        return result;
    }

    private static boolean _search(int[] ints, int target) {
        return _binarySearch(ints,0,ints.length-1,target);
    }
    private static boolean _binarySearch(int[] ints, int low, int high, int target) {
        if (low<=high){
            int mid=(low+high)/2;
            if (ints[mid]==target)
                return true;
            else if (ints[mid]>target)
               return  _binarySearch(ints,low,mid-1,target);
            else if (ints[mid]<target)
               return  _binarySearch(ints,mid+1,high,target);
            else
                return false;
        }
        return false;
    }
}
