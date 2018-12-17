package com.java.core.questions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class ArrayEquality {
    public static void main(String[] args) {

        int[] arr1={2,4,3,6,1,8,9,10};
        int[] arr2={2,4,3,6,1,8};
        //boolean result= areEquals(arr1,arr2);
        //System.out.println(result);
        System.out.println(IntStream.of(arr1).boxed().collect(Collectors.summingInt(x->x)) -IntStream.of(arr2).boxed().collect(Collectors.summingInt(x->x)));

        int res=IntStream.of(arr2).boxed().collect(Collectors.summingInt(x->x));
        System.out.println(res);

        Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);

        Stream.of(1).mapToInt(x->x);

    }

    public static boolean areEquals(int[] arr1,int[] arr2){
        if (arr1.length!=arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0 ;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return  false;
            }
        }
        return true;
    }


}



