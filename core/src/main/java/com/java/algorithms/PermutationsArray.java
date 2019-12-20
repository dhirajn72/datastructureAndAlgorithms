package com.java.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/10/19
 */
public class PermutationsArray {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));

    }

    public static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> res=new ArrayList<>();
        _permute(arr,0,res);
        return res;

    }

    private static void _permute(int[] arr, int i,List<List<Integer>> res) {

        if (i==arr.length){
            List<Integer> integers=new ArrayList<>();
            for (int e:arr) {
                integers.add(e);
            }
            res.add(integers);

        }
        else {
            for (int j = i; j < arr.length; j++) {
                swap(i,j,arr);
                _permute(arr,i+1,res);
                swap(i,j,arr);
            }
        }

    }

    private static void swap(int i, int j, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
