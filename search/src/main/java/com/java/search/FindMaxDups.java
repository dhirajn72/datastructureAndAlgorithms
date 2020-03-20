package com.java.search;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class FindMaxDups {
    public static void main(String[] args) {
        System.out.println(_findDupsInArray(new int[]{/*9,8,7,6,5,4,3,*/2, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }

    /*private static boolean _findDupsInArray(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        boolean flag=false;
        int count=1;
        for (int i:arr){
            if (map.containsKey(i)){
                int inc=map.get(i);
                map.put(i,++inc);
            }else {
                map.put(i,count);
            }
        }
        System.out.println(map);


        return flag;
    }*/

    private static boolean _findDupsInArray(int[] arr) {
        int[] hash=new int[arr.length];
        int count=0;
        for (int i:arr) {
            if (hash[i]==0)
                hash[i]++;
            else
                hash[i]++;
        }
        for (int i:arr)
            if (hash[arr[i]]>1)
                System.out.println("Duplicates are:"+arr[i]+"::" +arr[i]);
        return false;
    }
}
