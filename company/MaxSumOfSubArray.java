package com.company;

public class MaxSumOfSubArray {

    static int MaxSumOfSubArray(int[] arr){

        int n = arr.length;
        int max = arr[0];
        int maxEnd = arr[0];

        for(int i=1;i<n;i++){
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            max = Math.max(max, maxEnd);
        }

        return max;
    }

    public static  void main(String[] args){
        int[] arr = {1 ,1 ,2 ,-3 ,1};

        System.out.println(MaxSumOfSubArray(arr));
    }
}
