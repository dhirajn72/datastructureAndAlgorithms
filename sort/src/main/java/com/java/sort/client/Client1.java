package com.java.sort.client;

import com.java.sort.BubbleSort_2;
import com.java.sort.MergeSort;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 03/05/18
 */
public class Client1 {
    public static void main(String[] args) {
        //int[] arr= new int[]{98,87,10,32,31,43,56,1,5,28};
        int[] arr= new int[]{81,12,72};
        //BubbleSort bubbleSort= new BubbleSort();
        //BubbleSort1 bubbleSort1= new BubbleSort1();
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr)));
        //System.out.println(Arrays.toString(bubbleSort1.bubbleSort(arr)));
        System.out.println("****");
        System.out.println(Arrays.toString(arr)); // This is already sorted at this point by bubble sort.
        //SelectionSort selectionSort= new SelectionSort();
        //SelectionSort1 selectionSort1= new SelectionSort1();
        //System.out.println(Arrays.toString(selectionSort.selectionSort(arr)));
        //System.out.println(Arrays.toString(selectionSort1.selectionSort(arr)));
        //InsertionSort insertionSort= new InsertionSort();
        //System.out.println(Arrays.toString(insertionSort.insertionSort(arr)));
        MergeSort mergeSort= new MergeSort();
        //int[] temp=new int[]{};
        //mergeSort.mergeSort(arr,arr,0,arr.length-1);
        //mergeSort.sort(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        //QuickSort quickSort= new QuickSort();
        //quickSort.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //QuickSort2 quickSort2= new QuickSort2();
        //System.out.println(Arrays.toString(quickSort2.quickSort(arr)));
        arr=BubbleSort_2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
