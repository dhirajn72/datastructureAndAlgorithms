package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class RelativeSortArray {

    public static void main(String[] args) {

        int[] arr1 = {28, 6, 22, 8, 44, 17};// {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {22, 28, 8, 6}; //{2, 1, 4, 3, 9, 6};


        relativeSortArray(arr1, arr2);
    }


    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Queue<Integer> integers = new LinkedList<>();
        for (int i : arr2) {
            map2.put(i, 1);
        }
        for (int i : arr1) {
            if (!map2.containsKey(i))
                integers.add(i);
        }
        int indx = 0;
        int[] arrNonMatched = new int[integers.size()];
        for (int i : integers)
            arrNonMatched[indx++] = i;
        Arrays.sort(arrNonMatched);
        integers.clear();
        for (int i:arrNonMatched)
            integers.add(i);

        for (int element : arr1) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, ++count);
            } else {
                map.put(element, 1);
            }
        }
        int index = 0;
        for (int element : arr2) {
            int count = map.get(element);
            while (count > 0) {
                arr1[index++] = element;
                count--;
            }
        }

        while (!integers.isEmpty())
            arr1[index++] = integers.remove();
        return arr1;
    }

}
