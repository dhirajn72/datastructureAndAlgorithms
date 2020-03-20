package com.karumanchi;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,1,5,6};
        System.out.println(_largestRectangle(arr));
    }

    private static int _largestRectangle(int[] arr) {
            int[] spans = new int[arr.length];
            int span=1;
            int item=0;
            int max=0;
            for (int i=0;i<arr.length;i++){
                if (i==0)
                    spans[i]=span;
                else {
                    span=0;
                    for (int j=i;j>=0;j--){
                        if (arr[i]>=arr[j]) {
                            item=arr[i];
                            span++;
                        }
                    }
                    for (int k=i;k<arr.length-1;k++) {
                        if (arr[i] >= arr[k + 1]) {
                            span++;
                        }
                    }
                    if ((span-1)*item>max) {
                        max = (span - 1) * item;
                        span=0;
                    }

                }
                System.out.println(max);
            }
            return 0;
        }
    }
