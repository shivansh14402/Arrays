package com.company;

public class maxCircularSubArray {
    static int MaxCircularSum(int[] arr){
        int n = arr.length;
        int res = arr[0];
        for(int i=0;i<n;i++){
            int currSum = arr[i];
            int currMax = arr[i];
            for(int j =1; j<n;j++){
                int index = (i+j)%n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(currMax, res);
        }
        return res;
    }

    static int maxNormal(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int maxEnd = arr[0];

        for(int i=1;i<n;i++){
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);
            max = Math.max(max, maxEnd);
        }

        return max;
    }
    static int MaxCircularSum2(int[] arr){

        int normalSum = maxNormal(arr);
        if(normalSum<0){
            return normalSum;
        }
        int n = arr.length;
        int arrSum = 0;

        for(int i=0;i<n;i++){
            arrSum += arr[i];
            arr[i] = -arr[i];
        }

        int res = arrSum + maxNormal(arr);

        res = Math.max(res, normalSum);

        return res;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        //MaxCircularSum2(arr);
        System.out.println(MaxCircularSum(arr));
        System.out.println(MaxCircularSum2(arr));
    }
}
