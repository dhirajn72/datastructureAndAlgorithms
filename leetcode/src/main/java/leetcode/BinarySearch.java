package leetcode;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class BinarySearch {
    public static boolean _binarySearchRecursive(int[] arr, int key) {
        return _searchRecursive(arr, key, 0, arr.length - 1);
    }

    private static boolean _searchRecursive(int[] arr, int key, int low, int high) {
        if (arr == null || arr.length == 0) return false;
        else {
            if (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == key)
                    return true;
                if (key > arr[mid])
                    return _searchRecursive(arr, key, mid + 1, high);
                else
                    return _searchRecursive(arr, key, low, mid - 1);
            }
        }
        return false;
    }


    public static boolean _binarySearch(int[] arr, int key) {
        if (arr == null || arr.length == 0) return false;
        else {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (key == arr[mid])
                    return true;
                else if (key > arr[mid])
                    low = mid + 1;
                else high = mid - 1;
            }
            return false;
        }
    }
}
